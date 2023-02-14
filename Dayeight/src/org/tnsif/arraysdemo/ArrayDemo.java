package org.tnsif.arraysdemo;
import java.util.Arrays;
import java.util.Scanner;
public class ArrayDemo {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the array elements;");
	int n=s.nextInt();
	int arr[]=new int[n];
	int i;
	//to allocate the value to array
	for(i=0 ;i<n;i++)
	{
		arr[i]=s.nextInt();
	}
	for(i=0;i<n;i++)
	{
		System.out.println(arr[i]+"");
	}
	 Arrays.sort(arr);
     System.out.println(arr);
     for( i=0;i<n;i++)
 	{
 		System.out.println(arr[i]+"");
 	}
     System.out.println("Sorted elements are :");
     for(int itr:arr) 
     {
    	System.out.println(itr+""); 
     }
	}

}
 