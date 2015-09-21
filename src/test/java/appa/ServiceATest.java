package appa;

import static org.junit.Assert.*;

import org.junit.Test;

import au.com.bluemix.training.appa.IServiceA;
import au.com.bluemix.training.appa.ServiceA;

public class ServiceATest {

	@Test
	public void testPlus() {
		IServiceA serviceA = new ServiceA();
		int result = serviceA.plus(10, 10);
		assertEquals(20, result);

	}

}
