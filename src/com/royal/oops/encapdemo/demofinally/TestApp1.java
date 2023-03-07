package com.royal.oops.encapdemo.demofinally;

import java.io.IOException;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		
		try 
		{
			System.out.println(10/0);
		}catch(NullPointerException e) 
		{
			System.out.println("Exception Handled by Catch Block");
			e.printStackTrace();
		} finally 
		{
			System.out.println("IMP Code executed");
		}
		System.out.println("After try catch finally block");
	}
}
