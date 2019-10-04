package com.spring.prueba;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.spring.prueba.service.ISaludoService;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner{
	
	@Autowired
	private ISaludoService service;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		service.mostrarSaludo("Luciano");
	}

}
