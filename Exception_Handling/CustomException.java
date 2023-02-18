package Handlers;

import java.security.InvalidAlgorithmParameterException;
import java.util.Scanner;

public class CustomException {
	
	
	static void ValidateInput(int number) throws InvalidInputException {
		
		if (number>100) {
			throw new InvalidInputException();
		}
		System.out.println("Valid Input");
	}
	
	
	public static void main(String[] args) {
		
		
		
		//Getting data from user 
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a number less than 100: ");
		int number=in.nextInt();		
	
//user defined method is placed in try to handle the exception
	try {
		ValidateInput(number);
	}
	catch(InvalidInputException e){
		System.out.println("Caught Exception input is greater than100");
	}
	}
}
	
	
	//Since it's a user defined it required to extend the class	
	
	class InvalidInputException extends Exception{
		
		private static String exceptionText;

		InvalidInputException() {
			super(exceptionText);
		}
		
	}