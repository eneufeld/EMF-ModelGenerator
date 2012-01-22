/*******************************************************************************
 * Copyright (c) 2008-2011 Chair for Applied Software Engineering,
 * All rights reserved. This program and the accompanying materials are made available under the terms of the Eclipse
 * Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * Contributors:
 ******************************************************************************/
package org.eclipse.emf.emfstore.modelmutator.test;

import java.io.IOException;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.emfstore.common.CommonUtil;
import org.eclipse.emf.emfstore.common.model.ModelElementId;
import org.eclipse.emf.emfstore.common.model.Project;
import org.eclipse.emf.emfstore.common.model.impl.ProjectImpl;
import org.eclipse.emf.emfstore.common.model.util.SerializationException;

/**
 * The helper method for the tests.
 * @author Stephan Köhler
 * @author Eugen Neufeld
 * @author Philip Achenbach
 *
 */
public class ModelMutatorHelper {
	
	/**
	 * URI used to serialize EObject with the model util.
	 */
	public static final URI VIRTUAL_URI = URI.createURI("virtualUri");

	/**
	 * Contains the canonical names of classes which will be ignored.
	 */
	private static Set<String> ignoredDataTypes;

	private static HashMap<Object, Object> resourceSaveOptions;


	 /**
	 * Converts an EObject to a String.
	 * 
	 * @param object
	 *            the eObject
	 * @return String representation of the EObject
	 * @throws SerializationException
	 *             if a serialization problem occurs
	 */
	public static String eObjectToString(EObject object) throws SerializationException {
		boolean containmentCheckEnabled = false;
		boolean hrefCheckEnabled = false;
		boolean proxyCheckEnabled = false;

		IConfigurationElement[] elements = Platform.getExtensionRegistry().getConfigurationElementsFor(
			"org.eclipse.emf.emfstore.common.model.serializationoptions");
		if (elements != null && elements.length > 0) {
			hrefCheckEnabled = Boolean.parseBoolean(elements[0].getAttribute("HrefCheck"));
			proxyCheckEnabled = Boolean.parseBoolean(elements[0].getAttribute("ProxyCheck"));
			containmentCheckEnabled = Boolean.parseBoolean(elements[0].getAttribute("SelfContainmentCheck"));
		}

		return eObjectToString(object, !containmentCheckEnabled, !hrefCheckEnabled, !proxyCheckEnabled);
	}
	/**
	 * Converts an {@link EObject} to a {@link String}.
	 * 
	 * @param object
	 *            the {@link EObject}
	 * @param overrideContainmentCheck
	 *            if true, no containment check is performed
	 * @param overrideHrefCheck
	 *            checks whether there is a <code>href</code> in the serialized
	 *            text
	 * @param overrideProxyCheck
	 *            if true, proxy check is ignored
	 * @return String representation of the {@link EObject}
	 * @throws SerializationException
	 *             if a serialization problem occurs
	 */
	public static String eObjectToString(EObject object, boolean overrideContainmentCheck, boolean overrideHrefCheck,
		boolean overrideProxyCheck) throws SerializationException {
		if (object == null) {
			return null;
		}

		XMIResource res = (XMIResource) (new ResourceSetImpl()).createResource(VIRTUAL_URI);

		EObject copy;
		if (object instanceof Project) {
			Project project = (Project) object;
			Project copiedProject = (Project) clone(object);

			for (ModelElementId modelElementId : project.getAllModelElementIds()) {
				if (isIgnoredDatatype(project.getModelElement(modelElementId))) {
					continue;
				}
				res.setID(copiedProject.getModelElement(modelElementId), modelElementId.getId());
			}
			res.getContents().add(copiedProject);
			copy = copiedProject;
		} else {
			copy = EcoreUtil.copy(object);
			res.getContents().add(copy);
		}

		if (!overrideContainmentCheck && !(copy instanceof EClass)) {
			if (!CommonUtil.isSelfContained(copy) || !CommonUtil.isContainedInResource(copy, res)) {
				throw new SerializationException(copy);
			}
		}

		int step = 200;
		int initialSize = step;
		if (object instanceof Project) {
			Project project = (Project) object;
			initialSize = project.getAllModelElements().size() * step;
		}
		if (!overrideProxyCheck) {
			proxyCheck(res);
		}

		StringWriter stringWriter = new StringWriter(initialSize);
		try {
			res.save(stringWriter, getResourceSaveOptions());
		} catch (IOException e) {
			e.printStackTrace();
			throw new SerializationException(e);
		}
		String result = stringWriter.toString();

		if (!overrideHrefCheck) {
			hrefCheck(result);
		}
		return result;
	}
	
	/**
	 * @param result
	 */
	private static void proxyCheck(Resource resource) throws SerializationException {
		EcoreUtil.resolveAll(resource);
		TreeIterator<EObject> contents = resource.getAllContents();
		while (contents.hasNext()) {
			EObject eObject = contents.next();
			if (eObject.eIsProxy()) {
				throw new SerializationException("Serialization failed due to unresolved proxy detection.");
			}
		}
	}

	private static void hrefCheck(String result) throws SerializationException {
		char[] needle = "href".toCharArray();
		int pointer = 0;
		boolean insideQuotes = false;
		for (char character : result.toCharArray()) {
			if (character == '"') {
				insideQuotes = !insideQuotes;
			}
			if (!insideQuotes && character == needle[pointer]) {
				if (++pointer == needle.length) {
					throw new SerializationException("Serialization failed due to href detection.");
				}
			} else {
				pointer = 0;
			}
		}
	}
	
	/**
	 * Determines whether the type of an EObject is an ignored one.
	 * 
	 * @param eObject
	 *            the EObject which is to be checked
	 * @return true, if the EObject will be ignored, false otherwise
	 */
	public static boolean isIgnoredDatatype(EObject eObject) {
		if (ignoredDataTypes == null) {
			ignoredDataTypes = new HashSet<String>();
			IConfigurationElement[] config = Platform.getExtensionRegistry().getConfigurationElementsFor(
				"org.eclipse.emf.emfstore.common.model.ignoredatatype");
			for (IConfigurationElement extension : config) {
				String className = extension.getAttribute("type");
				ignoredDataTypes.add(className);
			}
		}

		return ignoredDataTypes.contains(eObject.eClass().getInstanceClassName());
	}
	
	/**
	 * Delivers a map of mandatory options for saving resources.
	 * 
	 * @return map of options for {@link XMIResource} or {@link XMLResource}.
	 */
	public static Map<Object, Object> getResourceSaveOptions() {
		if (resourceSaveOptions == null) {
			resourceSaveOptions = new HashMap<Object, Object>();
			resourceSaveOptions.put(XMLResource.OPTION_USE_ENCODED_ATTRIBUTE_STYLE, Boolean.TRUE);
		}
		return resourceSaveOptions;
	}
	
	/**
	 * Clone any EObject.
	 * 
	 * @param <T>
	 *            the Eobject sub type
	 * @param eObject
	 *            the Eobject instance
	 * @return a clone of the Eobject instance
	 */
	@SuppressWarnings("unchecked")
	public static <T extends EObject> T clone(T eObject) {
		if (eObject instanceof ProjectImpl) {
			return (T) ((ProjectImpl) eObject).copy();
		}
		EObject clone = EcoreUtil.copy(eObject);
		return (T) clone;
	}
}
