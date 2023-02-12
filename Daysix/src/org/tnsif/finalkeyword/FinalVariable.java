package org.tnsif.finalkeyword;

public class FinalVariable {
  final static int x=12;
  public static void print() {
	  // Final Varible:as we cannot change the value of x because we declare it final with the final keyword
	  //eg: x=16 will give error x already assign with value
	 System.out.println("The value of x is :"+x); 
  }
  public static void main(String args[]) {
	 
	  FinalVariable.print();
  
  }
}
 