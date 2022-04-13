package com.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PrincipalTest {

	@Test
	public void testsuma() {
	
	System.out.println("suma");
	Principal prin = new Principal(5,5,0);
    prin.suma();
    int expResult = 10;
    int result = prin.suma();
    assertEquals(expResult, result);
}
}
