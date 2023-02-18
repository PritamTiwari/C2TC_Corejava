package Handlers;

public class Sampleexception {

	public static void main(String[] args) {
		
		
		//unchecked Exception will be happen in Run time
		
		
			try {
			int a=50;   int b=0;
		//rises the Arithmetic Exceptions	
			int c= 50/0;
			System.out.println("result is =" +c);
			
		} catch (ArithmeticException e) {
			System.out.println("Can't divide by Zero");
		}
		
		
		//declaring the integer but parsing the String value may rise an exception
	
				try {
			int num =Integer.parseInt("Exceptions");
			System.out.println(num);
		} catch (NumberFormatException e) {
			
			System.out.println("Rises the number format Exception");
			
		}
		
		try {

			int [] arr = new int[5];
			arr[6]=7;
			System.out.println(arr);
			
			
		} 
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array can't take the value " + ":" + "array index out of Bounds");
		}
		
		
		
		
		
	}

}