package org.tns.multithreading;

public class SendUsingThreads extends Thread {
	private String message;
	Sender sender;
	
	SendUsingThreads(String msg,Sender object)
	{
		message=msg;
		sender=object;
	}
	 public void run()
	{
		synchronized(sender)
		{
				sender.sendMessage1(message);
			
		}
	}

	
}
