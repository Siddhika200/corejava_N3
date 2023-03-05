package org.tnsif.enumdemo;

import java.util.Scanner;

import org.tnsif.enumdemo.PizzaEnumDemo.Size;

public class PizzaEnumexecutoer {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of pizza ");
		String size=s.nextLine();
		//converting string to enum -size of the pizza
		Size s1=Size.valueOf(size.toUpperCase());
		switch(s1)
		{
		   case SMALL:
			   System.out.println("Preparing small pizza");
			   break;
		   case MEDIUM:
			   System.out.println("Preparing medium pizza");
			   break;
		   case LARGE:
			   System.out.println("Preparing large pizza");
			   break;   
		   case EXTRALARGE:
			   System.out.println("Preparing extralarge pizza");
			   break;   
		}
	}

}
