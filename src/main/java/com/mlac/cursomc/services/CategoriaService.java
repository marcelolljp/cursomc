package com.mlac.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mlac.cursomc.domain.Categoria;
import com.mlac.cursomc.repositories.CategoriaRepository;

@Service
public class CategoriaService {
	
	@Autowired
	private CategoriaRepository catre;
	
	public Categoria buscar(Integer id) {
		Optional<Categoria> obj = catre.findById(id);
		return obj.orElse(null);
	}

}
