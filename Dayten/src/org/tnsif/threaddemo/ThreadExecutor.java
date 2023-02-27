package org.tnsif.threaddemo;

public class ThreadExecutor {

	public static void main(String[] args) {
		SimpleThreadProgram p =new SimpleThreadProgram();
		//if we not change then it will give current thread which is main here and return with 3 
		p.setName("Java Thread");//used to change the thread name which is by default main
		p.setPriority(8);//used to change priority and priority is by default is 5 if not set it
		//when thread calls to start method it will come to run method
		p.start();//we can't call start() method ,again we can't restart means we can call start month once but we call run method again
		System.out.println("Current Thread"+p); 
	}

}


