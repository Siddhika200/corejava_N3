package org.tnsif.loopingstatements;
import java.util.Scanner;
public class ForDemo {

	public static void main (String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the value n");
		int n=sc.nextInt();
		for(int i=0;i<=n;i++) {
			System.out.println(i+"");
			
		}
		for(int i=n;i>=0;i--) {
			System.out.println(i+"");
		}
	}

}
