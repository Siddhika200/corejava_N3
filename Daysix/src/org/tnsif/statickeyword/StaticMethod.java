package org.tnsif.statickeyword;

public class StaticMethod {
	  //private double salary=12123.34;
	  //Because variable is non static so we should convert it into static for removing error
	  private static double salary=12123.34;
      static void display() {
    	  System.out.println("Salary is :"+salary);
      }
      //getter and setter method
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
      
}
