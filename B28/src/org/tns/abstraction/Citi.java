package org.tns.abstraction;
//concrete class
public class Citi extends Bank {
	String name;
	Citi (String name) //parameterized constructor
	{
		this.name=name;
		System.out.println(name);
	}
	void creditCard() //instance method
	{
		int credit_limit=350000;
		System.out.println("Yearly charges applicable with the credit limit" + credit_limit);
	}
	int getInterestRate () //abstract method implementation
	{
		return 7;
	}
}