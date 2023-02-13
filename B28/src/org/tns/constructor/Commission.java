package org.tns.constructor;

import org.tns.constructor.Commission;

public  class Commission {
	 
	static int  Sales_amount;
	String Name;
	int Phone;
	String Address;
	public static void main (String[] args) {
		
		System.out.println("Calculate the commission");
		
	}
		
	static void accept() {
		if (Sales_amount>=100000);
		{
			System.out.println("commission=10%");
		}
		if (Sales_amount>=50000 && Sales_amount<100000);
		{
			System.out.println("commission=5%");
		}
		if (Sales_amount>=30000 && Sales_amount<50000);
		{
			System.out.println("commission=3%");
		}
		if (Sales_amount<30000);
		{
			System.out.println("no commission");
		}
	}
	static void calculate() {
		System.out.println("Calculate the commission" );
	}
}

