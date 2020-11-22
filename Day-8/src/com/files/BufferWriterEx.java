package com.files;

import java.io.BufferedWriter;
	import java.io.FileWriter;
	import java.io.IOException;

public class BufferWriterEx 
{
		
	public static void main(String[] args) throws IOException {
			FileWriter fw=null;
			try {
				fw=new FileWriter("samu.txt");
				BufferedWriter bw=new BufferedWriter(fw);
				char[]c= {'h','c','l','j'};
				fw.write(c);
				System.out.println("buffer performed");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			finally {
				fw.close();
				//bw.close();
			}
			
			

		}
}
