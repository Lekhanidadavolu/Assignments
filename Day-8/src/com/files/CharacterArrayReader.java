package com.files;

import java.io.CharArrayReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CharacterArrayReader 
{
		public static void main(String[] args) throws IOException {
			FileReader f=null;
			CharArrayReader ca=null;
			try {
				f=new FileReader("samo.txt");
				char[]c1= {'a','s','d','f'};
				int ch;
				//char c='h';
				ca=new CharArrayReader(c1);
				while ((ch=f.read())!=-1) { 
		            System.out.print((char)ch); 
		            System.out.println("character read");
				}
			} catch (FileNotFoundException e) {
				
				e.printStackTrace();
			}
			finally {
				f.close();
				ca.close();
			}

		}
}
