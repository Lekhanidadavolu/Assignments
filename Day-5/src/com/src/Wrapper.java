package com.src;
import java.lang.Integer;
public class Wrapper 
{
	public static void main(String[] args) throws Exception {
	// TODO Auto-generated method stub
	int i=10;
	int j=20;
	Integer k=new Integer(i);
	Integer l=new Integer(j);
	System.out.println(k.doubleValue());
	System.out.println(k.compareTo(l));
	System.out.println(k.equals(l));
	System.out.println(k.hashCode());
	System.out.println(k.shortValue());
	System.out.println(k.floatValue());
	System.out.println(k.byteValue());
	System.out.println(Integer.getInteger("He"));
	System.out.println(Integer.bitCount(8));
	System.out.println(Integer.compare(8, 9));
	System.out.println(Integer.compareUnsigned(7, 11));
	System.out.println(Integer.divideUnsigned(12,2));
	System.out.println(Integer.highestOneBit(i));
	System.out.println(Integer.lowestOneBit(i));
	System.out.println(Integer.max(7,8));
	System.out.println(Integer.min(7,8));
	System.out.println(Integer.parseInt("123"));
	System.out.println(Integer.reverse(123));
	System.out.println(Integer.rotateLeft(123,1));
	System.out.println(Integer.toBinaryString(10));
	System.out.println(Integer.toOctalString(16));
	System.out.println(Integer.toString(i));
	System.out.println(Integer.valueOf("12369"));
	System.out.println(Integer.toUnsignedString(-10));
	System.out.println(Integer.signum(-123));
	}
}


