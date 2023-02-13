package org.tns.multithreading;

public class SynchronizedBlockDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sender sender=new Sender();
		SendUsingThreads sender1=new SendUsingThreads("Hello", sender);
		SendUsingThreads sender2=new SendUsingThreads("Welcome India", sender);
		
		sender1.start();
		sender2.start();
		try
		{
			sender1.join();
			sender2.join();
			
		}
		catch(Exception e)
		{
			System.out.println("Interrupted");
		}
		

	}

}
