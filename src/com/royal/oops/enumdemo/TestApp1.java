package com.royal.oops.enumdemo;

enum Day
{
	MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY, SUNDAY;
}
public class TestApp1 
{
	Day day;
	public TestApp1(Day day) 
	{
		this.day = day;
	}
	public void dayIsaLike() 
	{
		System.out.println(day);
		switch (day) 
		{
			case MONDAY:
						System.out.println("Monday is First Day");
						break;
			case TUESDAY:
						System.out.println("Monday is Second Day");
						break;
			case WEDNESDAY:
						System.out.println("Wednesday is Third Day");
						break;
			case FRIDAY:
						System.out.println("Friday is Fourth Day");
						break;
			case SATURDAY:
						System.out.println("Saturday is Fifth Day");
						break;
			case SUNDAY:
						System.out.println("Sunday is Sixth Day");
						break;
			default:
						System.out.println("Invalid Days");
						break;
		}
	}
	public static void main(String[] args) 
	{
		String day = "MONDAY";
		TestApp1 t1 = new TestApp1(Day.valueOf(day));
		t1.dayIsaLike();
	}
}
