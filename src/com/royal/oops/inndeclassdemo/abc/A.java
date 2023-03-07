package com.royal.oops.inndeclassdemo.abc;

public class A 
{
	static int data = 100;
	// Nested Class
	static class B
	{
		void msg() 
		{
			System.out.println("Data : " + data + " ---> " + this);
		}
	}
	public static void main(String[] args) 
	{
		A.B inObj = new A.B();
			
		inObj.msg();
	}
}
