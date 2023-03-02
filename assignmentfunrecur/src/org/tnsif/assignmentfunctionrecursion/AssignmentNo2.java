package org.tnsif.assignmentfunctionrecursion;

import java.util.Scanner;
//sum of digits using recursion
public class AssignmentNo2 {
	static int count=0;
	static int sumofdigit(int num)
	{ 
		if(num>0)
		{
			count++;
			sumofdigit(num/10);
			
		}
			return count;
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number :");
		int a=sc.nextInt();
		//function call
		System.out.println("Sum of digit is : "+sumofdigit(a));
		sc.close();

	}

}
