package org.tns.multithreading;

public class MultiThreadedDemo {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main method..!");
		MyThread1 t1=new MyThread1();
		MyThread2 t2=new MyThread2();
		
		t1.start();
		t2.start();

	}

}
