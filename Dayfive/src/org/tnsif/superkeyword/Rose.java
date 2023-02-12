package org.tnsif.superkeyword;

public class Rose extends Flower{
	private String name;
	
//getter and setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Rose() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Rose(String name) {
		super();
		this.name = name;
	}
	public void display() {
		System.out.println(name);
		super.setName("Flower");
		System.out.println(super.getName());
		
	}

}
