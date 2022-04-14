package com.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PrincipalTest {

	@Test
	public void testsuma() {
	
	System.out.println("suma");
	Principal prin = new Principal(3,3,0);
    prin.suma();
    int expResult = 11;
    int result = prin.suma();
    assertEquals(expResult, result);
    
}
	
	
}
