package com.royal.oops.exceptiondemo;
import java.util.Scanner;

public class TestApp3 
{
	public static void isValidAgeForVote(int age) throws InvliadAgeForVoteException
	{
		System.out.println("Start -- isValidAgeForVote  method");
		if (age > 18) 
		{
			System.out.println("Welcome for Vote ");
		} else 
		{
			throw new InvliadAgeForVoteException("\"Invalid Age,please enter age greater than 18.\"");
		}
		System.out.println("Exit -- isValidAgeForVote method");
	}
	public static void main(String[] args) 
	{
		System.out.println("Start -- main method");
		System.out.println("Enter Age fot vote  : ");
		int age = new Scanner(System.in).nextInt();
		try 
		{
			isValidAgeForVote(age);
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
		// other code 
		System.out.println("Exit -- main method");
	}
}
