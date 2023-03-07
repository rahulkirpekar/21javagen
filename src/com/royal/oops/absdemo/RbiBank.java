package com.royal.oops.absdemo;

// 0 to 100%
public abstract class RbiBank 
{
	// 1) Dm's
	
	// 2) constructor and Overloadding

	// 3) NonAbstract Methods
	public void test5() 
	{
		System.out.println("RbiBank -- test5()");
	}
	// 4) Abstract Methods
	public abstract void test1();
	public abstract void test2();
	public abstract void test3();
	public abstract void test4();
	
	// 5) static methods
	public static void test6() 
	{
		System.out.println("RbiBank - static test6 method");
	}
}
