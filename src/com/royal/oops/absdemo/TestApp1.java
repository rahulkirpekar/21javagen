package com.royal.oops.absdemo;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		String name = "abc";
		System.out.println(name.substring(3));
		
//		RbiBank bank = new RbiBank();
		RbiBank bank = new AxisBank();
		
		bank.test1();
		bank.test2();
		bank.test3();
		bank.test4();
		bank.test5();
		AxisBank.test6();
				
		System.out.println("-----------------");
		
		bank = new SbiAhm();
		bank.test1();
		bank.test2();
		bank.test3();
		bank.test4();
		bank.test5();
		SbiBank.test6();
		
		
		
		
		
	}
}
