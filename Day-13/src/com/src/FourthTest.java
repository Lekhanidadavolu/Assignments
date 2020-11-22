package com.src;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


class FourthTest {

	@Test
	void testGetAccountNumber() {
		Account a=new Account("hello",245456789,4500);
		long b=a.getAccountNumber();
		assertEquals(b,245456789);
	}

}
