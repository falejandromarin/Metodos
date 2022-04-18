package com.example;

import org.springframework.boot.autoconfigure.SpringBootApplication;


import com.example.MetodosApplication;

import org.springframework.boot.SpringApplication;


@SpringBootApplication

public class MetodosApplication {

	public static void main(String[] args) {
		SpringApplication.run(MetodosApplication.class, args);
		
		Principal prin= new Principal(1,3,0,0);
		
		prin.suma();
		prin.multiplicacion();
	
		System.out.println("Sumado es: "+prin.totalsuma+   " y Multplicado es:  " +prin.totalmulti);
		
		
	}

}