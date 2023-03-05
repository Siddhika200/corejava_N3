package org.tnsif.junit5demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

class RepeatedTestDemo {

	@Test
	//@Test
		@RepeatedTest(5)
		void test() {
			System.out.println("Repeated Test annotation");
		}

}
