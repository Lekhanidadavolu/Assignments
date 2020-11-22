package com.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
	

public class FileInput 
{
			public static void main(String[] args) throws IOException {
				FileInputStream fis = null;

				try {

					fis = new FileInputStream("C:\\Users\\Ganesh\\eclipse-workspace\\Day-7\\src\\com\\io\\FileInput.java");
					int i;
					while ((i = fis.read())!= -1) {
						System.out.print((char) i);
					}
				} catch (FileNotFoundException e) {
					e.printStackTrace();

				} finally {
					try {
						fis.close();
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}
		
	

}
