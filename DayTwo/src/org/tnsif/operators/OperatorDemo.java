package org.tnsif.operators;
import java.util.Scanner;
public class OperatorDemo {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the value of x and y");
		int x=s.nextInt();
		int y=s.nextInt();
		//Arithmetic operators
		System.out.println(x+y);
		System.out.println(x-y);
		System.out.println(x*y);
		System.out.println(x/y);
		System.out.println(x%y);
		
		//relational operators
		boolean res=x>y;
		System.out.println(x);
		
		//assignment Operator
		x*=y;//x=x*y;
		System.out.println(x);
		
		//logical operator 
		boolean res2=(5==5)&&(5>3);
		boolean res3=(5==3)&&(5>2);
		boolean res4=!(5==4);
		System.out.println(res2);
		System.out.println(res3);
		System.out.println(res4);
		
		//bitwise operator
		 int a=12&5;
		
		
		
		
		
		

	}

}
