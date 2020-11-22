package com.string;

public class StringBuilderEx 
{
    public static void main(String[] args)
    {
    	String s="Lekha";
    	String s1="Sri";
    	String s2="Nidadavolu";
    	StringBuilder p=new StringBuilder(s);
    	StringBuilder p1=new StringBuilder(s1);
    	StringBuilder p2=new StringBuilder(s2);
    	System.out.println(p.append(true));
    	System.out.println(p.append(7));
    	System.out.println(p.append("HCL"));
    	System.out.println(p1.capacity());
    	System.out.println(p2.codePointAt(2));
    	System.out.println(p2.codePointCount(2, 6));
    	System.out.println(p2.charAt(3));
    	System.out.println(p2.insert(3, 2));
    	System.out.println(p1.reverse());
    	System.out.println(p1.substring(2));
    }
	
}
