package org.tns.abstraction;

public class Abstraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Citi c=new Citi("Welcome to Citi Bank"); //concrete class object
		c.creditCard();
		System.out.println("Citi Rate of Interest is: "+c.getInterestRate()+"%");
		HSBC h = new HSBC ("Welcome to HSBC Bank");
		h.creditCard();
		System.out.println("HSBC Rate of Interest is: "+h.getInterestRate()+"%");

	}

}
