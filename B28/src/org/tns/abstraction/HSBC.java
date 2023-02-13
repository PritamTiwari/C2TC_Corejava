package org.tns.abstraction;

public class HSBC extends Bank {
	String name;
	HSBC (String name) //parameterized constructor
	{
		this.name=name;
		System.out.println(name);
	}
	void creditCard() //instance method
	{
		int credit_limit=450000;
		System.out.println("Yearly charges applicable with the credit limit" + credit_limit);
	}
	int getInterestRate () //abstract method implementation
	{
		return 6;
	}
}
