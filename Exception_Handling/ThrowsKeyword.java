package Handlers;

public class ThrowsKeyword {
	
	
	//throws Specifies the exceptions
	static void avg() throws ArithmeticException{
		
		System.out.println("Inside the Ang method");
		//throw is given explicitly 
		throw new ArithmeticException("Demo");
		
	}
	
	
	public static void main(String[] args) {

		try {
			avg();
			
		}
		
		
		finally {
			System.out.println("Caught Exception");
		}
		
	}
	
	
	
	
	
	

}