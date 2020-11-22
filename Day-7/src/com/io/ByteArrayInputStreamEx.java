package com.io;

import java.io.ByteArrayInputStream;

public class ByteArrayInputStreamEx {

	public static void main(String[] args)
	{ 
		String ar="this is byte array input stream";
		byte[] b=ar.getBytes();
		// TODO Auto-generated method stub
		ByteArrayInputStream bis=new ByteArrayInputStream(b);
		int n;
		while((n=bis.read())!=-1)
		{
			System.out.print((char)n);
		}
		
	}

}
