package org.tns.finalexample;
class methodTest
{
	methodTest() //constructor
	{
		System.out.println("This is a Default constructor");
	}
	final int a =55; //final variable
	void show() //final method
	{
		System.out.println("Value of a: " +a);
	}
}

public class finalmethod extends methodTest {
	void show()
	{
		System.out.println("This is the final method of finalMethodEx class");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create finalmethod
		finalmethod fm = new finalmethod();
		//call finalmethod
		fm.show();
		
	}

}
