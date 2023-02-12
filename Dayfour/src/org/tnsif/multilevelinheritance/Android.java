package org.tnsif.multilevelinheritance;

public class Android extends Nokia{
 private String version;
 public void version() {
	 System.out.println("The android version is "+version);
 } 
 //getter and setter
public String getVersion() {
	return version;
}
public void setVersion(String version) {
	this.version = version;
}
//default constructor
public Android() {
	super();
	
}
// pc
public Android(int modelno,String version) {
	super( modelno);
	this.version = version;
}
@Override
public String toString() {
	return "Android [version=" + version + ", getVersion()=" + getVersion() + ", getModelno()=" + getModelno() + "]";
}

}
