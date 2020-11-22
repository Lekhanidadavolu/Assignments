package com.src;

import java.util.StringJoiner;

public class StringJoinerEx {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
         StringJoiner sj=new StringJoiner("-");
         sj.add("lekha");
         sj.add("sri");
         System.out.println(sj);
         System.out.println(sj.length());
        
	}

}
