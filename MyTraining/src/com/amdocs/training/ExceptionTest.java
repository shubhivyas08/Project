package com.amdocs.training;

public class ExceptionTest {
	
	public static void main(String args[])
	{
		int a=10,b=0;
		try
		{
			int c=a/b;
			System.out.println(c);
			
		}
		
		catch(ArithmeticException ax)
		{
		System.out.println("ar"+ax);
		}
		catch(Exception e)
 		{
			System.out.println("m"+e);

		}
	}

}
