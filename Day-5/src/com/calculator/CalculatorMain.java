package com.calculator;

import java.util.Scanner;

import com.src.Arithmetic;
import com.src.Relational;
import com.src.Bitwise;
import com.src.IncDec;

public class CalculatorMain
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int c;
		do {
			System.out.println("1.Arithmetic");
			System.out.println("2.Relational");
			System.out.println("3.Bitwise");
			System.out.println("4.IncDec");
			System.out.println("5.exit");
			c=s.nextInt();
			switch (c) 
			{
				case 1:
					Arithmetic a=new Arithmetic();
					int p,q;
					System.out.println("Enter values");
					p=s.nextInt();
					System.out.println("Enter another value");
					q=s.nextInt();
					System.out.println("Addition");
					a.addition(p, q);
					System.out.println("Subtraction");
					a.subtraction(p, q);
					System.out.println("Multiplication");
					a.multiplication(p, q);
					System.out.println("Division");
					a.division(p,q);
					System.out.println("Modulo");
					a.modulo(p, q);
					break;
				case 2:
					Relational r =new Relational();
					int m,n;
					System.out.println("Enter values");
					m=s.nextInt();
					System.out.println("Enter another value");
					n=s.nextInt();
					System.out.println("Greatest among two");
					r.greater(m, n);
					System.out.println("Least among two");
					r.lesser(m, n);
					break;
				case 3:
					Bitwise b=new Bitwise();
					int x,y;
					System.out.println("Enter values");
					x=s.nextInt();
					System.out.println("Enter another value");
					y=s.nextInt();
					System.out.println("Bitwise and");
					b.bitwiseAnd(x, y);
					System.out.println("Bitwise Or");
					b.bitwiseOr(x, y);
					System.out.println("Bitwise Xor");
					b.bitwiseXor(x, y);
					System.out.println("Right Shift");
					b.rightShift(x, y);
					System.out.println("Left Shift");
					b.leftshift(x, y);
					break;
				case 4:
					IncDec u=new IncDec();
					int j;
					System.out.println("Enter a value");
					j=s.nextInt();
					u.postIncrement(j);
					u.preIncrement(j);
					u.postDecrement(j);
					u.preDecrement(j);
					break;
				case 5:
					System.out.println("Exit");
			}
		}while(c!=5);
		
	}
}
