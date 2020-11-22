package com.io;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteArrayOutputStreamEx 
{
	public static void main(String[] args) throws IOException 
	{
		ByteArrayOutputStream bos = null;
		bos=new ByteArrayOutputStream();
		String str="this is byte array input stream";
		byte[] b=str.getBytes();
		
		bos.write(b);
		FileOutputStream fos1= new FileOutputStream("1.txt");
		FileOutputStream fos2= new FileOutputStream("2.txt");
		
		bos.writeTo(fos1);
		bos.writeTo(fos2);
	}
}
