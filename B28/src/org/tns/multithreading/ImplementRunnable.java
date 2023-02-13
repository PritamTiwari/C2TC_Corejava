package org.tns.multithreading;

public class ImplementRunnable implements Runnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ImplementRunnable t=new ImplementRunnable ();
		Thread t1=new Thread(t);
		t1.start();

	}
	public void run() {
		System.out.println("Runnable interface");
	}

}
