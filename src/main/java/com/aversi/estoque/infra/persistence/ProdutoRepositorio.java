package com.aversi.estoque.infra.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aversi.estoque.domain.entities.Produto;

public interface ProdutoRepositorio extends JpaRepository<Produto, String> {
    
}