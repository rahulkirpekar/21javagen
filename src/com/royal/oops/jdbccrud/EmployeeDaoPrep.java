package com.royal.oops.jdbccrud;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeDaoPrep 
{
	public int insert(EmployeeBean bean) 
	{
		String insertQuery = "INSERT INTO employee(name,salary,dsgn,orgName) VALUES(?,?,?,?)";
		
		Connection conn = DBConnection.getDbConnection();
		PreparedStatement pstmt = null;
		int affectedRows = 0;
		if (conn!=null) 
		{
			try 
			{
				pstmt = conn.prepareStatement(insertQuery);
				pstmt.setString(1, bean.getName());
				pstmt.setString(2, bean.getSalary());
				pstmt.setString(3, bean.getDsgn());
				pstmt.setString(4, bean.getOrgName());
				
				affectedRows = pstmt.executeUpdate();
				
			} catch (SQLException e) 
			{
				e.printStackTrace();
			}
		} else 
		{
			System.out.println("EmployeeDaoPrep --- insert --- Db not connetced");
		}
		return affectedRows;
	}
	public int update(EmployeeBean bean) 
	{
		String updateQuery = "UPDATE employee SET name=?, salary=?, dsgn=?, orgName=? WHERE id =?";
		Connection conn = DBConnection.getDbConnection();
		PreparedStatement pstmt = null;
		int rowsAffected = 0;
		if(conn!=null)
		{
			try 
			{
				pstmt = conn.prepareStatement(updateQuery);
				pstmt.setString(1, bean.getName());
				pstmt.setString(2, bean.getSalary());
				pstmt.setString(3, bean.getDsgn());
				pstmt.setString(4, bean.getOrgName());
				pstmt.setInt(5, bean.getId());
				
				rowsAffected = pstmt.executeUpdate();
			} catch (SQLException e) 
			{
				e.printStackTrace();
			}
		}else 
		{
			System.out.println("EmployeeDaoPrep---update---Db not connected");
		}
		return rowsAffected;
	}
	public int delete(int id) 
	{
		String deleteQuery =" DELETE FROM employee where id = ?";
		Connection conn = DBConnection.getDbConnection();
		PreparedStatement pstmt = null;
		int rowsAffected = 0;
		if(conn!=null)
		{
			try 
			{
				pstmt = conn.prepareStatement(deleteQuery);
				pstmt.setInt(1, id);
				rowsAffected = pstmt.executeUpdate();
			} catch (SQLException e) 
			{
				e.printStackTrace();
			}
		}else 
		{
			System.out.println("EmployeeDaoPrep---delete---Db not connected");
		}
		return rowsAffected;
	}
	public ArrayList<EmployeeBean> getAllRecords() 
	{
		String selectQuery = "select * from employee";
		Connection conn = DBConnection.getDbConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		EmployeeBean ebean = null;
		ArrayList<EmployeeBean> list = new ArrayList<EmployeeBean>();
		if (conn!=null) 
		{
			try 
			{
				pstmt = conn.prepareStatement(selectQuery);
				rs = pstmt.executeQuery(); 
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
			System.out.println("EmployeeDaoPrep --- getAllRecords() --Db not Connected");
		}
		return list;
	}
	public static void main(String[] args) 
	{
		EmployeeDaoPrep dao = new EmployeeDaoPrep();
		
		ArrayList<EmployeeBean> list = dao.getAllRecords();
		
		for (int i = 0; i < list.size(); i++) 
		{
			EmployeeBean e = list.get(i);
			
			System.out.println(e.getId() + " " + e.getName() + " "+ e.getSalary() + " " + e.getDsgn() + " "+ e.getOrgName());
		}
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter Id which you want to Update : ");
//		int id = sc.nextInt();
//		sc.nextLine();
//		System.out.println("Enter Name : ");
//		String name = sc.nextLine();
//		System.out.println("Enter Salary : ");
//		String salary = sc.nextLine();
//		System.out.println("Enter Dsgn : ");
//		String dsgn = sc.nextLine();
//		System.out.println("Enter OrgName : ");
//		String orgName = sc.nextLine();
//		EmployeeBean bean = new EmployeeBean(id, name, salary, dsgn, orgName);
//		EmployeeDaoPrep dao = new EmployeeDaoPrep();
//		int affectedRows = dao.update(bean);
//		if (affectedRows > 0) 
//		{
//			System.out.println("Employee record successfully Updated");
//		} else 
//		{
//			System.out.println("Employee record not Updated");
//		}
	}
}
