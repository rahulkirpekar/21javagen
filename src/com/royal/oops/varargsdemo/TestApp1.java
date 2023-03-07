package com.royal.oops.varargsdemo;

public class TestApp1 
{
	static void add(Student...s)
	{
		System.out.println(s.length);

		for (int i = 0; i < s.length; i++) 
		{
			s[i].disp();
		}
	}
	public static void main(String[] args) 
	{
		add(new Student(1,"rahul",12),new Student(2,"rakesh",10),new Student(3,"abcd",10));
	}
}
