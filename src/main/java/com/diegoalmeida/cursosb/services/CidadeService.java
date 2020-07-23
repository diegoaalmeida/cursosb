package com.diegoalmeida.cursosb.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.diegoalmeida.cursosb.domain.Cidade;
import com.diegoalmeida.cursosb.repositories.CidadeRepository;

@Service
public class CidadeService {
	
	@Autowired
	CidadeRepository repo;
	
	public List<Cidade> findCidades(Integer estadoId){
		return repo.findCidades(estadoId);
	}

}
