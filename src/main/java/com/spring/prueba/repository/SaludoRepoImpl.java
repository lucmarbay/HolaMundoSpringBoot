package com.spring.prueba.repository;

import org.springframework.stereotype.Repository;

@Repository
public class SaludoRepoImpl implements ISaludoRepo {

	@Override
	public void saludar(String nombre) {
		System.out.println("Hola "+ nombre);
		
	}

}
