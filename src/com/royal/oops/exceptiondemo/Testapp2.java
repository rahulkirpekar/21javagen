package com.royal.oops.exceptiondemo;
import java.util.Scanner;
public class Testapp2 
{
	public static void main(String[] args) 
	{
		System.out.println("Statement----1");
		System.out.println("Statement----2");
		System.out.println("Statement----3");
		System.out.println("Statement----4");
		System.out.println("Statement----5");
		int no1,no2,ans=0;
		Scanner sc = new Scanner(System.in); 
		System.out.println("Enter No1 : ");
		no1 = sc.nextInt();
		System.out.println("Enter No2 : ");
		no2 = sc.nextInt();
		try
		{
			try 
			{
				String name = null;
				System.out.println(name.length());
			} catch (NullPointerException e) 
			{
				e.printStackTrace();
			}
			try 
			{
				ans = no1/no2;// ArithmeticException
			} catch (ArithmeticException e) 
			{
				e.printStackTrace();
			}
			try 
			{
				int a[] = new int[5];
				a[5] = 10;
				System.out.println(a[5]);
			} catch (ArrayIndexOutOfBoundsException e) 
			{
				e.printStackTrace();
			}
		}catch(Exception e) 
		{
			e.printStackTrace();
			System.out.println("Exception Catch block Handled");
		}
		System.out.println("Addition : " + ans);
		System.out.println("Statement----6");
		System.out.println("Statement----7");
		System.out.println("Statement----8");
		System.out.println("Statement----9");
		System.out.println("Statement----10");
	}
}
