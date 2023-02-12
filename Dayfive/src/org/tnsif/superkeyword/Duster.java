package org.tnsif.superkeyword;

public class Duster extends Renault {
	private int speed=120;
	public void print() {
		//it calls to parent class variable
		super.print();
		System.out.println("The speed of Duster is:"+speed+"km/hr");
	}

}
