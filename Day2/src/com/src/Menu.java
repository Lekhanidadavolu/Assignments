package com.src;

import java.util.Scanner;

public class Menu 
{

	public static void main(String[] args) 
	{

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. of elements you want in an array");
		int n = sc.nextInt();
		sc.nextLine();
		int[] arr = new int[n];
		System.out.println("Enter all the elements");
		for (int i = 0; i < n; i++) 
		{
			arr[i] = sc.nextInt();
			sc.nextLine();
		}
		for(int i =0 ;i<n;i++)
		{
			if (checkPrime(arr[i])) 
			{
				System.out.println(arr[i] + " is a Prime Number");
			} 
			else                                                        //Checking Prime or not
			{
				System.out.println(arr[i] + " is not a Prime Number");
			}
			if (checkPerfect(arr[i]))
			{
				System.out.println(arr[i] + " is a Perfect Number");
			} 
			else                                                        //Checking Perfect or not    
			{
				System.out.println(arr[i] + " is not a Perfect Number");
			}

			if (checkPalindrome(arr[i])) 
			{
				System.out.println(arr[i] + " is a Palindrome");
			} 
			else                                                        //Checking Palindrome or not
			{
				System.out.println(arr[i] + " is not a Palindrome");
			}
			if (checkArmstrong(arr[i])) {
				System.out.println(arr[i] + " is a Armstrong Number\n");
			} 
			else                                                          //Checking Armstrong or not
			{
				System.out.println(arr[i] + " is not a Armstrong Number\n");
			}
			System.out.println("************************");
		}
	}

	public static boolean checkPrime(int a) 
	{
		for (int i = 2; i <= a / 2; i++)
		{
			if (a % i == 0) 
			{
				return false;
			}
		}
		return true;
	}

	public static boolean checkPerfect(int a) 
	{
		int sum = 1;
		for (int i = 2; i < a; i++) 
		{
			if (a % i == 0) 
			{
				sum += i;
			}
		}
		if (sum == a) 
		{
			return true;
		}
		return false;
	}

	public static boolean checkPalindrome(int a)
	{
		int sum = 0;
		int rem = 0;
		int temp = a;
		while (a > 0) 
		{
			rem = a % 10;
			sum = sum * 10 + rem;
			a /= 10;
		}
		if (temp == sum) 
		{
			return true;
		}
		return false;
	}

	public static boolean checkArmstrong(int a) 
	{
		
		int sum = 0;
		int count =0;
		int temp = a;
		int rem = 0;
		while (a > 0)
		{
			rem = a % 10;
			count++;
			a /= 10;
		}
		a = temp;
		while (a > 0) 
		{
			rem = a % 10;
			sum += Math.pow(rem, count);
			a /= 10;
		}
		if (sum == temp) 
		{
			return true;
		}
		return false;
	}
}
