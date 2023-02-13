package org.tns.collections;
import java.util.Set;
import java.util.TreeSet;
public class Treeset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> set=new TreeSet<>();
		for(int i=5;i>0;i--)
		{
			set.add(i);
		}
		for(int i:set)
		{
			System.out.println(i);
		}

	}

}
