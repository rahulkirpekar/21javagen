package com.royal.oops.collectionocjp.crudbyarraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class CrudByArrayList 
{
	public static void main(String[] args) 
	{
		
		Scanner sc  = new Scanner(System.in);
		ArrayList<Student> list = new ArrayList<Student>();
		int choice=0;
		Student s = null;
	do 
	{	
		System.out.println("Enter below choice : ");
		System.out.println("1) For Insert Student");
		System.out.println("2) For Update Student");
		System.out.println("3) For Delete By Id Student");
		System.out.println("4) For Display All Student Records ");
		System.out.println("5) For Searching Student");
		System.out.println("6) For Menu Exit");
		choice = sc.nextInt();

		switch(choice) 
		{
			case 1: s = new Student();
					s.scan();
					list.add(s);
					System.out.println("Student inserted succsfully");
					break;
			case 2: System.out.println("Enter Id which you want to update : ");
					int updateId = sc.nextInt();
					boolean flag = false;
					int i=0;
					for(;i<list.size();i++) 
					{
						s = list.get(i);
						if(s.getRno() == updateId) 
						{
							flag=true;
							break;
						}						
					}
					if(flag) 
					{
						s.update();
						list.set(i, s);
						System.out.println("Student object successfully updated from student Records");
					}else 
					{
						System.out.println("Invalid id,\n\tNo record Found");
					}
				
					break;
			case 3:	System.out.println("Enter Id which you want to delete : ");
					int deleteId = sc.nextInt();
					flag = false;
					i=0;
					for(;i<list.size();i++) 
					{
						s = list.get(i);
						if(s.getRno() == deleteId) 
						{
							flag=true;
							break;
						}						
					}
					if(flag) 
					{
						list.remove(i);
						System.out.println("Student object successfully removed from student Records");
					}else 
					{
						System.out.println("Invalid id,\n\tNo record Found");
					}
					break;

			case 4:	
					if(list.size()>0) 
					{
						System.out.println("Rno\tName\tstd");
						Iterator<Student>itr = list.iterator();
						while(itr.hasNext()) 
						{
							s = itr.next();
							s.disp();
						}
					}else 
					{
						System.out.println("No Student records found");
					}
					break;

			case 5:
					break;

			case 6:
					break;
					
			default:
		}
	}while(choice!=6);	
  }
}
