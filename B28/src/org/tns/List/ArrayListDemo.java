package org.tns.List;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <String>list=new ArrayList<String>();
		System.out.println("*** adding the elements");
		list.add("Manu");
		list.add("nayana");
		list.add("Raj");
		System.out.println("*** elements are"+list);
		list.add(2,"ragu");
		System.out.println("*** elements are"+list);
		list.remove(1);
		System.out.println("*** elements are"+list);
		System.out.println("*** elements are"+" "+list.get(0));
		list.set(0,"sushma");
		System.out.println("*** elements are"+list);

	}

}
