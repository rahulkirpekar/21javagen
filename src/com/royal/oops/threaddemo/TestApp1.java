package com.royal.oops.threaddemo;

import java.util.Scanner;

public class TestApp1 extends Thread
{
	// Thread---job
	@Override
	public void run() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Table No : ");
		int no = sc.nextInt();//th1---5		|	th2 ---10
		for (int i = 1; i <=10; i++) 
		{
			try 
			{
				Thread.sleep(500);
				System.out.println(Thread.currentThread().getName() + " - "+  no + " " + i + " " + (no*i));
			} catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) 
	{
		TestApp1 th1 = new TestApp1();
		TestApp1 th2 = new TestApp1();
		TestApp1 th3 = new TestApp1();
		TestApp1 th4 = new TestApp1();
		TestApp1 th5 = new TestApp1();
		
		
		th1.setName("AxisBank");
		th2.setName("BOB");
		th3.setName("SBI");
		th4.setName("HDFC");
		th5.setName("RBIBANK");
		
		th5.setPriority(MAX_PRIORITY);
		
		
		
		
		
		
		th1.start();//---run()---no--10
		th2.start();//---run()---no--20
		th3.start();//---run()---no--30
		th4.start();//---run()---no--40
		th5.start();//---run()---no--50
//		th1.start();// IllegalThreadStateException

	}
}
