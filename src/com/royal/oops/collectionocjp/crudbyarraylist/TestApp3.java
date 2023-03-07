package com.royal.oops.collectionocjp;

import java.util.Vector;

public class TestApp3 
{
	public static void main(String[] args) 
	{
		Vector<String> list = new Vector<String>();
		
		list.add("rahul");
		list.add("krunal");
		list.add("rakesh");
		list.add("sagar");
		list.add("ramesh");

		System.out.println(list.get(0));

		System.out.println(list);
		
	} 

}
