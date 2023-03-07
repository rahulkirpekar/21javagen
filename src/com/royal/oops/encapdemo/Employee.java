package com.royal.oops.encapdemo;

import java.util.Scanner;

// POJO - "Plain Old Java Object" --- "Pure Encapsulation"
public class Employee 
{
	private int id;
	private String name;
	private String dsgn;
	
	// setters -- set values
	public void setId(int id) 
	{
		this.id=id;
	}
	public void setName(String  name) 
	{
		this.name=name;
	}
	public void setDsgn(String  dsgn) 
	{
		this.dsgn=dsgn;
	}
	// getters --get values
	public int getId() 
	{
		return id;
	}
	public String getName() 
	{
		return name;
	}
	public String getDsgn() 
	{
		return dsgn;
	}
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
}
