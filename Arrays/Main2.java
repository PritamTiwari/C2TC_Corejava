package com.tns.packages;

import java.util.Arrays;

public class Main2 {

	
	
public static void main(String [] args) {
	
	
	//2d arrays
	
	
	String[][] cars=new String[3][3];
	cars[0][0]= "Mustang gt";
	cars[0][1]= "Ford";
	cars[0][2]= "F1";
	cars[1][0]= "Rallycar";
	cars[1][1]= "Monster truck";
	
	cars[1][2]= "Nascar";	
	
	cars[2][0]= "Drift car";
	cars[2][1]= "Hill climber";
	cars[2][2]= "Derby car";
	
	for (int row = 0; row < cars.length; row++) {
		System.out.println();
		
		for (int col = 0; col < cars[row].length; col++) {
		System.out.println((cars[row][col]));	
		}
	}
	
	
	
	
	
	//String representation
	
System.out.println(Arrays.toString(cars));	
	
	
	
}
	
}
