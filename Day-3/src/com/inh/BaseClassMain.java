package com.inh;
import java.util.Scanner;
public class BaseClassMain {
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter first number");
		int n1=s.nextInt();
		System.out.println("Enter second number");
		int n2=s.nextInt();
		
		DerivedClass dc=new DerivedClass(n1,n2);
		dc.dispMax();
		dc.dispMin();
	}

}
