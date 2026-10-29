package com.leozinho.br.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.leozinho.br.entities.Produto;
import com.leozinho.br.repositories.ProdutoRepository;

@Service
public class ProdutoService {

	private final ProdutoRepository produtorepository;

	public ProdutoService(ProdutoRepository produtorepository) {

		this.produtorepository = produtorepository;
	}

	public Produto criarProduto(Produto produto) {
		return produtorepository.save(produto);
	}

	public List<Produto> ListarProdutos() {
		return produtorepository.findAll();
	}

	public Produto getProdutoId(Long id) {
		return produtorepository.findById(id).orElse(null);
	}

	public void excluirProdutoId(Long id) {
		produtorepository.deleteById(id);

	}
}
