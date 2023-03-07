package com.royal.oops.encapdemo;

public class TestApp1 
{
	public static void istest(int a[]) 
	{
		int sum=0;
		for (int i = 0; i < a.length; i++) 
		{
			a[i] = a[i] + 1;
		}
		System.out.println(sum);
	}
	public static void main(String[] args) 
	{
		int a[] = {1,2,3,4,5};

		istest(a);
		System.out.println("After test call method --");
		for (int i = 0; i < a.length; i++) 
		{
			System.out.println(a[i]);
		}
//		e.setId(1);
//		e.setName("Rahul");
//		System.out.println(e.getId() + " " + e.getName());
//		e.setDsgn("SE");
//		System.out.println(e.getId() + " " + e.getName() + " " + e.getDsgn());
	
		
	}
}
