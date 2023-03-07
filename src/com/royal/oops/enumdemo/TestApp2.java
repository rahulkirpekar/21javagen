package com.royal.oops.enumdemo;

enum Color
{
	RED,YELLOW,GREEN;
}
public class TestApp2 
{
	public static void main(String[] args) 
	{
		Color c[] = Color.values(); // 	RED,YELLOW,GREEN;
		
		//for(int i=0; i < c.length ; i++) 
		// Enhanced for loop / Advanced for loop / for:each loop
		for( Color value : c)
		{
			System.out.println(value + " - " + value.ordinal());// RED , YELLOW , GREEN
		}
		
		System.out.println(Color.valueOf("WHITE"));
		
//		int a[] = {1,2,3,4,5};
//		for(int temp : a) 
//		{
//			System.out.println(temp);
//		}
	}
}
