package com.royal.oops.jdbccrud;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;


public class DBConnection 
{
	public static Connection getDbConnection() 
	{
		FileInputStream fin = null;
		String URLNAME     =null;
		String DRIVERCLASS =null;
		String USERNAME    =null;
		String PASSWORD    =null;
		try 
		{
			fin = new FileInputStream("C:\\Users\\Royal\\eclipse-workspace\\21javagen\\dbconfig.properties");
			Properties prop = new Properties(); 
			prop.load(fin);
			URLNAME     =  prop.getProperty("URLNAME").trim();
			DRIVERCLASS = prop.getProperty("DRIVERCLASS").trim();
			USERNAME    = prop.getProperty("USERNAME").trim();
			PASSWORD    = prop.getProperty("PASSWORD").trim();
		} catch (FileNotFoundException e1) 
		{
			e1.printStackTrace();
		} catch (IOException e) 
		{
			e.printStackTrace();
		}
		Connection conn = null;
		try 
		{
			// 1) Load DriverClass
			Class.forName(DRIVERCLASS);
			
			// 2) Pass credential to DriverManagers' GetConnection Method
			conn = DriverManager.getConnection(URLNAME, USERNAME, PASSWORD);

			// 3) Validate Connection Object
			if(conn != null) 
			{
					System.out.println("Db Connected : " + conn);
			}else 
			{
				System.out.println("Db Not Connected : " + conn);
			}
		} catch (ClassNotFoundException e) 
		{
			e.printStackTrace();
		} catch (SQLException e) 
		{
			e.printStackTrace();
		}
		return conn;
	}
	public static void main(String[] args) 
	{
		Connection conn = DBConnection.getDbConnection();
		System.out.println(conn);
	}
}
