package com.leozinho.br.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_produtos")
public class Produto {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	 
	private String nome;
	
	private double preco;

	
	
	
	
	//construtores sem parametro
	
	public Produto () {}
	
	
	//com parametro 
	public Produto(Long id, String nome, double preco) {
		super();
		this.id = id;
		this.nome = nome;
		this.preco = preco;
	}


	
	
	// metodos de acesso
	
	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public double getPreco() {
		return preco;
	}


	public void setPreco(double preco) {
		this.preco = preco;
	}
	

	

	
	
}









