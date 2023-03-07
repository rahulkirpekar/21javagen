package com.royal.oops.collectionocjp;

import java.util.TreeMap;
import java.util.Map;

public class TestApp5 
{
	public static void main(String[] args) 
	{
		TreeMap<Integer,String>map = new TreeMap<Integer,String>();
		map.put(5, "ramesh");
		map.put(3, "rakesh");
		map.put(1, "rahul");// e
		map.put(2, "krunal");
		map.put(4, "sagar");

		System.out.println(map.keySet());
		System.out.println(map.values());
		
		for(Map.Entry<Integer, String> e : map.entrySet()) 
		{
			System.out.println(e.getKey() + " " + e.getValue());
		}
	}
}
