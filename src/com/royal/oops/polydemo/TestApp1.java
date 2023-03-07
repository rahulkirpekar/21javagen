package com.royal.oops.polydemo;

import java.util.Scanner;
/*
Can we overload java main() method?

Yes, by method overloading. 

You can have any number of main methods in a class by method overloading. But JVM
calls main() method which receives string array as arguments only. 
*/
public class TestApp1 
{
	public static void main(int no1,int no2) 
	{
		double ans = no1+no2;
		System.out.println("Two int Args Methods --- Addition : "+ans);
	}
	public static void main(long no1,long no2) 
	{
		long ans = no1+no2;
		System.out.println("Two long Args Methods --- Addition : "+ans);
	}

	public static void main(String[] test) 
	{
		TestApp1.main('R','B');			
	}
}
