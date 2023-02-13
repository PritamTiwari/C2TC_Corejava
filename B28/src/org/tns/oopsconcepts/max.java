package org.tns.oopsconcepts;

import java.util.Scanner;
public class max
{
public static void main(String[] args)
{
	try (Scanner in = new Scanner(System.in)) {
		System.out.println("Enter a number");
		int n1 = in.nextInt();
		int n2 = in.nextInt();
		int n3 = in.nextInt();
		if ((n1>n2) && (n1>n3))
			{
			System.out.println(n1 + "is the maximum number");
			}
		else if ((n2>n1) && (n2>n3))
		{
			System.out.println(n2 + "is the maximum number");
		}
		else
			{
			System.out.println(n3 + "is the maximum number");}
			}
	}
}