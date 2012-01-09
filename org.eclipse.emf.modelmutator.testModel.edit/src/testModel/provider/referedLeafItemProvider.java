/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package testModel.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.eclipse.emf.emfstore.modelmutator.testModel.TestModelPackage;
import org.eclipse.emf.emfstore.modelmutator.testModel.referedLeaf;


/**
 * This is the item provider adapter for a {@link org.eclipse.emf.emfstore.modelmutator.testModel.referedLeaf} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class referedLeafItemProvider
	extends LeafsItemProvider
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public referedLeafItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addFloatPropertyDescriptor(object);
			addIntPropertyDescriptor(object);
			addIntegerPropertyDescriptor(object);
			addLongPropertyDescriptor(object);
			addLongObjPropertyDescriptor(object);
			addShortPropertyDescriptor(object);
			addShortObjPropertyDescriptor(object);
			addNamePropertyDescriptor(object);
			addNotChangeablePropertyDescriptor(object);
			addMultiRefPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Float feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFloatPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_referedLeaf_Float_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_referedLeaf_Float_feature", "_UI_referedLeaf_type"),
				 TestModelPackage.Literals.REFERED_LEAF__FLOAT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Int feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIntPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_referedLeaf_int_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_referedLeaf_int_feature", "_UI_referedLeaf_type"),
				 TestModelPackage.Literals.REFERED_LEAF__INT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Integer feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIntegerPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_referedLeaf_Integer_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_referedLeaf_Integer_feature", "_UI_referedLeaf_type"),
				 TestModelPackage.Literals.REFERED_LEAF__INTEGER,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Long feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLongPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_referedLeaf_long_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_referedLeaf_long_feature", "_UI_referedLeaf_type"),
				 TestModelPackage.Literals.REFERED_LEAF__LONG,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Long Obj feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLongObjPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_referedLeaf_LongObj_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_referedLeaf_LongObj_feature", "_UI_referedLeaf_type"),
				 TestModelPackage.Literals.REFERED_LEAF__LONG_OBJ,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Short feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addShortPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_referedLeaf_short_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_referedLeaf_short_feature", "_UI_referedLeaf_type"),
				 TestModelPackage.Literals.REFERED_LEAF__SHORT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Short Obj feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addShortObjPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_referedLeaf_ShortObj_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_referedLeaf_ShortObj_feature", "_UI_referedLeaf_type"),
				 TestModelPackage.Literals.REFERED_LEAF__SHORT_OBJ,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_referedLeaf_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_referedLeaf_name_feature", "_UI_referedLeaf_type"),
				 TestModelPackage.Literals.REFERED_LEAF__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Not Changeable feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNotChangeablePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_referedLeaf_notChangeable_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_referedLeaf_notChangeable_feature", "_UI_referedLeaf_type"),
				 TestModelPackage.Literals.REFERED_LEAF__NOT_CHANGEABLE,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Multi Ref feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMultiRefPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_referedLeaf_multiRef_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_referedLeaf_multiRef_feature", "_UI_referedLeaf_type"),
				 TestModelPackage.Literals.REFERED_LEAF__MULTI_REF,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This returns referedLeaf.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/referedLeaf"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((referedLeaf)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_referedLeaf_type") :
			getString("_UI_referedLeaf_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(referedLeaf.class)) {
			case TestModelPackage.REFERED_LEAF__FLOAT:
			case TestModelPackage.REFERED_LEAF__INT:
			case TestModelPackage.REFERED_LEAF__INTEGER:
			case TestModelPackage.REFERED_LEAF__LONG:
			case TestModelPackage.REFERED_LEAF__LONG_OBJ:
			case TestModelPackage.REFERED_LEAF__SHORT:
			case TestModelPackage.REFERED_LEAF__SHORT_OBJ:
			case TestModelPackage.REFERED_LEAF__NAME:
			case TestModelPackage.REFERED_LEAF__NOT_CHANGEABLE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

}
