package org.tns.collections;
import java.util.*;
public class LinkedlistExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> linkedlist=new LinkedList<String>();
		linkedlist.add("Item1");
		linkedlist.add("Item5");
		linkedlist.add("Item3");
		linkedlist.add("Item6");
		linkedlist.add("Item2");
		
		System.out.println("Linked List Content: "+linkedlist);
		linkedlist.addFirst("First Item");
		linkedlist.addLast("Last Item");
		System.out.println("Linkedlist Content after addition:"+ linkedlist);
		
		String firstvar = linkedlist.get(0);
		System.out.println("First element: " + firstvar);
		linkedlist.set(0, "Changed first item");
		Object firstvar2 = linkedlist.get(0);
		System.out.println("First element after update by set method: " + firstvar2);
		
		linkedlist.removeFirst();
		linkedlist.removeLast();
		System.out.println("LinkedList after deletion of first and last element:  + linkedlist");
		linkedlist.add(0,"Newly added item");
		linkedlist.remove("Item3");
		System.out.println("Final Content: "+ linkedlist);
	}
		

	}


