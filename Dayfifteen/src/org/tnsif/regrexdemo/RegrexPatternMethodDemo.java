package org.tnsif.regrexdemo;

import java.util.Scanner;
import java.util.regex.Pattern;

public class RegrexPatternMethodDemo {

	public static void main(String[] args) {
		String pattern="Siddhika Ghule";
		Scanner s =new Scanner(System.in);
		System.out.println("Enter the iput for matches");
		String inputs=s.nextLine();
        boolean result=Pattern.matches(pattern, pattern);
        System.out.println(result);
        
	}

}
