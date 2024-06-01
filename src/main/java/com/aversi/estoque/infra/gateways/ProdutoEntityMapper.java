package com.aversi.estoque.infra.gateways;

import com.aversi.estoque.domain.entities.Produto;
import com.aversi.estoque.infra.persistence.ProdutoEntity;

public class ProdutoEntityMapper {

    public ProdutoEntity toEntity(Produto produto){
        return new ProdutoEntity(produto.getId(),produto.getNome(),produto.getQuantidade(),produto.getUnidadeMedida());
    }

    public Produto toDomain (ProdutoEntity entity){
        return new Produto (entity.getId(),entity.getNome(),entity.getQuantidade(),entity.getUnidadeMedida());
    }
    
}
