package com.royal.oops.inhdemo;

public class ManagementStudent extends Student
{
	public void getManagementSubjects() 
	{
		System.out.println("ManagementStudent - getManagementSubjects() ");
	}
	public static void main(String[] args) 
	{
		ManagementStudent obj = new ManagementStudent();
		
		obj.getManagementSubjects();
		obj.getStudentInfo();
		obj.disp();
//		obj.getDetails();// C.E
	}
}
