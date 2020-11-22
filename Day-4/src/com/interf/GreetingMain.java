package com.interf;

public class GreetingMain {
	public static void main(String[] args)
	{
		Greeting g=new English();
		g.Morning();
		g.Afternoon();
		g.Evening();
		g.Night();
		Greeting gr=new Hindi();
		gr.Morning();
		gr.Afternoon();
		gr.Evening();
		gr.Night();
		Greeting ge=new Telugu();
		ge.Morning();
		ge.Afternoon();
		ge.Evening();
		ge.Night();
		
	}

}
