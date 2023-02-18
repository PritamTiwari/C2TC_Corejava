package Handlers;

public class NestedTry {
	
	public static void main(String[] args) {
		
	//try within another try block 
		try {
			//try1
			try {
		int num =Integer.parseInt("Exceptions");
		System.out.println(num);
	} catch (NumberFormatException e) {
		
		System.out.println("Rises the number format Exception");
		
	}
			//try2
			try {
				int []a=new int[5];
				a[7] =9;
				
			} catch (Exception e) {
				System.out.println("Handeld");
			}
			
			System.out.println("other Statements");		
			
	}
	//main try block will not have any exception so catch will not do anything	
catch (Exception e) {
	System.out.println("handeld and recovred");
}
		
	}
	}