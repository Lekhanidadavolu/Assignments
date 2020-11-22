package com.thread;

import java.util.Scanner;
public class SmallThreadEx extends Thread
{
    public void run()
    {
    	Scanner s = new Scanner(System.in);
    	System.out.print("Enter number:"); 
    	int n=s.nextInt();
    	for(int i=1;i<=20;i++)
    	{
    		System.out.println(2*i);
    	}
    }
    public void run1()
    {
    	Scanner s = new Scanner(System.in);
    	System.out.print("Enter number:"); 
    	int n=s.nextInt();
    	for(int i=1;i<=30;i++)
    	{
    		System.out.println(3*i);
    	}
    }
}
