package com.royal.oops.staticdemo;

import java.util.Scanner;

public class Student {
	private int rno;
	private String name;
	private int std;
	private static String sname;

	public static void setSchoolName() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter SchoolName : ");
		sname = sc.nextLine();
	}
	public void scan() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Rno : ");
		rno = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Name : ");
		name = sc.nextLine();
		System.out.println("Enter Std : ");
		std = sc.nextInt();
	}
	public void disp() 
	{
		System.out.println(rno + " " + name + " " + std + " "  +sname);
	}
	public static void main(String[] args) 
	{
		Student.setSchoolName();
		Student s[] = new Student[5];
		for (int i = 0; i < s.length; i++) 
		{
			s[i] = new Student();
			s[i].scan();
		}
		for (int i = 0; i < s.length; i++) 
		{
			s[i].disp();
		}

	}
}
