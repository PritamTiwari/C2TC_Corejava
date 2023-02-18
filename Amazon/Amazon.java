package com;

public class Amazon extends Main {

	@Override
	void account() {
		System.out.println("Amazon primeaccount doesn't have delivery charge");
		
	}

	class nonprime extends Main{

		@Override
		void account() {
			System.out.println("Non-Prime Accont have the delivery charge");
			
		}
		
		
	}
	
}