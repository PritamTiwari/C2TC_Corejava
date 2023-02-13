package org.tns.inheritance;


import org.tns.inheritance.Dress;
import org.tns.inheritance.Indian;
import org.tns.inheritance.western;

public class Hierarchical {
	
	public static void main (String[] args) {
		Dress ob3=new Dress ();
		ob3.type1();
		western ob1=new western ();
		ob1.type3();
		Indian ob2=new Indian ();
		ob2.type2();
	}

}
