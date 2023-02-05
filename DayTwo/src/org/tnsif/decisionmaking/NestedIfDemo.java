package org.tnsif.decisionmaking;
import java.util.Scanner;
public class NestedIfDemo {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the age and weight of person");
        int age =sc.nextInt();
        int weight =sc.nextInt();
        if(age>=12)
        {
        	if(weight>=40)
        	{
        		if(weight<120) 
        		{
        			System.out.println("Eligible for punjee jumping");
        		}
        	    else
        		System.out.println("Extra rope will br added");
        		
        }
        else
        {
        	System.out.println("Not Eligible");
        }
	}
	else 
	{

		System.out.println("Not Eligible");
	}
}
}
		
	
