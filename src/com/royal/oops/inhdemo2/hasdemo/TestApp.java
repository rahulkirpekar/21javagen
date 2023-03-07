package com.royal.oops.inhdemo2.hasdemo;

public class TestApp 
{
	public static void main(String[] args) 
	{
		Address a1 = new Address("1", "abc", "maninagar", "kankaria", "Ahm", "Guj", "IND", "231433");
		
		Employee e = new Employee(1, "Rahul", 2134, "SE", "aSDFB", "3245", a1);
	
		e.disp();
	}

}
