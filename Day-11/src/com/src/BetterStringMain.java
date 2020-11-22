package com.src;

public class BetterStringMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BetterString bs=((a,b)->a.length()>b.length()?a:b); //lambda expression for deciding which string is maximum
		String l=bs.betterString("Lekha", "West Godavari");
		BetterString.print();  //calling the method
		System.out.println(l);
		BetterString bs1=((a,b)->a);  //lambda expression for taking string 1 
		String l1=bs1.betterString("Ramya","West Godavari");
		BetterString.print();  //calling the method
		System.out.println(l1);
	}

}
