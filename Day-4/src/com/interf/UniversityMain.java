package com.interf;

public interface UniversityMain 
{
	public static void main(String[] args)
	{
		University u=new University();
		u.closed();
		University.Electronics q=new University.Electronics();
		q.closes();
		University.Computers c=u.new Computers();
		c.students();
		c.teachers();
		University.Electrical e=u.new Electrical();
		c.students();
		c.teachers();
	}
}



