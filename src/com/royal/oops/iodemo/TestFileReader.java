package com.royal.oops.iodemo;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
public class TestFileReader 
{
	public static void main(String[] args) 
	{
		FileReader fr = null;
		try 
		{
			fr = new FileReader("C:\\Users\\Royal\\eclipse-workspace\\21javagen\\src\\com\\royal\\oops\\iodemo\\TestFileReader.java");
			int temp;
			while(	(temp = fr.read()) != -1) 
			{
				System.out.print((char)temp);
			}
		} catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		} catch (IOException e) 
		{
			e.printStackTrace();
		}finally 
		{
			try {
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}
