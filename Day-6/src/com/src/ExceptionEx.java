package com.src;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionEx 
{
    public static void main(String[] args) throws IOException
    {
    	int n=10;
    	int[] m= new int[n];
    	try
    	{
    		FileReader f= new FileReader("dati.txt");
    	      try
    	      {
    	    	  BufferedReader in =new BufferedReader(f);
    	      }
    	      catch(Exception e)
    	      {
    	    	  System.out.println("dati.txt not existing");
    	      }
    	} 
    	catch (Exception e) 
    	{
    	      System.out.println("FileNotFound Exception");
    	}
    	finally
    	{
    		int i=0;
    		BufferedReader in = null;
    		try
    		{
    			String linea=in.readLine();
    		}
			catch(Exception e)
			{
				System.out.println("IO exception");
			}
    		try
    		{
    			String linea = null;
    			while(linea !=null)
    			{
    				String linea1 = null;
					m[i]=Integer.parseInt(linea1);
    				linea1 = in.readLine();
    				i++;
    			}
    		}
    		catch(Exception e)
    		{
    			System.out.println("ArrayIndexOutOfBounds Exception");
    		}
    		BufferedReader f = null;
			f.close();
    	}
     }
    
}
