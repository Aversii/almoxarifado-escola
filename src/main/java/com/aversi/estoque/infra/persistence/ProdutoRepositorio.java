package com.aversi.estoque.infra.persistence;

import org.springframework.data.jpa.repository.JpaRepository;


public interface ProdutoRepositorio extends JpaRepository<ProdutoEntity, String> {

}