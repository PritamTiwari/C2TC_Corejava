package Handlers;

public class ThrowKeyword {
	
	
	//Static method is not depending on any Object
static void avg() {
	try {
		throw new ArithmeticException("demo");
	} catch (ArithmeticException e) {
		System.out.println("Exception Caught");
}
	//finally always executed
	finally {
		System.out.println("throw executed Successfully");
	}
}


public static void main(String[] args) {
	
	//Non_static methods can't run in static method without Instance
	avg();
}


}