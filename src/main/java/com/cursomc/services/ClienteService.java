package com.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cursomc.domain.Categoria;
import com.cursomc.domain.Cliente;
import com.cursomc.repositories.CategoriaRepository;
import com.cursomc.repositories.ClienteRepository;
import com.cursomc.services.exception.ObjectNotFoundException;

@Service
public class ClienteService {
	
	@Autowired
	private ClienteRepository repo;

	public Cliente find(Integer id)  {
		Optional<Cliente> retorno = repo.findById(id);
		return retorno.orElseThrow(() -> new ObjectNotFoundException("Obejeto não encontrado! Id: "+id+" Tipo:"+Categoria.class.getName()));
	}
	
}
