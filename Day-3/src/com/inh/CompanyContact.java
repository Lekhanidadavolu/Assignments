package com.inh;

public class CompanyContact 
{
     public CompanyContact(String companyName, String city, String country, String website, String department,
			String address, int pin) {
		super();
		this.companyName = companyName;
		this.city = city;
		this.country = country;
		this.website = website;
		this.department = department;
		this.address = address;
		this.pin = pin;
	}
	String companyName;
     String city;
     String country;
     String website;
     String department;
     String address;
     int pin;
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		this.website = website;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
}
