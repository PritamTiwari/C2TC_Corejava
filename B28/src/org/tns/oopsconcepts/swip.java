package org.tns.oopsconcepts;
class payment
{
int swip_with=1000;
void show()
{
	System.out.println("super class");
}
}
public class swip extends payment {
int swip_left=15000;
void show()
{
	super.show();
	System.out.println("child class");
}
public static void main(String[] args) {
	swip ob=new swip();
	ob.show();
}
}
