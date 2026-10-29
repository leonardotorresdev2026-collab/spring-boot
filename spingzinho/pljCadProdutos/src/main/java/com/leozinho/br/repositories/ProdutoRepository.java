package com.leozinho.br.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.leozinho.br.entities.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long>{

}
