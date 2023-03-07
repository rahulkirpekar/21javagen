package com.royal.oops.enumdemo;

/*
 * 1) valueOf---string if exists---Enum return
 * 2) values---return array of enum constant
 * 3) ordinal----enum--constant value--indexreturn
 * */


public enum Month 
{
	January,FEBRUARY,MARCH;
	
	public static void main(String[] args) 
	{
		Month month = Month.FEBRUARY;
		
		System.out.println(month);
		
	}
}
