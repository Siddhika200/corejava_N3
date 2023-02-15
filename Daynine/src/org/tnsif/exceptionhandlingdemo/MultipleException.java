package org.tnsif.exceptionhandlingdemo;

public class MultipleException {

	public static void main(String[] args) {
		try
		{
			int arr[]=new int[] {12,13,15};
			int x=10;
			int y=0;
			int res=x/y;
			System.out.println(arr[3]);
			System.out.println(res);
		}
		//we can catch multiple catch
//		catch(ArrayIndexOutOfBoundsException e)
//		{
//			System.out.println("Exception1 :"+e);
//		}
//		
//		catch(Exception e)
//		{
//			System.out.println("Exception2 :"+e);
//			
//		}
		//pipe operator used
		catch(ArrayIndexOutOfBoundsException | ArithmeticException e)
		{
			System.out.println("Exception handled");
//			
		}
	
		finally
		{
			//when finally block contains exception
//			int x=12;
//			int y =0;
//			int res=x/y;
//			System.out.println(res);		
			System.out.println("Finally blocked");
			
		}
}
}
