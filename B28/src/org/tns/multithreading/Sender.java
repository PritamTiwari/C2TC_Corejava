package org.tns.multithreading;

public class Sender extends Thread {
	public void sendMessage1(String message) 
	{
		System.out.println("\nSending" +message);
		try
		{
			Thread.sleep(1000);
	}
	catch(Exception e)
	{
		System.out.println("Thread interrupted");
	}
	char sent = 0;
	System.out.println('\n' + message + sent);
}
}
