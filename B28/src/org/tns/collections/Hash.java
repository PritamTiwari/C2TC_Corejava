package org.tns.collections;
import java.util.HashSet;
public class Hash {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String>set=new HashSet<String>();
		
		set.add("First");
		set.add("Second");
		set.add("Third");
		set.add("Fourth");
		set.add("Fifth");
		
		System.out.println("Noorder will be maintained"+set);
		
		set.add("First");
		set.add("Third");
		
		System.out.println("No Duplicate elements"+set);
		
		set.add("null");
		set.add("null");
		System.out.println("Unordered and No Duplicate HashSet Elements");
		System.out.println(set);
		

	}

}
