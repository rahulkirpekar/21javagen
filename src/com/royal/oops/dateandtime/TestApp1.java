package com.royal.oops.dateandtime;

import java.time.*;

public class TestApp1 
{
	public static void main(String[] args) 
	{
//		LocalDate date = LocalDate.now();
//		System.out.println("date--> " + date);
//		LocalTime time = LocalTime.now();
//		System.out.println("time --> " + time);
//		LocalDateTime dateTime = LocalDateTime.now();
//		System.out.println("dateTime---> " + dateTime);
//		System.out.println("dateTime.getDayOfMonth() ---"+dateTime.getDayOfMonth());
//		System.out.println("dateTime.getHour()--"+dateTime.getHour() );
		
		LocalDate date = LocalDate.now();
		System.out.println("date  --- " + date );
		
		date = date.plusMonths(5);
		System.out.println("date  --- " + date );
		 
	}
}
