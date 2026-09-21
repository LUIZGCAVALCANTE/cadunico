package com.cads.cavalcante;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CavalcanteApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(CavalcanteApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {




		System.out.println("Seja bem vindo ao domus");
		System.out.println("Acesso exclusivo a membros");



	}
}
