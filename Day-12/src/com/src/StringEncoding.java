package com.src;

import java.util.Base64;
import java.util.Scanner;

public class StringEncoding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
   	 
   	
   	 Base64.Encoder encode=Base64.getEncoder();
   	Base64.Decoder decode=Base64.getDecoder();
   	System.out.println("Enter string name");
   	 String username=encode.encodeToString(sc.next().getBytes());
   	 System.out.println("encoded value is :"+username);
   	 String strdecode= new String(decode.decode(username));
   	 
	}

}
