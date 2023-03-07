package com.royal.oops.jdbccrud;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeDao 
{
	public int insert(EmployeeBean ebean) 
	{
		String insertQuery = "INSERT INTO Employee(name,salary,dsgn,orgName) VALUES('"+ebean.getName()+"','"+ebean.getSalary()+"','"+ebean.getDsgn()+"','"+ebean.getOrgName()+"')";
		Connection conn = DBConnection.getDbConnection();
		Statement stmt = null;
		int rowsAffected = 0;
		if (conn!=null) 
		{
			try 
			{
				stmt = conn.createStatement();
				
				rowsAffected = stmt.executeUpdate(insertQuery);
				
				
			} catch (SQLException e) 
			{
				e.printStackTrace();
			}
		} else 
		{
			System.out.println("EmployeeDao - insert() --- Db not Connected : ");
		}
		return rowsAffected;
	}
	public int update(EmployeeBean ebean) 
	{
		String updateQuery = "UPDATE employee SET name = '"+ebean.getName()+"' , salary = '"+ebean.getSalary()+"', dsgn = '"+ebean.getDsgn()+"', orgName = '"+ebean.getOrgName()+"' WHERE id ="+ ebean.getId();
		Connection conn = DBConnection.getDbConnection();
		Statement stmt = null;
		int affectedRows  = 0 ;
		if (conn!=null) 
		{
			try 
			{
				stmt = conn.createStatement();
				affectedRows = stmt.executeUpdate(updateQuery);
			
			} catch (SQLException e) 
			{
				e.printStackTrace();
			}
		} else 
		{
			System.out.println("EmployeeDao - update -- Db not Conneted");
		}
		return affectedRows ;

	}
	public int delete(int id) 
	{
		String deleteQuery = "DELETE FROM employee WHERE id="+id;
		Connection conn = DBConnection.getDbConnection();
		Statement stmt = null;
		int rowAffected = 0;
		if (conn != null) 
		{
			try 
			{
				stmt = conn.createStatement();
			
				rowAffected = stmt.executeUpdate(deleteQuery);
			
			} catch (SQLException e) 
			{
				e.printStackTrace();
			}
		} else 
		{
			System.out.println("EmployeeDao - delete --- Db not connected");
		}
		return rowAffected;
	}
	public ArrayList<EmployeeBean> getAllRecords() 
	{
		String selectQuery = "select * from employee";
		Connection conn = DBConnection.getDbConnection();
		Statement stmt = null;
		ResultSet rs = null;
		EmployeeBean ebean = null;
		ArrayList<EmployeeBean> list = new ArrayList<EmployeeBean>();
		if (conn!=null) 
		{
			try 
			{
				stmt = conn.createStatement();
				rs = stmt.executeQuery(selectQuery); 
				while(rs.next()) 
				{
					int id = rs.getInt(1);
					String name = rs.getString(2);
					String  salary = rs.getString(3);
					String  dsgn = rs.getString(4);
					String orgName = rs.getString(5);
					ebean = new EmployeeBean(id, name, salary, dsgn, orgName);
					list.add(ebean);
				}
				
			} catch (SQLException e) 
			{
				e.printStackTrace();
			}
		} else 
		{
			System.out.println("EmployeeDao --- getAllRecords() --Db not Connected");
		}
		return list;
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Name : ");
		String name = sc.nextLine();
		System.out.println("Enter Salary : ");
		String salary = sc.nextLine();
		System.out.println("Enter Dsgn : ");
		String dsgn = sc.nextLine();
		System.out.println("Enter OrgName : ");
		String orgName = sc.nextLine();
		
		System.out.println("Enter Employee Id which you want to update  : ");
		int id = sc.nextInt();

		EmployeeBean bean = new EmployeeBean(id, name, salary, dsgn, orgName);
				
		EmployeeDao dao = new EmployeeDao();
				
		int affectedRows = dao.update(bean);
		
		if (affectedRows > 0 ) 
		{
			System.out.println("Employee data successfully updated : " + affectedRows);
		} else 
		{
			System.out.println("Employee data not updated : " + affectedRows);

		}
		
		
		
//		System.out.println("Enter Id which you want to delete : ");
//		int id = new Scanner(System.in).nextInt();
		
//		ArrayList<EmployeeBean> list = dao.getAllRecords();
		 
//		for (int i = 0; i < list.size(); i++) 
//		{
//			EmployeeBean ebean = list.get(i);
//			System.out.println(ebean.getId() + " " + ebean.getName() + " " +ebean.getDsgn() + " " + ebean.getSalary() + " " + ebean.getOrgName());
//		}
//		int rowsAffected = dao.delete(id);
//		if (rowsAffected > 0 ) 
//		{
//			System.out.println("Employees records successfully Deleted");
//		} else 
//		{
//			System.out.println("Employees records not Deleted");
//		}
	} 
}
