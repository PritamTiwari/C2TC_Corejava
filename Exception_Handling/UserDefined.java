package Handlers;

public class UserDefined {

	
	public static void main(String[] args) {
		
		
		//user defined Exception
		
		
		
		try {
		throw new MyException(4);
		}
		catch (Exception e) {
			System.out.println(e);
		}
	}}
		
		//user defined sholud extend the class for exception
		class  MyException extends  Exception{
		
			
		int a;
		 MyException(int b) {
			a=b;
		}
			public String toString() {
				return("Exception Number=" +a);
			}
		}
	