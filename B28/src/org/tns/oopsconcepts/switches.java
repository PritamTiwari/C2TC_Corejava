package org.tns.oopsconcepts;
import java.util.Scanner;
public class switches 
{
public static void main(String[] args)
{
	try (Scanner in = new Scanner(System.in)) {
	System.out.println("Enter the time:");
	int time = in.nextInt();
	if ((time>0) && (time<=24))
	{
		if ((time>12) && (time<=18)) {
		System.out.println("Switch off the light");
	}
	else if ((time>=18) && (time<=22))
	{
		System.out.println("Switch on the light");
	}
	else {
		System.out.println("Switch off the light");
	}
	}
	}
}
}