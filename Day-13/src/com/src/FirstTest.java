package com.src;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Test;
class FirstTest {

	@Test
	void testDeposite() {
		Account a=new Account("hey",245456789,4500);
		Boolean b=a.deposit(5000);
		assertEquals(b,true);
	}

}
