package org.tnsif.junit5demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

class JUnitAssumptionDemo {

	@Test
	void test() {
		System.setProperty("siddhika", "ghule");
		Assumptions.assumeTrue("ghule".equals(System.getProperty("siddhika")));
	}
	@Test
	void accept() {
		Assumptions.assumeFalse(12==13);
		
	}
	
	
	
}

