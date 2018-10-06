package com.javaapirest.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.javaapirest.domain.Produto;

@RestController
@RequestMapping(value="/produtos")
public class ProdutoResource {
	@RequestMapping(method=RequestMethod.GET)
	public List<Produto> listar() {
		Produto p1 = new Produto(1, "123","Informatica","Descricao",2,3);
		Produto p2 = new Produto(2, "123","Escritorio","Descricao",3,4);
		
		List<Produto> lp = new ArrayList<>();
		
		lp.add(p1);
		lp.add(p2);
			
		return lp;
	}

}