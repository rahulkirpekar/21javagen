package com.royal.oops.inhdemo2;
// POJO class --- Plain Old Java Object---Pure Encapsulation + [getters + setters]
public class Student 
{
	private int rno;
	private String name;
	private int std;
	//  Setters / Mutatos ----Method---Strong Encapsulation
	public void setRno(int rno) 
	{
		this.rno=rno;
	}
	public void setName(String name) 
	{
		this.name=name;
	}
	public void setStd(int std) 
	{
		this.std=std;
	}
	// Getters / Accessors ----Method
	public int getRno() 
	{
		return rno;
	}
	public String getName() 
	{
		return name;
	}
	public int getStd() 
	{
		return std;
	}	
}
