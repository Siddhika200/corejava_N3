package org.tnsif.statickeyword;

public class StaticVariable {
	//non static variable
	private String name;
	//static variable
	//static varible is use to print the class without creating object of that class
	public static String companyname="Techno serve";
	
	// getter and setter for non static variable
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	//Default Constructor
	public StaticVariable(String name) {
		super();
		this.name = name;
	}
	@Override
	public String toString() {
		return "StaticVariable [name=" + name + ", getName()=" + getName() + "]";
	}
	

	
}
