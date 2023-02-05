package org.tnsif.loopingstatements;

import java.util.Scanner;

public class WhileDemo {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the value n");
		int n=s.nextInt();
		int i=1;
		
		while( i<=n) {
			System.out.println(i+"");
			i++;
		}
		
	}

}

	


