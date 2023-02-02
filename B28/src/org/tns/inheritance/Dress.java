package org.tns.inheritance;

import org.tns.inheritance.Dress;

class Dress
{
	void type1()
	{
		System.out.println("The various designs of dress are");
	}
}
class Indian extends Dress
{
	void type2()
	{
		System.out.println("Chudidar");
	}
}
class western extends Dress
{
	void type3()
	{
		System.out.println("Jeans");
	}
}