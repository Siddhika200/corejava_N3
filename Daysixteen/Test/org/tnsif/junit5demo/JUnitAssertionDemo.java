package org.tnsif.junit5demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class JUnitAssertionDemo {

	@Test
	public void assertdemo ()
	{
		assertEquals(7,7);
	}
	@Test
	void display() {
		//Fails when expression is true
		assertFalse(12==1);
	}
	@Test
	void display1() {
		//Fails when actual is null
		assertNull(null);
	}


}
