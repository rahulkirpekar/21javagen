package com.royal.oops.collectionocjp.sortintech;

import java.util.ArrayList;
import java.util.Collections;

public class TestApp3 
{
	public static void main(String[] args) 
	{
		Student s1 = new Student(1, "rahul", 12);
		Student s2 = new Student(2, "manan", 10);
		Student s3 = new Student(3, "ansh", 5);
		Student s4 = new Student(4, "rakehs", 6);
		Student s5 = new Student(6, "krunal", 2);
		
		ArrayList<Student> list = new ArrayList<Student>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s5);

		for (int i = 0; i < list.size(); i++) 
		{
			Student s = list.get(i);
			System.out.println(s);
		}
		Collections.sort(list,new StdWiseStudentComparator());
		
		System.out.println("After StdWise Sorting : ");
		
		for (int i = 0; i < list.size(); i++) 
		{
			Student s = list.get(i);
			System.out.println(s);
		}
		System.out.println("----------------------");
		Collections.sort(list,new NameWiseStudentComparator());
		
		System.out.println("After NameWise Sorting : ");
		
		for (int i = 0; i < list.size(); i++) 
		{
			Student s = list.get(i);
			System.out.println(s);
		}
	}
}
