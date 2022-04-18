package com.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PrincipalTest {

	@Test
	public void testsuma() {
	

	Principal prin = new Principal(1,3,0,0);
    prin.suma();
    int expResult = 4;
    int result = prin.suma();
    assertEquals(expResult, result);
    
	System.out.println(" La suma es: " +prin.totalsuma);
}
	
	
	@Test
	public void testmultiplicacion() {
		
	Principal prin = new Principal(1,3,0,0);
    prin.multiplicacion();
    int expResult = 15;
    int result = prin.multiplicacion();
    assertEquals(expResult, result);
    
    System.out.println(" Multiplicado es: " +prin.totalmulti);
}
	
	
}