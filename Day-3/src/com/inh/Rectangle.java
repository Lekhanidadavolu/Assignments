package com.inh;

public class Rectangle 
{
   int len,wid;
   public Rectangle()
   {
	   len=9;
	   wid=3;
	   System.out.println("Length:"+len);
	   System.out.println("Width:"+wid);
   }
   public void area()
   {
	   System.out.println("Area of rectangle:"+(len*wid));
   }
}
class Box extends Rectangle 
{
   int dep=5;
   public void area()
   {
	   System.out.println("Area of box:"+(len*wid*dep));
   }
}

