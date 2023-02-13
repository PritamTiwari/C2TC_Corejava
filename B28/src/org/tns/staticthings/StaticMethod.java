package org.tns.staticthings;

public class StaticMethod {
	
	//Instance Area
	static int x =20; //static variable
	int y = 30; //instance variable
	//Declare an instance method
	void display()
	{
		System.out.println(x);
		System.out.println(y);
	}
	//Declare a static method
	static void show()
	{
		//Static Area.So we can call S.V.directly inside the S.M
		int z=++x;
		System.out.println(z);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Create the object of the class
		StaticMethod st = new StaticMethod();
		//call instance method using st
		st.display();
		
		//call static method
		StaticMethod.show();
	}

}
