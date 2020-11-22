package com.interf;

import java.util.Scanner;

public class IBookMain 
{

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int c;
		do
		{
		System.out.println("choose the book you have taken");
		System.out.println("1.Troy");
		System.out.println("2.Antenna Design");
		System.out.println("3.Vidyavox audio");
		System.out.println("4.Exit");
		c=s.nextInt();
		switch(c)
		{
		case 1:
			Book i=new Book();
			i.stringTitle();
			i.author();
			i.dayTaken();
			int a;
			a=s.nextInt();
			i.daysOverdue(a);
			System.out.println("Overdue is "+i.isOverdue(a));
			System.out.println(i.computerFine(a)+"cents");
			break;
		case 2:
			RefBook r=new RefBook();
			r.stringTitle();
			r.author();
			r.dayTaken();
			int b;
			b=s.nextInt();
			r.daysOverdue(b);
			System.out.println("Overdue is "+r.isOverdue(b));
			System.out.println(r.computerFine(b)+"cents");
			break;
		case 3:
			AudioBook ab=new AudioBook();
			ab.stringTitle();
			ab.author();
			ab.dayTaken();
			int cd;
			cd=s.nextInt();
			ab.daysOverdue(cd);
			System.out.println("Overdue is "+ab.isOverdue(cd));
			System.out.println(ab.computerFine(cd)+"cents");
			break;
		case 4:
			System.out.println("Bye...Bye");
		}
	}
		while(c!=4);
	}

}
