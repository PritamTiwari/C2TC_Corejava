package org.tns.oopsconcepts;

import java.util.Scanner;
public class Sd 
{
public static void main(String[] args)
{
	try (Scanner sc = new Scanner(System.in)) {
	String name = sc.nextLine();
	int age = sc.nextInt();
	int m1 = sc.nextInt();
	int m2 = sc.nextInt();
	int m3 = sc.nextInt();
	int total = m1+m2+m3;
	float avg = total/3;
	System.out.println("Name: "+name);
	System.out.println("Age: "+age);
	System.out.println("M1: "+m1);
	System.out.println("M2: "+m2);
	System.out.println("M3: "+m3);
	System.out.println("Total: "+total);
	System.out.println("Avg: "+avg);
	}
	}
}
