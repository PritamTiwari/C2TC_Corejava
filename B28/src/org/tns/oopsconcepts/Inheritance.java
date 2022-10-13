package org.tns.oopsconcepts;
public class Inheritance {
	public static void main(String[] args) {
		//TODO Auto-generated method stub
	Withdraw ob=new Withdraw();//create child class object
	System.out.println("the total amount"+ ob.total_savings);//accessing parent class member
	System.out.println("the total amount"+ ob.withdraw);
}
}
