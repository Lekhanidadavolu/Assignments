package com.suites;

public class Some {

	private String message;
	public Some(String message)
	{
		this.message=message;
	}
	public String appendMessage()
	{
		message="hey "+message;
		return message;
	}
	public String printMessage()
	{
		System.out.println(message);
		return message;
	}
}
