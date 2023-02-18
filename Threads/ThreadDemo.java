package thread.packages;

public class ThreadDemo extends Thread{
		

	@Override
	public void run() {
		for (int doc = 1; doc <=10; doc++) {
			System.out.println("$$Printing the Doument #" +doc +""+" by printer2");
				
			}
		
	}
	
	
	//IT's a MAin thread in java
	public static void main(String[] args) {
		//Threads always works in sequence
		 ThreadDemo t=new  ThreadDemo();
		//job1
		System.out.println("Application Starts");
		
		
		t.start();
		
		
		//job3
		for (int doc = 1; doc <=10; doc++) {
		System.out.println("@@Printing the Doument #" +doc +""+" by printer1");
			
		}
		//job4
		System.out.println("Application Ends!");
	}
	
	

}