package com.royal.oops.stringdemo;
import java.util.Scanner;
public class TestApp2 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter stmt : ");
		String stmt = sc.nextLine();
		boolean flag = true;
		int count = 0; 
		for (int i = 0; i < stmt.length(); i++) 
		{
			count = 0;
			flag = true;
			for (int j = 0; j < stmt.length(); j++) 
			{
				if(i > j) 
				{
					if (stmt.charAt(i)==stmt.charAt(j)) 
					{
						flag = false;
						break;	
					}
				}
				if(flag) 
				{
					if (stmt.charAt(i)==stmt.charAt(j)) 
					{
						count++;
					}
				}
			}
			if(flag) 
			{
				System.out.println(stmt.charAt(i) + " - " + count);
			}	
		}
	}
}