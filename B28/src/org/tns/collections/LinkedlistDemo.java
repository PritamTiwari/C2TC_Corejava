package org.tns.collections;
import java.util.*;
public class LinkedlistDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> list=new LinkedList<String>();
				list.add("Steve");
		list.add("Carl");
		list.add("Raj");
		System.out.println(list);
		list.addFirst("Negan");
		list.addLast("Rick");
		System.out.println(list);
		list.add(2,"Glenn");
		list.add(2,"Gl");
		System.out.println(list);
		Iterator<String>it=list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
