package org.tnsif.assignmentfunctionrecursion;
//To demonstrate example of function
import java.util.Scanner;
public class AdditionDemo {
	//function definition
	/*static int addition(int x, int y)
	{
		int sum=x+y;
		return sum;
	}*/
	static void addition(int x, int y)
	{
		int sum=x+y;
		System.out.println("Addition of X and Y is : "+sum);
	}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of X and Y :");
		int a=sc.nextInt();
		int b=sc.nextInt();
		//function call
		addition(a,b);
		sc.close();
		//System.out.println(addition(a,b));
		
		
		

	}

}
