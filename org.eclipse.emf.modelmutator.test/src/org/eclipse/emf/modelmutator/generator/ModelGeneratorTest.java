package org.eclipse.emf.modelmutator.generator;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

import org.eclipse.emf.emfstore.client.model.ProjectSpace;
import org.eclipse.emf.emfstore.common.model.util.SerializationException;
import org.eclipse.emf.modelmutator.api.ModelMutator;
import org.eclipse.emf.modelmutator.api.ModelMutatorConfiguration;
import org.eclipse.emf.modelmutator.mutator.ModelMutatorHelper;
import org.eclipse.emf.modelmutator.mutator.ModelMutatorTest;
import org.junit.Assert;
import org.junit.Test;

/**
 * 
 * @author Eugen Neufeld
 * 
 */
public class ModelGeneratorTest extends ModelMutatorTest {

	@Test
	public void testNumberRootElements() {
		ProjectSpace projectSpace = createProjectSpace();

		ModelMutatorConfiguration mmc = createModelMutatorConfiurationSeed(projectSpace);

		ModelMutator.generateModel(mmc);
		try {
			System.out.println(ModelMutatorHelper.eObjectToString(projectSpace.getProject()));
		} catch (SerializationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Assert.assertEquals(width, projectSpace.getProject().getModelElements().size());
	}

	// @Test
	public void testDate() {
		System.out.println(System.currentTimeMillis());
		Date d1 = new Date(3155670000000l);
		Calendar c = Calendar.getInstance();
		c.set(2070, 0, 0, 0, 0, 0);
		c.set(Calendar.MILLISECOND, 0);
		System.out.println(c.getTimeInMillis());
		System.out.println(DateFormat.getDateTimeInstance().format(d1));
		long min = Long.MAX_VALUE;
		long max = Long.MIN_VALUE;
		for (int i = 0; i < 1000; i++) {
			Random random = new Random();
			long value = (long) (random.nextDouble() * 3155670000000l);
			if (value < min)
				min = value;
			if (value > max)
				max = value;
			Date d = new Date(value);
			System.out.println(DateFormat.getDateTimeInstance().format(d));
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("MAX:" + DateFormat.getDateTimeInstance().format(new Date(max)));
		System.out.println("MIN:" + DateFormat.getDateTimeInstance().format(new Date(min)));
	}
}
