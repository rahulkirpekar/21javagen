package com.royal.oops.inhdemo.hasademo;

public class Employee 
{
	int id;
	String name;
	int salary;
	String dsgn;
	String contactNo;

	Address address;
	
	public Employee() 
	{
		
	}
	public Employee(int id, String name, int salary, String dsgn, String contactNo, Address address) 
	{
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.dsgn = dsgn;
		this.contactNo = contactNo;
		this.address = address;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getDsgn() {
		return dsgn;
	}
	public void setDsgn(String dsgn) {
		this.dsgn = dsgn;
	}
	public String getContactNo() {
		return contactNo;
	}
	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
}
