package com.royal.oops.stringdemo;

public class TestApp4 
{
	public static void main(String[] args) 
	{
		String name1 = "rahul";
		String name2 = "krunal";
		
		String name3 = name1.concat(name2);

		String name4 = name1 + name2;
	
		System.out.println(name1 + " " + name1.hashCode());
		System.out.println(name2 + " " + name2.hashCode());
		System.out.println(name3 + " " + name3.hashCode());
		System.out.println(name4 + " " + name4.hashCode());
		System.out.println("(name3==name4) - "+(name3==name4));
	
	
	}
}
