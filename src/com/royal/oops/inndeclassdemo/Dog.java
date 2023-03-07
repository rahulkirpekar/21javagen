package com.royal.oops.inndeclassdemo;

public class Dog extends Animal
{
	@Override
	public void eat() 
	{
		System.out.println("Dog -- eat()");
	}
	public static void main(String[] args) 
	{
		Dog d = new Dog();
		
		d.eat();
		
	}
}
