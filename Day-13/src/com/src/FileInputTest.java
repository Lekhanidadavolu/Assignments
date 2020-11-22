package com.src;

import static org.junit.jupiter.api.Assertions.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.jupiter.api.Test;

class FileInputTest {

	@Test
	void testFiles() throws IOException
	{
		FileInput f=new FileInput();
		String s="Welcome to HCL";
		String s2= s+".txt";
		f.files(s);
		String s1="";
		try
		{
			FileInputStream fis=new FileInputStream(s2);
			int i=0;
			while((i=fis.read())!=-1)
			{
				s1=s1+(char)i;
			}
		}
			catch(FileNotFoundException e)
			{
				e.printStackTrace();
			}
			assertEquals(s,s1);
		}
	

}
