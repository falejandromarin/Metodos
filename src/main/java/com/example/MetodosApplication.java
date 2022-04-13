package com.example;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MetodosApplication {

	public static void main(String[] args) {
		
		Principal prin= new Principal(3,3,0);
		
		prin.suma();
	
		System.out.println("La suma es: "+prin.total);
		
		
	}

}
