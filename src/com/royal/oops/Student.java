package com.royal.oops;

public class Student 
{
	private int rno;
	private String name;
	private int std;
	
	// 1) static Block
	static
	{
		System.out.println("1) Static Block");
	}
	// Instance Block
	{
		System.out.println("4) Instance Block - " + this);
	}
	public Student() 
	{
		System.out.println("5) Default Constructor");
	}
	public Student(int rno, String name, int std) 
	{
		System.out.println("5) Parameterized Constructor");
		this.rno = rno;
		this.name = name;
		this.std = std;
	}
	
	/**
	 * @author Rahul Kirpekar
	 * @since 1994
	 */
	void nonStaticMethod() 
	{
		System.out.println("6) Student - NonStatic()");
	}
	static void staticMethod() 
	{
		System.out.println("3) Student - staticMethod()");		
	}
	public static void main(String[] args) 
	{
		System.out.println("2) START :: Main method");
		Student.staticMethod();

		Student s = new Student();
		
		s.nonStaticMethod();
		
		System.out.println("7) EXIT :: Main method");
	}
}
