package com.royal.oops.threaddemo;

public class TestApp2 
{
	public static void main(String[] args) 
	{
		// resource --Table
		Table t  = new Table();
		
		MyThread1 myThread1 = new MyThread1(t);
		MyThread2 myThread2 = new MyThread2(t);
	
		myThread1.start();
		myThread2.start();
	}
}
