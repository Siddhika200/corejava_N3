package org.tnsif.statickeyword;

public class StaticBlockExecutor {

	public static void main(String[] args) {
		StaticBlock s=new StaticBlock();
		s.setNum(123);
		System.out.println(s.getNum());
		System.out.println(StaticBlock.getName());
		
		

	}

}
  