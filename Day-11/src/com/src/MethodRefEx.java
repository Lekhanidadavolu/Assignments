package com.src;

import java.util.ArrayList;

public class MethodRefEx
{
    public static void main(String[] args)
    {
    	Greetings g=SomeClass::display;
    			g.mrng();
    	ArrayList al=new ArrayList();
    	al.add(44);
    	al.add(45);
    	al.add(11);
    	al.forEach((y)->System.out.println(y));
    	al.forEach(System.out::println);

		al.forEach((c)->System.out.println(c));
    }
}
