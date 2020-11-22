package com.src;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


class SecondTest {

	@Test
	void testWithdraw() {
		Account a=new Account("hello",245456789,4500);
		boolean b=a.withdraw(500, 50);
		assertEquals(b,true);
	}

}
