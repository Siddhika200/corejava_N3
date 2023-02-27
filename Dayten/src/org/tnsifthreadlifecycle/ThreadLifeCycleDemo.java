package org.tnsifthreadlifecycle;

public class ThreadLifeCycleDemo {

	public static void main(String[] args) {
		Tech t=new Tech();
		SoftSkill s=new SoftSkill();
		t.start();
		// used to Move control to another thread
		t.yield();
		
		s.start();

	}

}
