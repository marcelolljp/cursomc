package com.mlac.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mlac.cursomc.domain.Cliente;
import com.mlac.cursomc.repositories.ClienteRepository;
import com.mlac.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class ClienteService {
	
	@Autowired
	private ClienteRepository catre;
	
	public Cliente find(Integer id) {
		Optional<Cliente> obj = catre.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado! Id: " + id + ", Tipo: " + Cliente.class.getName()));
	}

}
