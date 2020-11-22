package com.string;

public class StringBufferEx
{
public static void main(String[] args) 
{
	String s1="Lekha";
	StringBuffer s=new StringBuffer(s1);	
	String s2="Nidadavolu";
	StringBuffer p=new StringBuffer(s2);
	System.out.println(s.append(7));
	System.out.println(s.append("Welcom to HCL"));
	System.out.println(p.appendCodePoint(8));
	System.out.println(p.capacity());
	System.out.println(p.charAt(4));
	System.out.println(s.delete(0, 8));
	System.out.println(p.deleteCharAt(6));
	System.out.println(s.reverse());
	System.out.println(s.reverse());
	s.setCharAt(0,'N');
	s.setCharAt(1, 'i');
	s.setCharAt(2, 'k');
	System.out.println(s);
	p.setLength(8);
	System.out.println(p);
	System.out.println(p.length());
	System.out.println(s.toString());

	}
}
