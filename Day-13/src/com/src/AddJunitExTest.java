package com.src;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AddJunitExTest {

	@Test
	void testAdd() {
		AddJunitEx a=new AddJunitEx();
		int actualvalue=a.add(24, 54);
		int expectedvalue=78;
		assertEquals(expectedvalue, actualvalue);
	}

}
