package org.tns.Generic;
import java.util.ArrayList;
public class GenericJava
{
	
	public static void main(String [] args) {
		ArrayList<String>list=new ArrayList<String>();
		list.add("Java");
		list.add("3");
		for(Object ob:list) {
			String str=(String)ob;
			System.out.println(str);
		}
	}
}
