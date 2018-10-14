package com.javaapirest.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Produto implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer produto_id;
	private String codigo_barra;
    private String nome;
    private String descricao;
    private Integer quantidade;
    private String categoria;
    
    public Produto() {}

	public Produto(Integer produto_id, String codigo_barra, String nome, String descricao, Integer quantidade,
			String categoria) {
		super();
		this.produto_id = produto_id;
		this.codigo_barra = codigo_barra;
		this.nome = nome;
		this.descricao = descricao;
		this.quantidade = quantidade;
		this.categoria = categoria;
	}

	public Integer getProduto_id() {
		return produto_id;
	}

	public void setProduto_id(Integer produto_id) {
		this.produto_id = produto_id;
	}

	public String getCodigo_barra() {
		return codigo_barra;
	}

	public void setCodigo_barra(String codigo_barra) {
		this.codigo_barra = codigo_barra;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public String getCategoria_id() {
		return categoria;
	}

	public void setCategoria_id(String categoria) {
		this.categoria = categoria;
	}

    @Override
    public int hashCode() {
        final Integer prime = 31;
        Integer result = 1;
        result = prime * result + produto_id;
        return result;
    }

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produto other = (Produto) obj;
		if (categoria != other.categoria)
			return false;
		return true;
	}    

}
