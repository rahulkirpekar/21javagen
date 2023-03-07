package com.royal.oops.absdemo.interfacedemo;

public interface RbiBank 
{
	// 1) Data Members
	int INTRST1=0;// public static final
	public static int INTRST2=8;// final
	public final int INTRST3=7;// static 
	static final int INTRST4=6;// public

	// 2) abstract methods
	void test1();// public abstract 
	abstract void test2();//public 
	public void test3();//abstract 
	abstract  public void test4();

	// 3) non-abstract methods
	// static method
	static void test5() 
	{
		System.out.println("RbiBank - static test5()");
	}
	// default method
	default void test6() 
	{
		System.out.println("RbiBank - default test5()");
	}
	// private method
	private void test7() 
	{
		System.out.println("RbiBank - private test5()");
	}
}
