package com.royal.oops.collectionocjp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;

public class TestApp2 
{
	public static void main(String[] args) 
	{
		ArrayList<String>mainCountrylist = new ArrayList<String>();
		mainCountrylist.add("India");
		mainCountrylist.add("US");
		mainCountrylist.add("Canada");
		mainCountrylist.add("China");
		mainCountrylist.add("Pakistan");
		mainCountrylist.add("Japan");      

		System.out.println("mainCountrylist---"+mainCountrylist);
		
		Collections.sort(mainCountrylist);
		System.out.println("mainCountrylist---"+mainCountrylist);
		
//		ListIterator<String> list = mainCountrylist.listIterator();
//		while (list.hasNext()) 
//		{
//			String country = (String) list.next();
//			System.out.println(country);
//		}
//		System.out.println("-------------------------------");
//		while (list.hasPrevious()) 
//		{
//			String country = (String) list.previous();
//			System.out.println(country);
//		}
		
//		mainCountrylist.add("SA");         
//		mainCountrylist.add("Rassia");     
//		mainCountrylist.add("Shrilanka");  
//		mainCountrylist.add("UAE");        
		
//		ArrayList<String>g7Countrylist = new ArrayList<String>();
//		g7Countrylist.add("Japan");
//		g7Countrylist.add("SA");
//		g7Countrylist.add("Rassia");
//		g7Countrylist.add("Ukrein");
//		g7Countrylist.add("Shrilanka");
//		g7Countrylist.add("UAE");
		

//		System.out.println("===> "+mainCountrylist.containsAll(g7Countrylist));
		
//		mainCountrylist.remove("Pakistan");// remove By Value
		
//		mainCountrylist.remove(2);
//		System.out.println("mainCountrylist - " + mainCountrylist);
		
		
//		mainCountrylist.set(1, "United States of America");// Update
//		System.out.println("mainCountrylist - " + mainCountrylist);
		
		
//		mainCountrylist.retainAll(g7Countrylist);
		
//		System.out.println("g7Countrylist - " + g7Countrylist);

//		mainCountrylist.addAll(2, g7Countrylist);
//		System.out.println("After mainCountrylist - " + mainCountrylist);
//		System.out.println("After g7Countrylist - " + g7Countrylist);
		
//		mainCountrylist.addAll(g7Countrylist);
//		System.out.println("After mainCountrylist.size() - " + mainCountrylist.size());
//		System.out.println("Afterg7Countrylist.size() - " + g7Countrylist.size());
		
	}
}
