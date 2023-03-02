package org.tnsif.assignmentfunctionrecursion;

import java.util.Scanner;

//to demonstrate an example on factorial of a number using function
public class FactorialUsingFunction {
    //function definition
	static int factorial(int num)
	{
		int fact=1;
		for(int i =1;i<=num;i++)
		{
			fact=i*fact;
		}
		return fact;
	}
	
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number :");
		int a=sc.nextInt();
		//function call
		System.out.println("Factorial of given number is : "+factorial(a));
		sc.close();
		
		

	}

}
