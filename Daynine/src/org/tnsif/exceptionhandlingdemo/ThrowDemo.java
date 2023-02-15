package org.tnsif.exceptionhandlingdemo;

import java.io.IOException;

public class ThrowDemo {
	//throws used to declare an exception
	public static void donate(int age,int weight)throws Exception
	{
		if(age>=18&& weight<=50)
		System.out .println("Eligible to donate");
		else
			//to explicit throw exception
			throw new IOException("Not Eligible");
		
	}

	public static void main(String[] args) {
		try
		{
			//method call
			donate(17,55);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
