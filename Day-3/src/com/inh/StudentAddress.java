package com.inh;

public class StudentAddress 
{
	String name;
	int rollnum;
}
class Record extends StudentAddress
{
    String address;
    public void display()
	{
		System.out.println("Name:"+name);
		System.out.println("Rollnum:"+rollnum);
		System.out.println("Address:"+address);
		
    }
}
