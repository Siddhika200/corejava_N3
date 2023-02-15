package org.tnsif.exceptionhandlingdemo;

public class NestedTryCatchExecption {

	public static void main(String[] args) {
		int arr[]=new int[] {12,13,15};
		int x=10;
		int y=0;
		try
		{
			try
		    {
			System.out.println(arr[3]);				
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println("Exception1 :"+e);
			}
			try
			{
				int res=x/y;
				System.out.println(res);
			}
			
			catch(Exception e)
		   {
			System.out.println("Exception2 :"+e);
		   }
				
		}
		finally
		{
			
			System.out.println("Finally blocked");
			
		}
	

	}

}
