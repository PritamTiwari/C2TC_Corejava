package org.tns.multithreading;

public class ExtendingThread extends Thread {
	public void run()
	{
		System.out.println("Welcom to Multithreading");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExtendingThread t= new ExtendingThread();
		t.start();

	}

}
