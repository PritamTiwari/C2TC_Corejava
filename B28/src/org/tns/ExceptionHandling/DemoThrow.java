package org.tns.ExceptionHandling;

public class DemoThrow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num =1;
		for(num =1; num<=10;num++) {
			try
			{
				if(num ==5)
					throw new ArithmeticException("ArithemeticException");
				else if (num<2)
					throw new RuntimeException("RuntimeException");
				else if (num>9)
					throw new Exception("NullPointerException");
			}
			catch(Exception e)
			{
				System.out.println("Caught an exception");
				System.out.println(e.getMessage());
			}
		}

	}

}
