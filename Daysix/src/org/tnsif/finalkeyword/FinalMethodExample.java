package org.tnsif.finalkeyword;

public class FinalMethodExample extends FinalMethod {
	private int price;
	final void display(int price) {
		System.out.println("The price is :"+price);
		
	}
	//getter and setter
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
 
}
