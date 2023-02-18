package com.inherit;

public class bikes {

	
	void type()
	{
		String model="Sports";
		System.out.println("Sports bike's are GREAT in track");
		
		
	}
	
	
}


class  cruiser extends bikes{
	
	void use() {
		 
		
		System.out.println("cruiser bike's are GREAT for long rides");
		
}
}


class riding extends cruiser{
	
	
void riders() {
	System.out.println("Anyhow both bikes are good at their designs and performance");
	
	
}}