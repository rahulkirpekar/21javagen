package com.royal.oops.inhdemo2.hasdemo;

public class Employee 
{
	private int id;
	private String name;
	private int salary			;
	private String dsgn            ;
	private String companyName     ;
	private String contactno       ;
	private Address address;
	
	public Employee(int id, String name, int salary, String dsgn, String companyName, String contactno,
			Address address) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.dsgn = dsgn;
		this.companyName = companyName;
		this.contactno = contactno;
		this.address = address;
	}
	public void disp() 
	{
		System.out.println(id + " " + name + " " + salary + " " + dsgn + " " + companyName + " " + contactno + " " + address.getHno() + " " + address.getSteetname() + " " + address.getAreaname() + " " + address.getLandmark() + " " + address.getCity() + " " + address.getState() + " " + address.getCountry());
	}
}
