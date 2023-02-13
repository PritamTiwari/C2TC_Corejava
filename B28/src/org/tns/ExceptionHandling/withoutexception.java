package org.tns.ExceptionHandling;

public class withoutexception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int d=0;
		try {
			int a=65/d; //exception arises here
			System.out.println("Exception occured");
		}
		catch (ArithmeticException a)
		{
			System.out.println("Exception resolved"+ "" + a.getMessage());
	}
	System.out.println("I am executing without any issue");

	}
}
	


