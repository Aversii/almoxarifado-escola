package com.aversi.estoque.infra.gateways;

import com.aversi.estoque.application.Repository;
import com.aversi.estoque.domain.entities.Produto;
import com.aversi.estoque.infra.persistence.ProdutoEntity;
import com.aversi.estoque.infra.persistence.ProdutoRepositorio;

public class ProdutoRepositorioJpa implements Repository {
    
    private final ProdutoEntityMapper mapper;
    private final ProdutoRepositorio repo;
    public ProdutoRepositorioJpa(ProdutoEntityMapper mapper, ProdutoRepositorio repo) {
        this.mapper = mapper;
        this.repo = repo;
    }

    @Override
    public Produto cadastrarProduto(Produto produto) {
        ProdutoEntity entity = mapper.toEntity(produto);
        repo.save(entity);
        return mapper.toDomain(entity);
    }

}
