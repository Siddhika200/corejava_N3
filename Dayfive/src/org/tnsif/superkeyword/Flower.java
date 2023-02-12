package org.tnsif.superkeyword;

public class Flower {
  private String name;
//getter and setter
public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}
//Default Constructor
public Flower() {
	System.out.println("Flower = Parent Class");
	// TODO Auto-generated constructor stub
}
//Paratemized Constructor
public Flower(String name) {
	super();
	this.name = name;
}
  
}
