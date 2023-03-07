package com.royal.oops.iodemo;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class TestAppFileOutputStream 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name : ");
		
		String name = sc.nextLine();// a  b  c  d
		
		name = " "+name+" ";
		
		byte b[] = name.getBytes(); // 97 98 99 100 
		
		
		for (int i=0;i<name.length();i++) 
		{
			System.out.println(name.charAt(i) + "  - " + b[i]);
		}
		System.out.println("------------------------");
		

		FileOutputStream fout = null;
		// 1) file connection
		try 
		{
//			FileOutputStream fout = new FileOutputStream("test1.txt");
			fout =  new FileOutputStream("test1.txt",true);
			fout.write(b);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}finally 
		{
			try 
			{
				fout.close();
			} catch (IOException e) 
			{
				e.printStackTrace();
			}
			System.out.println("Successfully wrte name in file");
		}
	}
}
