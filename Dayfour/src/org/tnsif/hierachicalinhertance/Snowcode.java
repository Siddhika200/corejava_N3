package org.tnsif.hierachicalinhertance;

public class Snowcode extends AndroidVersion {
	 
	private int version;

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	public Snowcode() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Snowcode(String type,int version) {
		super();
		this.version = version;
	}

	@Override
	public String toString() {
		return "SnowCone [version=" + version + ", toString()=" + super.toString() + "]";
		
}
}