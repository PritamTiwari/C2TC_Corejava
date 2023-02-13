package org.tns.function;

import org.tns.function.payment;
import org.tns.function.overriding;

class payment
{
int swip_with=1000;
void show()
{
	System.out.println("super class");
}
}
public class overriding extends payment {
int swip_left=15000;
void show()
{
	super.show();
	System.out.println("child class");
}
public static void main(String[] args) {
	overriding ob=new overriding();
	ob.show();
}
}