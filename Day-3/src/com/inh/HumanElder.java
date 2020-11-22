package com.inh;
import java.util.Scanner;
public class HumanElder 
{
		public static void main(String[] args)
		{
			
			Scanner s=new Scanner(System.in);
			Human h=new Human();
			System.out.println("Enter name");
			h.name1=s.next();
			System.out.println("Enter gender");
			h.gender1=s.next();
			System.out.println("enter name 2");
			h.name2=s.next();
			System.out.println("Enter gender");
			h.gender2=s.next();
			System.out.println("Enter female age");
			Man m=new Man();
			int q=s.nextInt();
			int a=q;
			q=m.age1;
			Human h1=m;
			Woman w=new Woman();
			System.out.println("enter male age");
			int r=s.nextInt();
			int b=r;
			r=w.age2;
			Human h2=w;
			h1.find(a,b);
		}

}


