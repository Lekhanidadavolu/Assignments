package com.files;

import java.io.IOException;

public class RandomAccessFile
{
	static final String FILEPATH ="hello.TXT";
	public static void main(String[] args) throws CloneNotSupportedException
	{
		// TODO Auto-generated method stub
		 try {  
	            System.out.println(new String(readFromFile(FILEPATH, 0, 18)));  
	            writeToFile(FILEPATH, "hello world", 31);  
	        } catch (IOException e) {  
	            e.printStackTrace();  
	        }  
	    }  
	    private static byte[] readFromFile(String filePath, int position, int size)  
	            throws IOException, CloneNotSupportedException {  
	        RandomAccessFile file = new RandomAccessFile();  
	        file.seek(position);  
	        byte[] bytes = new byte[size];  
	        file.read(bytes);  
	        file.clone();  
	        return bytes;  
	    }  
	    private void read(byte[] bytes) {
			// TODO Auto-generated method stub
			
		}
		private void seek(int position) {
			// TODO Auto-generated method stub
			
		}
		private static void writeToFile(String filePath, String data, int position)  
	            throws IOException, CloneNotSupportedException {  
	        RandomAccessFile file = new RandomAccessFile();  
	        file.seek(position);  
	        file.write(data.getBytes());  
	        file.clone();  
	}
		private void write(byte[] bytes) {
			// TODO Auto-generated method stub
			
		}
}
