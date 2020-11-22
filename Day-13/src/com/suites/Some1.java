package com.suites;

import static org.junit.Assert.*;

import org.junit.Test;

public class Some1 {

	String message="Lekha Sri";
	Some s=new Some(message);
	@Test
	void testPrintMessage() {
		System.out.println("this is the first message");
		assertEquals(message,s.printMessage());
	}

}
