package com.string;

public class StringEx 
{
	public static void main(String[] args)
	{
		String a="Lekha";
		String b="Sri";
		String c="Nidadavolu";
		System.out.println(a.charAt(2));
		System.out.println(b.codePointBefore(2));
		System.out.println(a.codePointCount(0, 2));
		System.out.println(a.compareTo(c));
		System.out.println(a.compareToIgnoreCase(c));
		System.out.println(a.concat(b));
		System.out.println(a.toUpperCase());  
		System.out.println(b.toLowerCase());
		System.out.println(a.trim());
		System.out.println(a.startsWith("Sa"));  
		System.out.println(b.endsWith("n"));
		System.out.println(a.length());
		int z=10;  
		String s=String.valueOf(z);  
		System.out.println(z+10); 
		String s1="Welcome to HCL Technologies";    
		String replaceString=s1.replace("Technologies","Techies");//replaces    
		System.out.println(replaceString);
		System.out.println(c.intern());
		System.out.println(c.lastIndexOf(6));
		System.out.println(a.matches("Techies"));
		
	}
}
