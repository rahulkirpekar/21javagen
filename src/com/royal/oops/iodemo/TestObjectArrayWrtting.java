package com.royal.oops.iodemo;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class TestObjectArrayWrtting 
{
	public static void main(String[] args) 
	{
		Student s[] = new Student[5];

		for (int i = 0; i < s.length; i++) 
		{
			s[i] = new Student();
			s[i].scan();
		}
		try 
		{
			FileOutputStream fout = new FileOutputStream("studrcd.txt");
			ObjectOutputStream out = new ObjectOutputStream(fout);
		
			out.writeObject(s);
			System.out.println("success");
			out.close();
		} catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		} catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
}
