package org.tnsif.polymorphismdemo;
import java.util.Scanner;
public class ConstructorOverloadingExecutor {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
        System.out.println("Enter the Speed and Color of Hondacity:");
        int speed=s.nextInt();
        String color=s.nextLine();
        HondaCity h=new HondaCity();
        HondaCity 
          h1=new HondaCity(color,speed);
	}

}
