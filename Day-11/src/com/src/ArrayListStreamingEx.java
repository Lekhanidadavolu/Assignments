package com.src;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ArrayListStreamingEx {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.println("enter how many numbers to be accepted");
        int n=sc.nextInt();
        
        ArrayList al=new ArrayList();
        System.out.println("enter numbers");
        for(int i=0;i<n;i++)
        {
        	al.add(sc.nextInt());
        }
        System.out.println(al);
        
        ArrayList al1=new ArrayList();
        Iterator<Integer> it=al.iterator();
        while(it.hasNext())
        {
        	Integer in=it.next();
        	if(in%2==0)
        	{
        		al1.add(in);
        	}
          }
        System.out.println(al1);

	}

}
