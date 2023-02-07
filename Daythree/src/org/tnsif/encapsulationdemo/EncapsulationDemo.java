package org.tnsif.encapsulationdemo;
import java.util.Scanner;
public class EncapsulationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    HDFC a=new HDFC();
//    a.setPin(2344);
//    System.out.println(a.getPin());
//    a.accept();
    
    //by user input
    Scanner s=new Scanner(System.in);
    System.out.println("Enter the Pin:");
    a.setPin(s.nextInt());
    System.out.println(a.getPin());
    a.accept();
    s.close();
	}

}
