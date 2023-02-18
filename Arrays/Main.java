package com.tns.packages;

import java.util.*;
public class Main {

	
	public static void main(String args[]) {
		long[] arr= {10,30,40,50};
		
		for (int i = 0; i < arr.length; i++) {
			
			System.out.println(Arrays.toString(arr));
			
		}
		
	//if the loop is not executed it will be printed as default
		System.out.println("This is default statement");
		System.out.println(Arrays.toString(arr));
}
}