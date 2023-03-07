package com.royal.oops;

public class TestApp2 
{
	public static void main(String[] args) // 20 10 + 
	{
		int no1 = Integer.parseInt(args[0]);
		int no2 = Integer.parseInt(args[1]);
		int ans =0 ;
		
		switch (args[2]) 
		{
			case "+": ans = no1 + no2;
					  System.out.println("Addition : " + ans);	
					  break;
			case "-": ans = no1 - no2;
					  System.out.println("Subtraction : " + ans);	
					  break;
			case "*": ans = no1 * no2;
					  System.out.println("Multiply : " + ans);	
					  break;
			case "/": ans = no1 / no2;
					  System.out.println("Division : " + ans);	
					  break;

			default: System.out.println("Invalid Choice,\n\t Please enter between 1to 4 choice");
					break;
		}	
	}
}
