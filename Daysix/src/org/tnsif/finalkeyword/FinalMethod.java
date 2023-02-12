package org.tnsif.finalkeyword;

public class FinalMethod {
	private String flavour;
	//Final method:as we declare a method final i parent class with final keyword we can't override that method in child class but we can overload it.
	final void display() {
		System.out.println("Flovore is :"+flavour);
	}
	//Getter and setter method
	public String getFlavour() {
		return flavour;
	}
	public void setFlavour(String flavour) {
		this.flavour = flavour;
	}
	
   
}
