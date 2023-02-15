package org.tnsif.exceptionhandlingdemo;

public class TryCatchDemo {

	public static void main(String[] args) {
		//int arr[]=new int[] {12,13,15};
		try
		{
			int arr[]=new int[] {12,13,15};
			System.out.println("C2TC");
			//System.exit(0);
			System.out.println(arr[3]);
		}
		catch(Exception e)
		{
			System.out.println("Exception handled:"+e);
			//System.exit(0);
		}
		finally
		{
			//when finally block contains exception
			int x=12;
			int y =0;
			int res=x/y;
			System.out.println(res);		
			System.out.println("Finally blocked");
			
		}
		

	}

}
