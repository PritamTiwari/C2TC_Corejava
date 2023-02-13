package org.tns.ExceptionHandling;

import java.io.IOException;

public class ThrowsDemo {
	static void display() throws IOException
	{
		System.out.println("Hello Java");
		throw new IOException();
	}
	public static void main(String[] args) {
		ThrowsDemo ob=new ThrowsDemo();
		try {
			ob.display();
			
		}
		catch (IOException e) {
			System.out.println("Caught an exception: \n" +e);
		}
	}

}
