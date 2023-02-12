package org.tnsif.statickeyword;

public class StaticBlock {
	private int num;
	private static String name;
    //static block: use to initialize static variable
	static 
	{
		name="siddhika";
    }
	//getter and setter method
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public static String getName() {
		return name;
	}
	public static void setName(String name) {
		StaticBlock.name = name;
	}
	


}
