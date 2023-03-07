package com.royal.oops.inndeclassdemo;

public class TestA 
{
	private int no = 100;
	public void display() 
	{
		class Local
		{
			void msg() 
			{
				System.out.println("no - " + no);
			}
		}
		Local l = new Local();
		l.msg();
	}
	public static void main(String[] args) 
	{
		TestA obj = new TestA();
		obj.display();
	}
}
