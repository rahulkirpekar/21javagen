package com.royal.oops.inndeclassdemo;

public class TestApp2 
{
	public static void main(String[] args) 
	{
		Animal animal = new Animal() 
		{
			public void eat() 
			{
				System.out.println("Animal : eat()---" + this);
			}
		}; 
		animal.eat();		
	} 
}
