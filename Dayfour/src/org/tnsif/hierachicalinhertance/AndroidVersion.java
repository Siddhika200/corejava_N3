package org.tnsif.hierachicalinhertance;

public class AndroidVersion {
  private String type;

public String getType() {
	return type;
}

public void setType(String type) {
	this.type = type;
}

public AndroidVersion() {
	super();
	// TODO Auto-generated constructor stub
}

public AndroidVersion(String type) {
	super();
	this.type = type;
}

@Override
public String toString() {
	return "AndroidVersion [type=" + type + "]";
}
  
}
