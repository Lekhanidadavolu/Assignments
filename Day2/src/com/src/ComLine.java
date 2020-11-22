package com.src;
import java.util.Scanner;
public class ComLine
{
	public static void main(String[] args)
	{
		
		Scanner sc=new Scanner(System.in);
		int num;
		if(args.length>0)
		{
			num=Integer.parseInt(args[0]);
		}
		else
		{
			System.out.println("Enter a number");
			num=sc.nextInt();	
		}
		
		//reversing a number
		int rem,rev=0;
		 while(num != 0) 
		 {
	            rem= num % 10;
	            rev = rev * 10 + rem;
	            num /= 10;
	               
		 }
		 System.out.println("Reversed number:"+rev);
		
		//checking the reversed number is prime or not 
		 int flag=0;
		 
		 {
		 for(int i = 2; i <= rev/2; ++i)
	        {
	            
	            if(rev % i == 0)
	            {
	                flag = 1;
	                break;
	            }
	        }
		 }

	        if (flag==0)
	            System.out.println("Reversed number is a prime number");
	        else
	            System.out.println("Reversed number is a not a prime number");
		 
	}
		
	

}
