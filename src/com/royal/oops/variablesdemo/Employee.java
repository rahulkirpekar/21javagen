package com.royal.oops.variablesdemo;

import java.util.Scanner;

public class Employee 
{
	private int id;
	private String name;
	private String dsgn;

	public void scan() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Id : ");
		id = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Name : ");
		name = sc.nextLine();
		System.out.println("Enter Dsgn : ");
		dsgn = sc.nextLine();
	}
	public void disp() 
	{
		System.out.println(id + " " + name + " " + dsgn);
	}
	public static void main(String[] args) 
	{
//		Employee e = new Employee();
//		e.disp();// 0 null null 
		
		int id = 0;
		String name = null;
		String dsgn = null;
		
		 System.out.println(id + " " + name + " " + dsgn);

	}
}
