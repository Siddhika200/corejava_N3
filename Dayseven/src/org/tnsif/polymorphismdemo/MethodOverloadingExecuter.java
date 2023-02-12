package org.tnsif.polymorphismdemo;
import java.util.Scanner;
public class MethodOverloadingExecuter {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Resolution and slottype"+"of a cellphone");
		int resolution=s.nextInt();
		String slottype=s.nextLine();
		Smartphone sp=new Smartphone();
		sp.setResolution(resolution);
		sp.setSlottype(slottype);
		sp.display(resolution);
		sp.display(resolution, slottype);
        
		Multiplication m=new Multiplication();
		m.mul(12, 15);
		m.mul(2.3f,4);
	
	}

}
