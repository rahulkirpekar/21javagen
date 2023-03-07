package com.royal.oops.iodemo;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
public class TestAppFileInputStream 
{
	public static void main(String[] args)
	{
		StringBuilder sb = new StringBuilder();
		FileInputStream fin = null;
		FileOutputStream fout = null;
		try 
		{
			fin = new FileInputStream("C:\\Users\\Royal\\eclipse-workspace\\21javagen\\src\\com\\royal\\oops\\iodemo\\TestAppFileOutputStream.java");
			int temp ;
			fout = new FileOutputStream("CopyofFileOutputStream.java");
			while(	(temp = fin.read()) != -1) 
			{
				sb.append((char)temp);
				fout.write(temp); 
			}
		} catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		}catch (IOException e) 
		{
			e.printStackTrace();
		}finally 
		{
			try 
			{
				fout.close();
				fin.close();
			} catch (IOException e) 
			{
				e.printStackTrace();
			}
		}
		System.out.println(sb.toString());
	}
}
