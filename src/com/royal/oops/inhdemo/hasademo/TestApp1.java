package com.royal.oops.inhdemo.hasademo;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		Address add1 = new Address("21", "abcd", "navrang", "shreji", "ahm", "guj", "ind", "382443");
		
		Employee e = new Employee(1, "rahul", 1234, "SE", "7874014621",add1); 

		System.out.println(e.getId() + " " + e.getName() + " " + e.getDsgn() + " " +e.getSalary()  );
		
		Address add2 = 	e.getAddress();
		
		System.out.println(add2.getStreetNo() + " " +add2.getStreetName());
	}

}
