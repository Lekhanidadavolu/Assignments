package com.files;

import java.io.BufferedReader;
	import java.io.BufferedWriter;

	import java.io.FileNotFoundException;
	import java.io.FileReader;
	import java.io.IOException;
public class BufferReaderEx
{
	
	public static void main(String[] args) throws IOException {
		FileReader f=null;
			
			try {
				f=new FileReader("samu.txt");
				BufferedReader bw=new BufferedReader(f);
				char[]c1= {'a','s','d','f'};
				int ch;
				//char c='h';
			
				while ((ch=f.read())!=-1) { 
		            System.out.print((char)ch); 
		            System.out.println("buffer read");
				}
			} catch (FileNotFoundException e) {
				
				e.printStackTrace();
			}
			finally {
				f.close();
				
			}
		}
}
