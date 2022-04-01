package com.example.Payroll;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PayrollApplication {

	public static void main(String[] args) {
		System.out.println("Mensaje nuevo de prueba");
		SpringApplication.run(PayrollApplication.class, args);
	}

}
