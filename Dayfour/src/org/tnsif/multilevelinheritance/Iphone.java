package org.tnsif.multilevelinheritance;

public class Iphone extends Android {
 private String slottype;
 public void slot()
 {
	 System.out.println("The slottype is:"+slottype);
 }
 //getter and setter
public String getSlottype() {
	return slottype;
}
public void setSlottype(String slottype) {
	this.slottype = slottype;
}
//default constructor
public Iphone() {
	super();
	
}

public Iphone(int modelno,String version,String slottype) {
	super(modelno,version);
	this.slottype = slottype;
}
@Override
public String toString() {
	return "Iphone [slottype=" + slottype + ", getSlottype()=" + getSlottype() + ", getVersion()=" + getVersion()
			+ ", toString()=" + super.toString() + ", getModelno()=" + getModelno() + "]";
}





}
