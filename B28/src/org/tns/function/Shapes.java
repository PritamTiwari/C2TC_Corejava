package org.tns.function;

public class Shapes {
private static Shapes ob1;
void volume(int s)
{
	System.out.println("Volume of a cube is"+s*s*s);
}
void volume(int l,int b,int h)
{
	System.out.println("Volume of a cuboid is"+l*b*h);
}
void volume(float r)
{
	System.out.println("Volume of a sphere is"+4/3*3.14*r*r*r);
}
public static void main(String[] args) 
{
	 Shapes.ob1=new Shapes ();
			ob1.volume(2);
			ob1.volume(3,4,6);
			ob1.volume(3);
	
}
}
