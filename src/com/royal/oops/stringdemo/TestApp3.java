package com.royal.oops.stringdemo;

import java.util.Scanner;

public class TestApp3 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name1 ");
		String name1 = sc.nextLine();
		System.out.println("Enter Name2 ");
		String name2 = sc.nextLine();
		// both string same then return 0
		System.out.println(name1.compareTo(name2));
		if ((name1.compareTo(name2))== 0) 
		{
			System.out.println("Both strings are same ");
		} else 
		{
			System.out.println("Both strings are not same ");
		}
	}
}
