package org.tnsif.polymorphismdemo;

public class HondaCity {
   private String color;
   private int speed;
   
   //getter and setter method
//public String getColor() {
//	return color;
//}
//public void setColor(String color) {
//	this.color = color;
//}
//public int getSpeed() {
//	return speed;
//}
//public void setSpeed(int speed) {
//	this.speed = speed;
//}
public HondaCity() {
	System.out.println("I like to drive hondacity");
	
}
public HondaCity(String color, int speed) {
	super();
	this.color = color;
	this.speed = speed;
	System.out.println("Speed is :"+speed+","+"Color is :"+color);
}
   
   
}
