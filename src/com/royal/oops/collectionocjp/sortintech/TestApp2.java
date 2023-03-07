package com.royal.oops.collectionocjp.sortintech;

import java.util.ArrayList;
import java.util.Collections;

public class TestApp2 
{
	public static void main(String[] args) 
	{
		// Data---String
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(9);
		list.add(6);
		list.add(3);
		list.add(1);
		
		System.out.println("List Before sorting : " + list);
		Collections.sort(list);
		System.out.println("List After sorting : " + list);
	}

}
