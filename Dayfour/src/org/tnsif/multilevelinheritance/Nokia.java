package org.tnsif.multilevelinheritance;

public class Nokia {
  private int modelno;
  public void display() {
	  System.out.println("The model no is :"+modelno);
	  
  }
  public int getModelno() {
	return modelno;
}
public void setModelno(int modelno) {
	this.modelno = modelno;
}
//default constructor
  public Nokia(){
	  System.out.println("Nokia model");  
  }
  //
public Nokia(int modelno) {
	super();
	this.modelno = modelno;
}
  
  }
