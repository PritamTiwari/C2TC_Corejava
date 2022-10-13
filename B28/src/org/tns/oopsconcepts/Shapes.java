package org.tns.oopsconcepts;
class Shapes {
	void volume (int s) {
		System.out.println("Volume of cube is"+s*s*s);
	}

void volume (int l,int b,int h) {
		System.out.println("Volume of cuboid is"+l*b*h);
	}
void volume (float r) {
	System.out.println("Volume of sphere is"+4/3*3.14*r*r*r);
}

public static void main(String[] args) 
ob.volume(2)
ob.volume(3,4,6)
ob.volume(2)