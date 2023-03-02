package org.tnsif.assignmentfunctionrecursion;

import java.util.Scanner;

//Fibonacci series using recursion
public class AssignmentNo1 {
	static int fibonacci(int n)
	{
		if(n==0)
			return 0;
		else if(n==1)
			return 1;
		else
			return fibonacci(n-1)+fibonacci(n-2);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number :");
		int a=sc.nextInt();
		for(int i=0; i<a; i++)
		{
			System.out.println(fibonacci(i));
		}

	}

}
