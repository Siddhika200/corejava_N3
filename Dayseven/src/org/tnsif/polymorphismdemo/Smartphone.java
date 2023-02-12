package org.tnsif.polymorphismdemo;

public class Smartphone {
	 private int resolution;
	 private String slottype;

	//method overloading in term by passing no.of arguements
     void display(int resolution) 
     {
    	System.out.println("Camera Resolution:"+resolution); 
     }
     void display(int resolution,String slottype) 
     {
    	 System.out.println("Camera Resolution:"+slottype+" "+resolution);
     }
	public int getResolution() {
		return resolution;
	}
	public void setResolution(int resolution) {
		this.resolution = resolution;
	}
	public String getSlottype() {
		return slottype;
	}
	public void setSlottype(String slottype) {
		this.slottype = slottype;
	}
     
} 