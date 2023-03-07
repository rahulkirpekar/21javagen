package com.royal.oops.thisdemo;

import java.util.ArrayList;

public class Student 
{
	private int rno;
	private String name;
	private int std;
	private float marks;
	public Student() 
	{
		System.out.println("Default Constructor");
	}
	public Student(int rno,String name) 
	{
		this();
		System.out.println("Para Constructor---TWO");
		this.rno  = rno;
		this.name = name;
	}
	public Student(int rno,String name,int std) 
	{
		this(rno,name);		
		System.out.println("Para Constructor---THREE");
		this.std  = std;
	}
	public Student(int rno,String name,int std,float marks) 
	{
		this(rno,name,std);
		System.out.println("Para Constructor---FOUR");
		this.marks = marks;
	}
	public void disp() 
	{
		System.out.println(rno +" " + name + " "+std + " " + marks + " - "+ this);
	}
	public static void main(String[] args) 
	{
		System.out.println("START :: Main method");
		
		ArrayList<String> name = new ArrayList<String>();
		
		name.add("rahul");
		name.add("krunal");
		name.add("rakesh");
		name.add("arjun");
		
		name.remov
		
		Student s1 = new Student(4,"rakesh",12,122.2f);
		s1.disp();
		System.out.println("EXIT :: Main method");
	}
}