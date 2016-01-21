package com.vinod.test;

import org.junit.Before;

import com.vinod.SimpleValidate;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import org.junit.After;
import org.junit.Test;

public class SimpleValidateTest {
	SimpleValidate simpleValidate = null;

	@Before
	public void setUp() throws Exception {
		simpleValidate = new SimpleValidate();
		assertNotNull(simpleValidate);
	}
	@After
	public void tearDown() throws Exception {
		simpleValidate = null;
	}
	@Test
	public void testSimpleValidateaValidation() {

		String result = simpleValidate.validation("Vinod", "male");
		assertEquals("try again", result);
	}
	@Test
	public void testSimpleValidateValidation1() {
		String result = simpleValidate.validation("", "male");
		assertEquals("try again", result);
	}

}
