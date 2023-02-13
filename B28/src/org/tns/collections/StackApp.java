package org.tns.collections;

import java.util.Stack;

public class StackApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> obj=new Stack<>();
		
		obj.push(0);
		obj.push(1);
		
		obj.push(2);
		obj.push(3);
		obj.push(4);
		obj.push(5);
		obj.push(100);
		System.out.println("ELements of the stack" +obj);
		
		obj.pop();
		obj.pop();
		
		for(int temp: obj)
		{
			System.out.println(temp);
		}
		
		System.out.println("last ele is: "+obj.peek());
		
		if(obj.isEmpty ())
		{
			System.out.println("Stack Empty");
		}
		System.out.println(obj.search(0));
		System.out.println(obj.search(100));

	}

}
