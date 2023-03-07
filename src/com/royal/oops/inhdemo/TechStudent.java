package com.royal.oops.inhdemo;

public class TechStudent extends Student
{
	public void getDetails() 
	{
		System.out.println("TechStudents - getDetails");
	}
	public static void main(String[] args) 
	{
		TechStudent obj = new TechStudent();
		
		obj.disp();
		obj.getDetails();
		obj.getStudentInfo();

//		Student s = new Student();
//		s.getStudentInfo();
//		s.disp();
//		s.getDetails();// C.E
		
//		Person p = new Person();
//		p.disp();
//		p.getStudentInfo();//C.E
		
	}

}
