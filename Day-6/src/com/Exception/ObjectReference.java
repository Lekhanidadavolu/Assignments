package com.Exception;

public class ObjectReference {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		try {
			Addition addition = new Addition();
			addition = null;
			int sum = addition.add(2, 3);
			System.out.println(sum);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
