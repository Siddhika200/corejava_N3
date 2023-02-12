package org.tnsif.instanceofdemo;

public class Person {
   private String name;
   private String address;
   //getter and setter
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
//Default constuctor
public Person() {
	System.out.println("Parent Class");
	// TODO Auto-generated constructor stub
}
//paratmezied constructor
public Person(String name, String address) {
	super();
	this.name = name;
	this.address = address;
}
@Override
public String toString() {
	return "Person [name=" + name + ", address=" + address + ", getName()=" + getName() + ", getAddress()="
			+ getAddress() + "]";
}



}
