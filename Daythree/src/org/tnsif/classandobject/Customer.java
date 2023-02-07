package org.tnsif.classandobject;

public class Customer {
    int id;
    String custname;
    String city;
   
   public Customer() {
	   
   }

    public Customer(int id, String custname, String city) {
	super();
	this.id = id;
	this.custname = custname;
	this.city = city;
}
   void display() {
	   System.out.println(id+" "+custname+" "+city);
   }
//generated getter and setter
public int getId() {
	return id;
} 

public void setId(int id) {
	this.id = id;
}

public String getCustname() {
	return custname;
}

public void setCustname(String custname) {
	this.custname = custname;
}

public String getCity() {
	return city;
}

public void setCity(String city) {
	this.city = city;
}
   

	
}
