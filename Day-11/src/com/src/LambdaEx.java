package com.src;

public class LambdaEx 
{
    public static void main(String[] args)
    {
    	FunctionInterface fi=(s1,s2)->
    	{
    		System.out.println(s1.length());
    		System.out.println(s2.length());
    	};
    	fi.display("Lekha", "Nidadavolu");
    	fi=(s1,s2)->
    	{
    		System.out.println(s1.concat(s2));
    	};
    	fi.display("Lekha", "Sri");
    	fi=(s1,s2)->
    	{
    		System.out.println(s1.compareTo(s2));
    	};
    	fi.display("Lekha", "Sri");
    }
    public void display(String s1, String s2)
    {
    	
    }
}
