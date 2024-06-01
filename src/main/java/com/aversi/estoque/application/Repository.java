package com.aversi.estoque.application;


import com.aversi.estoque.domain.entities.Produto;

public interface Repository {
    Produto cadastrarProduto(Produto produto);
    
}
