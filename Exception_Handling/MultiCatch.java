package Handlers;

public class MultiCatch {
	
	
	
	public static void main(String[] args) {
		
		
		
		//we can use multi catch to handle different possible Exceptions by one "try"
		
		
		try {
			
			

			
			
			int num =Integer.parseInt("#vigneshwaar");
			
			System.out.println(num);
			
			
		//Even though it rise an exception it will be skiped bcoz 	an "Exception occured prevesily
			int[]b=new int[4];
			
			b[7]=10;
			System.out.println(b);
			
			
		} catch (NumberFormatException e) {
			System.out.println("Number format Exception");
		}
		
		
		
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Handeld Exception");
		}
		
		//it will be default to be executed
		System.out.println("Move to other statements");
		
		
		
		
		
		
	}
	
	
	
	

}
