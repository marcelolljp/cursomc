package com.mlac.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mlac.cursomc.domain.Pedido;
import com.mlac.cursomc.repositories.PedidoRepository;
import com.mlac.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class PedidoService {
	
	@Autowired
	private PedidoRepository catre;
	
	public Pedido find(Integer id) {
		Optional<Pedido> obj = catre.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado! Id: " + id + ", Tipo: " + Pedido.class.getName()));
	}

}
