package com.royal.oops.threaddemo;

public class TestApp3 extends Thread
{
	public void run() 
	{
			if(Thread.currentThread().isDaemon()) 
			{
				System.out.println(" Hi I am Daemon Thread. and My Name is " + Thread.currentThread().getName());
			}else 
			{
				System.out.println(Thread.currentThread().getId() + " - " + Thread.currentThread().getName() );
			}	
	}
	public static void main(String[] args) 
	{
		TestApp3 th1 = new TestApp3();
		TestApp3 th2 = new TestApp3();
		TestApp3 th3 = new TestApp3();
		
		th1.setDaemon(true);
		
		th1.start();
		th2.start();
		th3.start();
		
	}
}
