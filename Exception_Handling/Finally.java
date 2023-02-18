package Handlers;

public class Finally {

	public static void main(String[] args) {
		try {
			
			int a =20;
			int b=0;
			
			int z=a/b;
			System.out.println(z);
					
			
		}
		finally {
			System.out.println("Finally will always executed");
		}
		
	}

}