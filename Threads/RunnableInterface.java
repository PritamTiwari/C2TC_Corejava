package thread.packages;

public class RunnableInterface extends  ThreadDemo implements Runnable{

	@Override
	public void run() {
		for (int doc = 1; doc <=10; doc++) {
		System.out.println("###Printing the Document #" +doc +""+" by printer2");
			
		}
		
	}
	
	
	//it's a main thread in java: started by jvm
	public static void main(String[] args) {
		
		
		//job1
		
		System.out.println("Application Starts!");
		
		
		
		
		//job2
		for (int doc = 1; doc <=10; doc++) {
			System.out.println("@@Printing the Document #" +doc +""+" by printer1");
			
		}
						
		//job3
	
		Runnable r	=new RunnableInterface();
		Thread task= new Thread(r);
		task.start();
		
		
		
		
		//job4
		System.out.println("Application Ends!");

		
	}
	
}