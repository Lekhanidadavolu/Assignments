package com.files;

import java.io.CharArrayWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class CharacterArrayWriter
{
	public static void main(String[] args) throws IOException {
		FileWriter f=null;
		CharArrayWriter c=null;
				try {
					f=new FileWriter("samo.txt");
					char[]c1= {'a','b','c','d'};
					c=new CharArrayWriter();
					//((OutputStreamWriter) c).write(c1);
					f.write(c1);
					System.out.println("character array created");
					
				} catch (IOException e) {
				
					e.printStackTrace();
				}
				finally {
					f.close();
					c.close();
				}
		
		

				
		}
}
