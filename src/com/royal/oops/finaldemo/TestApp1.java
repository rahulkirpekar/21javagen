package com.royal.oops.finaldemo;

// static final 
public class TestApp1 
{
	final int no;
	
	public TestApp1() 
	{
		no=20;
	}
	public TestApp1(int no) 
	{
		this.no=no;
	}
	public static void main(String[] args) 
	{
		TestApp1  obj = new TestApp1();

		System.out.println("Updated No : " + obj.no);
	}
}
