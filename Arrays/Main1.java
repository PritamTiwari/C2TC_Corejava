package com.tns.packages;

import java.util.Iterator;
import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		String [] arr=new String[5];
		
		Scanner in =new Scanner(System.in);
		try {
			for(int i=0; i<=arr.length;i++) {

				System.out.println(arr[i]);
			}
		} catch (Exception e) {
			System.out.println("Array out of bounds Exception");
		}
	
	}
	

}