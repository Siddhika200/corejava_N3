package org.tnsif.abstractiondemo;

public abstract class Menu {
	//abstract method
	abstract void recipe();
	abstract void foodtype();
	//concrete method
    void menutype() {
    	System.out.println("Veg and Nonveg");
    }
}
