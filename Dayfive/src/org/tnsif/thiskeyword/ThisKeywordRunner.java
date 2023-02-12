package org.tnsif.thiskeyword;

class Mathematics{
	int a,b;
	Mathematics()
	{
		a=10;
		b=20;
	}
	Mathematics accept() 
	{
		return this;
	}
	void display() 
	{
		System.out.println("Value A"+a);
		System.out.println("Value B"+b);
	}
}

public class ThisKeywordRunner {

	public static void main(String[] args) {
		Mathematics m=new Mathematics();
		m.accept();
		m.display();
		m.accept().display();
		
	}

}
