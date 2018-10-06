package com.javaapirest.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaapirest.domain.Produto;
import com.javaapirest.repositories.ProdutoRepository;

@Service
public class ProdutoService {
	
	@Autowired
	private ProdutoRepository repo;
	
	public Produto buscar(Integer id) {
		Optional<Produto> obj = repo.findById(id);
		return obj.orElse(null);		
	}
	
	public List<Produto> buscarTodos(){
		List<Produto> listaProduto = repo.findAll();
		return listaProduto;
	}
	
	public Produto inserir(Produto obj){
		obj.setProduto_id(null);
		return repo.save(obj);
	}
}
