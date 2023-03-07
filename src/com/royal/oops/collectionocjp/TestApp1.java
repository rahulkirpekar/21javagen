package com.royal.oops.collectionocjp;

import java.util.ArrayList;
import java.util.Iterator;
public class TestApp1 
{
	public static void main(String[] args) 
	{
		ArrayList listObj = new ArrayList();
		listObj.add("rahul");// 0 <====itr
		listObj.add('R'); // 1
		listObj.add(true);// 2
		listObj.add(10); // 3 Integer.valueOf(no); ---AUTO Boxing
		listObj.add(43.43f);//4
		listObj.add(32L);//5
		Student s = new Student(1, "rahul", 12);
		listObj.add(s);//6
		System.out.println("listObj -- " + listObj.size());

		// Advanced for loop / Enhanced for loop / for each loop
		
//		for(Object obj : listObj) 
//		{
//			if (obj instanceof Student) 
//			{
//				s = (Student)obj;
//				System.out.println(s.getRno() + " " + s.getName() + " " + s.getStd());
//			} else 
//			{
//				System.out.println(obj);
//			}
//		}
		
		
		
		Iterator itr = listObj.iterator();
		while(itr.hasNext()) 
		{
			Object obj = itr.next();

			if (obj instanceof Student) 
			{
				s = (Student)obj;
				System.out.println(s.getRno() + " " + s.getName() + " " + s.getStd());
			} else 
			{
				System.out.println(obj);
			}
		}
		
//		for(int i=0;i<listObj.size();i++) 
//		{
//			Object obj = listObj.get(i);
//			if(obj instanceof Student) 
//			{
//				s = (Student)obj;
//				System.out.println(s.getRno() + " " + s.getName() + " " + s.getStd());
//			}else 
//			{
//				System.out.println(obj);
//			}
//		}
		
		
		
	}
}
