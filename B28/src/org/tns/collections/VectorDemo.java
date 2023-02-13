package org.tns.collections;
import java.util.ArrayList;
import java.util.Vector;
public class VectorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<String>v=new Vector<String>();
		
		int size=v.size();
		System.out.println("Size of vector before adding elements: " +size);
		
		v.add("Red");
		v.add("Green");
		v.add("Yellow");
		v.add("pink");
		v.add("White");
		System.out.println("Vector elements: "+v);
		
		int vectorsize=v.size();
		System.out.println("Size: "+vectorsize);
		
		int capacity=v.capacity();
		System.out.println("Default capacity: "+capacity);
		
		v.addElement(null);
		v.addElement("sara");
		v.add(5,"jeevan");
		int newsize=v.size();
		System.out.println("New size after adding elements: "+newsize);
		
		int newcapacity=v.capacity();
		System.out.println("New capacity after adding elements: "+newcapacity);
		System.out.println("Elements order after addition: "+v);
		
		ArrayList al=new ArrayList();
		
		al.add("Brown");
		al.add("Black");
		
		v.addAll(al);
		
		int vsize=v.size();
		System.out.println("size:" +vsize);
		int vcapacity=v.capacity();
		System.out.println("Vcapacity:" +vcapacity);
		
		v.add("suma");
		System.out.println("Elements:"+v);
		
		int vecsize=v.size();
		System.out.println("Size after adding 11th element:" +vecsize );
		
		int cap=v.capacity();
		System.out.println("Capacity after adding 11th element: " +cap);
		
		

	}

}
