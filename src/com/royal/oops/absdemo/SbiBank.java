package com.royal.oops.absdemo;

public  abstract class SbiBank extends RbiBank
{
	public abstract void test7();
	@Override
	public void test1() 
	{
		System.out.println("SbiAhm - test1()");
	}
	@Override
	public void test2() 
	{
		System.out.println("SbiAhm - test2()");
	}

	public void test8() 
	{
		System.out.println("SbiBank - test8()");
	}
}
