package com.royal.oops.lambdademo;

import java.util.Scanner;

public class TestApp 
{
	public static void main(String[] args) 
	{
		Calc calc = (no1,no2) -> System.out.println((no1+no2));
											
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter No1 : ");
		int no1 = sc.nextInt();
		System.out.println("Enter No2 : ");
		int no2 = sc.nextInt();

		calc.add(no1,no2);				
		
	}
}
