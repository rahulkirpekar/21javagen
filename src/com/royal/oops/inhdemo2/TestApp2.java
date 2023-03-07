package com.royal.oops.inhdemo2;

public class TestApp2 
{
	public static void main(String[] args) 
	{
		Student s1 = new  Student();
		s1.setRno(1);
		s1.setName("Rahul");
		Student s2 = new  Student();
		s2.setRno(2);
		s2.setStd(12);
		Student s3 = new  Student();
		s3.setName("rakesh");
		s3.setStd(12);
		
		System.out.println(s1.getRno() + " " + s1.getName());
		System.out.println(s2.getRno() + " " + s2.getStd());
		System.out.println(s3.getName() + " " + s3.getStd());

	}
}
// s1 = 1 rahul 
// s2 = 2 12
// s3 = rakesh 12