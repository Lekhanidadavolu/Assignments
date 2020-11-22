//IMMUTABLE EXAMPLE
package com.src;
public final class Employee
{
	Employee()
	{
		
	}
     public Employee(int empid, String empname, String empadd) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.empadd = empadd;
	}
	private int empid;
     private String empname;
     private String empadd;
	public int getEmpid() {
		return empid;
	}
	public String getEmpname() {
		return empname;
	}
	public String getEmpadd() {
		return empadd;
	}
}
