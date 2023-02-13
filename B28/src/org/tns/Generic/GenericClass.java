package org.tns.Generic;

public class GenericClass <T>{
	GenericClass()
	{
		System.out.println("This is generic class");
	}
	public void methodGeneric(T obj) {
		System.out.println("This is a generic method"+obj.getClass().getSimpleName());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericClass<Integer>test=new GenericClass<Integer>();
		Integer a=5;
		test.methodGeneric(a);
		
		GenericClass<String>test1=new GenericClass<String>();
		String s="PMC";
		test1.methodGeneric(s);

	}

}
