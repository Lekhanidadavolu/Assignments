package com.src;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

public class StudentMarksMain {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number of students");
		int n=sc.nextInt();
		
		ArrayList<StudentMarks> al=new ArrayList();
		for(int i=0;i<n;i++)
		{
		System.out.println("enter name of student");
		String na=sc.next();
		System.out.println("enter maths marks:");
		int n1=sc.nextInt();
		System.out.println("enter science marks:");
		int n2=sc.nextInt();
		System.out.println("enter social marks:");
		int n3=sc.nextInt();
		StudentMarks sm=new StudentMarks(na,n1,n2,n3);
		al.add(sm);
		System.out.println(al);
		}

		
		ArrayList al1=(ArrayList)al.stream()  //lambda expression for checking who got fail marks
				.filter(p->p.maths<35)
				.collect(Collectors.toList());
	System.out.println("Failed in maths : ");
	System.out.println(al1);
	ArrayList al2=(ArrayList<StudentMarks>)al.stream()
			.filter(p->p.science<35)
			.map(p->p)
			.collect(Collectors.toList());
	 System.out.println("Failed in Science : ");
	 System.out.println(al2);
	 ArrayList al3=(ArrayList<StudentMarks>)al.stream()
				.filter(p->p.social<50)
				.map(p->p)
				.collect(Collectors.toList());
	 System.out.println("Failed in Social : ");
		 System.out.println(al3);
     ArrayList al4=(ArrayList<StudentMarks>)al.stream()   //lambda expression for checking who got pass marks
    		    .filter(p->p.maths>50)
    		    .filter(p->p.science>50)
				.filter(p->p.social>50)
				.map(p->p)
				.collect(Collectors.toList());
     System.out.println("Passed in exam : ");
		
		System.out.println(al4);
			
	}
}
