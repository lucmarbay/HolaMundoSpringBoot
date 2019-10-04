package com.spring.prueba.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.prueba.repository.ISaludoRepo;
@Service
public class SaludoServiceImpl implements ISaludoService{
	@Autowired
	private ISaludoRepo repo;

	@Override
	public void mostrarSaludo(String nombre) {
		repo.saludar(nombre);
	}

}
