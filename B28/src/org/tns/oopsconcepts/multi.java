package org.tns.oopsconcepts;

import java.util.Scanner;
public class multi 
{
public static void main(String[] args)
{
	try (Scanner in = new Scanner(System.in)) {
	System.out.println("Enter a number");
	int n = in.nextInt();
	if (n%3 == 0)
	{
		System.out.println(n + "is a multiples of 3");
	}
	else System.out.println(n + "is not a multiples of 3");
	}
}
}