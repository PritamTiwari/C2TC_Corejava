package com;

import java.util.Scanner;

public class TestClass {

	public static void main(String[] args) {
		
		//Array is used store the user details
		
		String[] arr= {"prime" ,"Nonprime","NOaccount"};
		
		//Attributes
		String c="Nonprime";
		String T="Prime";
		String e="NOaccount";
	
		
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the Account Type" +""+"Choose :Prime ,Nonprime, Noaccount");
		
		String name=in.nextLine();
		
		
		if (name.equals(T)) {
			System.out.println(" Free Delivery ");
			
		}
		else if (name.equals(c)) {
			System.out.println("Need to pay the charge of delivery");
		}
		
		//Thrid PArty Access
		if (name.equals(e)) {
			
			System.out.println("No access for acc resource");
			
		} 
		
		
		
		
	}

}