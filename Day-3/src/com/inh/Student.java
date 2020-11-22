package com.inh;

public class Student 
{
	String name;
	int rollnum;
	int marks;
}
class MyRecord extends Student
{
	public void percentage()
	{
		int per=(marks/100)*10;
		System.out.println("Percentage:" +per);
	}
	public void display()
	{
		System.out.println("Name:"+name);
		System.out.println("rollnum:"+rollnum);
		System.out.println("marks:"+marks);
		
	}
}

	


