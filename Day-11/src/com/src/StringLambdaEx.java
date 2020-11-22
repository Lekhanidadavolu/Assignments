package com.src;

import java.util.Arrays;

public class StringLambdaEx
{
    public static void main(String[] args)
    {
    	FunctionInterface fi=(s1,s2)->
    	{
    		System.out.println(s1.length());
    		System.out.println(s2.length());
    	};

		String a[]= {"database","oracle","java","connectivity"};  //string array
		Arrays.sort(a,(s1,s2)->s1.length()-s2.length());  //calculating which string is long
		Arrays.asList(a).forEach(System.out::println);
		Arrays.sort(a,(s1,s2)->s2.length()-s1.length());   //calculating which string is short
		Arrays.asList(a).forEach(System.out::println);
		Arrays.sort((a),(s1,s2)->{  //checking first character of the strings
			char ch=(char)s1.charAt(0);  //taking the first character
			char ch1=(char)s2.charAt(0);
			if(ch>ch1)
			{
				return ch1;
			}
			else
			{
				return ch;
			}
		});
		Arrays.asList(a).forEach(System.out::println);
		Arrays.sort((a),(s1,s2)->{
			char ch=(char)s1.charAt(0);
			char ch1=(char)s2.charAt(0);
			if(ch=='e'||ch=='E')  //checking whether the string contains character 'e'
			{
				return ch;
			}
			return ch1;
		});
		Arrays.asList(a).forEach(System.out::println);			
    }
}
