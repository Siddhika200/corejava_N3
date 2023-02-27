package org.tnsif.threaddemo;

public class SynchronizationDemo {
    synchronized void print(int num)
    {
    	for(int i=1;i<=5;i++)
    	{
    		System.out.println(num*i);
    	}
    }
}
class ThreadOne extends Thread
{
	SynchronizationDemo d;

	public ThreadOne(SynchronizationDemo d) {
		super();
		this.d = d;
	}
	 public void run()
	{
		d.print(10);
	}
	
}
class ThreadTwo extends Thread
{
	SynchronizationDemo d;

	public ThreadTwo(SynchronizationDemo d) {
		super();
		this.d = d;
	}
	public void run()
	{
		d.print(1);
	}
	
}