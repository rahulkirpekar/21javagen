package com.royal.oops.collectionocjp.sortingtechnique;

public class Student  
{
	private int rno;
	private String name;
	private int std;

	public Student() {
	}

	public Student(int rno, String name, int std) {
		this.rno = rno;
		this.name = name;
		this.std = std;
	}
	public int getRno() {
		return rno;
	}
	public void setRno(int rno) {
		this.rno = rno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getStd() {
		return std;
	}
	public void setStd(int std) {
		this.std = std;
	}
	public void disp() 
	{
		System.out.println(rno + "\t" + name + "\t"+std);
	}
//	@Override
//	public int compareTo(Student s) 
//	{
//		if(getStd() < s.getStd()) 
//		{
//			return 1;
//		}else if(getStd() > s.getStd())  
//		{
//			return -1;
//		}else 
//		{
//			return 0;
//		}
//	}

//	@Override
//	public int compareTo(Student s) 
//	{
//		return getName().compareTo(s.getName());
//	}
	
}
