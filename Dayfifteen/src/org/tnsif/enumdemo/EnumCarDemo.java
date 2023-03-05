package org.tnsif.enumdemo;

public class EnumCarDemo {
	public static void main(String[]args) {
		//accessing enum constant
//		Car r1=Car.TESLA;//new not used beacause we can not create object enum class
//		System.out.println(r1);
		
		//by using enhancedforloop
		for(Car c:Car.values()) {
			System.out.println(c);
			//System.out.println(c.MARUTI);
		}
		
		
	}

}
