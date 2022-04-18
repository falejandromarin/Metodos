package com.example;

public class Principal {
	
	int a=0;
	int b=0;
	int totalsuma=0;
	int totalmulti=0;
	
	public Principal(int a, int b, int totalsuma, int totalmulti) {

        this.a = a;
        this.b = b;
        this.totalsuma = totalsuma;
        this.totalsuma = totalmulti;
    }
	public int suma() {
	 totalsuma=a+b;
	 
	 return totalsuma;
	}
	public int multiplicacion() {
		 totalmulti=a*b;
		 
		 return totalmulti;
		}
	
	
		
	

}