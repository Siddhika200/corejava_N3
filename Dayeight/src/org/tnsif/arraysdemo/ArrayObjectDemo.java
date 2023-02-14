package org.tnsif.arraysdemo;
import java.util.Scanner;
public class ArrayObjectDemo {

	public static void main(String[] args) {
		Student arr[];//define array object
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the elemnts in the array");
		int n=s.nextInt();
		arr=new Student[n];
		int i=0;
		while(i<n) {
		arr[i]=new Student(s.next(),s.nextInt(),s.nextFloat());
		i++;
	    }
        for(int j=0;j<n;j++) 
        {
        	System.out.println(arr[j].getName()+" "+arr[j].getRoll_no()+" "+arr[j].getPercantage());
        }
}
}
 