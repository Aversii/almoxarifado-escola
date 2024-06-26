package com.aversi.estoque.infra.gateways;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

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

    @Override
    public List<Produto> listarTodosProdutos() {
        return repo.findAll().stream()
                .map(mapper::toDomain)
                .collect(Collectors.toList());
    }

    @Override
    public Produto listarProdutoPorId(String id) {
        Optional<ProdutoEntity> entity = repo.findById(id);
        return entity.map(mapper::toDomain)
                     .orElseThrow(() -> new RuntimeException("Produto não encontrado"));
    }

 @Override
    public void deleteProduto(String id) {
        Optional<ProdutoEntity> entity = repo.findById(id);
        if (entity.isPresent()) {
            repo.delete(entity.get());
        } else {
            throw new RuntimeException("Produto não encontrado");
        }
    }
}
