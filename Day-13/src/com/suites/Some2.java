package com.suites;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

//import org.junit.jupiter.api.Test;

public class Some2 {
	String message="Lekha Sri";
	Some s=new Some(message);
	@Test
	void testAppendMessage() {
		System.out.println("this is the second message");
		assertEquals("new"+message,s.appendMessage());
	}

}
