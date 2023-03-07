package com.royal.oops.iodemo;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class TestFileWriter 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name : ");
		String name  =  sc.nextLine();
		FileWriter fw = null;
		try 
		{
			fw = new FileWriter("test3.txt");
			fw.write(name);
		} catch (IOException e) 
		{
			e.printStackTrace();
		} finally 
		{
			try 
			{
				fw.close();
			} catch (IOException e) 
			{
				e.printStackTrace();
			}
		}
	}
}
