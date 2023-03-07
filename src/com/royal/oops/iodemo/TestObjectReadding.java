package com.royal.oops.iodemo;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
public class TestObjectReadding 
{
	public static void main(String[] args) 
	{
		try (
				FileInputStream fin = new FileInputStream("C:\\Users\\Royal\\eclipse-workspace\\21javagen\\studrcd.txt");
				ObjectInputStream oin = new ObjectInputStream(fin);
			)
		{
			Student s  = (Student)oin.readObject();
			s.disp();
			
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
}