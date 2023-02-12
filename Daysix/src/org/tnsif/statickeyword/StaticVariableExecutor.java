package org.tnsif.statickeyword;

public class StaticVariableExecutor {

	public static void main(String[] args) {
		StaticVariable s=new StaticVariable("Siddhika");
		System.out.println(s);
		//use classname.variable (StaticVariable.companyname)to print static variable
		System.out.println(StaticVariable.companyname);
		
	}

}
