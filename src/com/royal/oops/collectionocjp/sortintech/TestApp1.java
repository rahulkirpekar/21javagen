package com.royal.oops.collectionocjp.sortintech;

import java.util.ArrayList;
import java.util.Collections;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		// Data---String
		ArrayList<String> list = new ArrayList<String>();
		list.add("india");
		list.add("china");
		list.add("us");
		list.add("uk");
		list.add("pakistan");
		
		System.out.println("List Before sorting : " + list);
		Collections.sort(list);
		System.out.println("List After sorting : " + list);
	}
}
