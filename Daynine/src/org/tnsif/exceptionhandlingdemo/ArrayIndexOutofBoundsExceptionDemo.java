package org.tnsif.exceptionhandlingdemo;

public class ArrayIndexOutofBoundsExceptionDemo { 
	

	public static void main(String[] args) {
	System.out.println("First Line");
	 System.out.println("Second Line");
   try
   {
  	 int[] myIntArray = new int[] {1,2,3};
  	 print( myIntArray);
   }
   catch(Exception e)
   {
  	 System.out.println("The array doesn't have fourth element"+e );  
   }
   System.out.println("Third Line"); 
	}

public static void print(int[] arr) {
	System.out.println(arr[4]);
}
}
