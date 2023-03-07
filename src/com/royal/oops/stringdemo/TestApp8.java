package com.royal.oops.stringdemo;

public class TestApp8 
{
	public static void main(String[] args) 
	{
		StringBuffer sb = new StringBuffer("Royal techno");
//		StringBuilder sb = new StringBuilder("Royal techno");

		System.out.println(sb + "  - " + sb.hashCode());
		sb.append("soft pvt Ltd.");
		System.out.println(sb + "  - " + sb.hashCode());
		
		sb.reverse();
		System.out.println(sb + "  - " + sb.hashCode());
	}
}
