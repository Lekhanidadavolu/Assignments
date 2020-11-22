package com.inh;

public class BaseClass 
{
    int n1,n2;

	public BaseClass(int n1, int n2)
	{
		super();
		this.n1 = n1;
		this.n2 = n2;
	}
    
}
class DerivedClass extends BaseClass 
{
	public DerivedClass(int n1, int n2)
	{
		super(n1, n2);
		
	}
	public void dispMax()
	{
		if(n1>n2)
		{
			System.out.println(n1+" is greater");
		}
		else
		{
			System.out.println(n2+" is greater");
		}
		
	}
	public void dispMin()
	{
		if(n1<n2)
		{
			System.out.println(n1+" is lesser");
		}
		else
		{
			System.out.println(n2+" is lesser");
		}
	}
}
