package com.royal.oops.inhdemo.hasademo;

public class Address 
{
	//Address	
		String streetNo;
		String streetName;
		String laneName;
		String areaName;
		String cityName;
		String stateName;
		String countryName;
		String pincode;
		public Address() 
		{
			
		}
		public Address(String streetNo, String streetName, String laneName, String areaName, String cityName,
				String stateName, String countryName, String pincode) {
			super();
			this.streetNo = streetNo;
			this.streetName = streetName;
			this.laneName = laneName;
			this.areaName = areaName;
			this.cityName = cityName;
			this.stateName = stateName;
			this.countryName = countryName;
			this.pincode = pincode;
		}
		public String getStreetNo() {
			return streetNo;
		}
		public void setStreetNo(String streetNo) {
			this.streetNo = streetNo;
		}
		public String getStreetName() {
			return streetName;
		}
		public void setStreetName(String streetName) {
			this.streetName = streetName;
		}
		public String getLaneName() {
			return laneName;
		}
		public void setLaneName(String laneName) {
			this.laneName = laneName;
		}
		public String getAreaName() {
			return areaName;
		}
		public void setAreaName(String areaName) {
			this.areaName = areaName;
		}
		public String getCityName() {
			return cityName;
		}
		public void setCityName(String cityName) {
			this.cityName = cityName;
		}
		public String getStateName() {
			return stateName;
		}
		public void setStateName(String stateName) {
			this.stateName = stateName;
		}
		public String getCountryName() {
			return countryName;
		}
		public void setCountryName(String countryName) {
			this.countryName = countryName;
		}
		public String getPincode() {
			return pincode;
		}
		public void setPincode(String pincode) {
			this.pincode = pincode;
		}
		
		
		
		
}
