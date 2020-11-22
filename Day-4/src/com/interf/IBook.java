package com.interf;

public interface IBook 
{
	abstract void stringTitle();
	abstract void dayTaken();
}
abstract class ABook implements IBook
{
	abstract void author();
	abstract int daysOverdue(int a);
	abstract boolean isOverdue(int b);
	abstract int computerFine(int d);
}
 class Book extends ABook implements IBook
{
	public void stringTitle()
	{
		System.out.println("Troy");
	}
	public void author()
	{
		System.out.println("Achilles");
	}
	public void dayTaken()
	{
		System.out.println("Enter no of days taken");
	}
	@Override
	int daysOverdue(int a) 
	{

		int date=0;
		if(a>(date+14))
		{
			int c=a-(date+14);
			System.out.println("Overdue");
			return c;
		}
		else
		{
			int c=(date+14)-a;
			System.out.println("NO overdue");
		return c;
		}
	}
	@Override
	boolean isOverdue(int a)
	{

		int date=0;
		int c=(date+14)-a;
		if(c>0)
		{
			return false;
		}
		else
		{
			return true;
		}
	}
	@Override
	int computerFine(int a) 
	{
		
		int date=0;
		int c=a-(date+14);
		if(c>0)
		{
			return 10*c;
		}
		else
		{
		return 0;
		}
	}
	
}
 class RefBook extends ABook implements IBook
{
	public void stringTitle()
	{
		System.out.println("Antenna Design");
	}
	public void dayTaken()
	{
		System.out.print("Enter no of days taken");
	}
	@Override
	int daysOverdue(int a) 
	{
		
		int date=0;
		if(a>(date+2))
		{
			int c=a-(date+2);
			System.out.println("Overdue");
			return c;
		}
		else
		{
			int c=(date+2)-a;
			System.out.println("NO overdue");
		return c;
		}
	}
	@Override
	boolean isOverdue(int a) 
	{
		
		int date=0;
		int c=(date+2)-a;
		if(c>0)
		{
			return false;
		}
		else
		{
			return true;
		}
	}
	@Override
	int computerFine(int a)
	{
		
		int date=0;
		int c=a-(date+2);
		if(c>0)
		{
			return 10*c;
		}
		else
		{
		return 0;
		}
	}
	@Override
	void author() 
	{
			
	}

}
class AudioBook extends ABook implements IBook
{

	@Override
	public void stringTitle() 
	{
		
		System.out.println("Vidyavox audio");
	}

	@Override
	public void author()
	{
		
		System.out.println("VIDYAVOX");
	}

	@Override
	public void dayTaken() 
	{
		
		System.out.println("Enter no of days taken");
	}
	@Override
	int daysOverdue(int days)
	{
		
		int date=0;
		if(days>(date+14))
		{
			int c=days-(date+14);
			System.out.println("Overdue");
			return c;
		}
		else
		{
			int c=(date+14)-days;
			System.out.println("NO overdue");
		return c;
		}
	}
	@Override
	boolean isOverdue(int days) 
	{

		int date=0;
		int c=(date+14)-days;
		if(c>0)
		{
			return false;
		}
		else
		{
			return true;
		}
	}
	@Override
	int computerFine(int days)
	{
		int date=0;
		int c=days-(date+14);
		if(c>0)
		{
			return 20*c;
		}
		else
		{
		return 0;
		}
	}

}