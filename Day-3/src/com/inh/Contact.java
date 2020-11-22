package com.inh;

public class Contact 
{
	public Contact(String contactPerson, String mailid, long mobileno) {
		super();
		this.contactPerson = contactPerson;
		this.mailid = mailid;
		this.mobileno = mobileno;
	}
	String contactPerson;
	String mailid;
	long mobileno;
	public String getContactPerson() {
		return contactPerson;
	}
	public void setContactPerson(String contactPerson) {
		this.contactPerson = contactPerson;
	}
	public String getMailid() {
		return mailid;
	}
	public void setMailid(String mailid) {
		this.mailid = mailid;
	}
	public long getMobileno() {
		return mobileno;
	}
	public void setMobileno(long mobileno) {
		this.mobileno = mobileno;
	}
}
