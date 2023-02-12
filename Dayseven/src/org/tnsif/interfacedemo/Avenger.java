package org.tnsif.interfacedemo;

public class Avenger implements Bike {
	@Override
	public void milage(int speed) {
		System.out.println("Speed is: "+speed);
	}

	@Override
	public void engine() {

		System.out.println("working on Petrol");
		
		
	}
}
