package org.tns.oopsconcepts;


import java.util.Scanner;
public class library
{
public static void main(String[] args)
{
	try (Scanner in = new Scanner(System.in)){
		System.out.println("Enter the number of days to return the book");
		int days = in.nextInt();
	if (days<=5)
		{
		System.out.println("The fine is Rs "+days*1);
		}
	else if ((days>=6) && (days<=10))
	{
		System.out.println("The fine is Rs "+days*5);
	}
	else
		{
		System.out.println("The fine is Rs "+days*10);
		}
}
}
}
