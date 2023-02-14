package org.tnsif.arraysdemo;

public class Student {
 private String name;
 private int roll_no;
 private float percantage;
 
//getter and setter method
 
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getRoll_no() {
	return roll_no;
}
public void setRoll_no(int roll_no) {
	this.roll_no = roll_no;
}
public float getPercantage() {
	return percantage;
}
public void setPercantage(float percantage) {
	this.percantage = percantage;
}
// parametrized constructor
public Student(String name, int roll_no, float percantage) {
	super();
	this.name = name;
	this.roll_no = roll_no;
	this.percantage = percantage;
}

 
}
