package org.tnsif.classandobject;
import java.util.Scanner;
public class CustomerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//    Customer c=new Customer(11,"siddhika","nashik");
//    c.display();
	 
		//cust1
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the id ,customer name,city");
	int id;
	String city,Custname;
	id=sc.nextInt();
	sc.nextLine();
	Custname=sc.nextLine();
	city=sc.nextLine();
	Customer c=new Customer();
	c.setId(id);
	c.setCustname(Custname);
	c.setCity(city);
	c.display();
	
	 }
	
	
	
	//cust2
//	Scanner s=new Scanner(System.in);
//	System.out.println("Enter the id ,customer name,city");
//	int id1;
//	String city1,Custname1;
//	id=s.nextInt();
//	s.nextLine();
//	Custname=s.nextLine();
//	city=s.nextLine();
//	Customer c1=new Customer();
//	c1.setId(id); 
//	c1.setCustname(Custname);
//	c1.setCity(city);
//	c1.display();
//	}

}
 