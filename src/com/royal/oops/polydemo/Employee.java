package com.royal.oops.polydemo;

public class Employee extends Person
{
	private int id;
	private int salary;
	private String dsgn;
	public Employee() 
	{
	}
	public void testEmp()
	{
		System.out.println("Employee -  testEmp ");
	}
	public static void main(String[] args) 
	{
//		Employee e = new Employee();
//		Person p = new Person();
		
// 		Late Binding / Dynamnic Binding / Runtime Polymorphism / Polymorphic Object
//      upcasting
		Person p = new Employee();

		p.testPerson();
		
		// DownCasting
		((Employee) p).testEmp();
		
		// e - reference variable
		// e is type of Employee
		// new - keyword -- memory allocation of object at runtime  
		// Employee - Object
//		Employee e = new Employee();
	}
}
