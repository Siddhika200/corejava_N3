package org.tnsif.enumdemo;

public enum EnumCardsDemo implements  InterfacePizzaDemo {
     HEART,CLUB,DIAMOND,SPADES;

	@Override
	public void print() {
		System.out.println("Shape in the cards are :"+this);
		
	}
}
