package com.generics;

import com.tns.main;

public class Generics <T> {
	
	public Generics() {
		System.out.println("This is generic class ");
	}
//Generic Method will be called by reference
	public void methodGenerics( T obj) 
	{
		System.out.println("This is a generic method" .getClass().getSimpleName());
		
	}
	
	
	public static void main(String[] args) {
		Generics<Integer>test=new Generics<>();
		
		Integer a=55;
		test.methodGenerics(a);
		Generics<String>test1=new Generics<>();
		String s ="Hello World";
		test1.methodGenerics(s);
	}
}