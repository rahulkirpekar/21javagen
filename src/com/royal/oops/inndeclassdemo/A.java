package com.royal.oops.inndeclassdemo;

public class A 
{
	private int no=100;
	// Member Innerclass
	class B
	{
		void msg() 
		{
			System.out.println("B - msg()--- "+no);
		}
	}
}
