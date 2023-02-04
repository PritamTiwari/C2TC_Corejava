package org.tns.ExceptionHandling;

public class ThrowDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sun[] = {"chocolate","honey","bitter","sugar","sweet"};
		String h = null;
		try {
			for(int i=0;i<=7;i++)
			{
				if(i>sun.length)
				{
					throw new ArrayIndexOutOfBoundsException();
				}
				System.out.println(sun[i]);
			}
		}
		catch(ArrayIndexOutOfBoundsException ae)
		{
			System.out.println("Inside array index out of bounds exception catch block");
		}
		try {
			sun[0]=h;
			if (sun[0]==null)
{
	throw new NullPointerException();
}
System.out.println("Value of sun[0] is: " +sun[0]);
	}
		catch (NullPointerException E)
		{
			System.out.println("Caught an exception");
			System.out.println(E.getMessage());
		}
}
}
