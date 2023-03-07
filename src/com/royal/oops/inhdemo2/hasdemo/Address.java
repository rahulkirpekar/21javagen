package com.royal.oops.inhdemo2.hasdemo;

public class Address 
{
	private String hno             ;
	private String steetname	    ;
	private String areaname        ;
	private String landmark        ;
	private String city            ;
	private String state           ;
	private String country         ;
	private String pincode         ;
	public Address(String hno, String steetname, String areaname, String landmark, String city, String state,
			String country, String pincode) {
		super();
		this.hno = hno;
		this.steetname = steetname;
		this.areaname = areaname;
		this.landmark = landmark;
		this.city = city;
		this.state = state;
		this.country = country;
		this.pincode = pincode;
	}
	public String getHno() {
		return hno;
	}
	public String getSteetname() {
		return steetname;
	}
	public String getAreaname() {
		return areaname;
	}
	public String getLandmark() {
		return landmark;
	}
	public String getCity() {
		return city;
	}
	public String getState() {
		return state;
	}
	public String getCountry() {
		return country;
	}
	public String getPincode() {
		return pincode;
	}
	
	
}
