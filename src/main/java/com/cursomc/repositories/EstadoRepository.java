package com.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cursomc.domain.Categoria;
import com.cursomc.domain.Cidade;
import com.cursomc.domain.Estado;
import com.cursomc.domain.Produto;

@Repository
public interface EstadoRepository extends JpaRepository<Estado, Integer>{
	

}
