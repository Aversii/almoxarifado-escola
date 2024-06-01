package com.aversi.estoque.application;

import java.util.List;

import com.aversi.estoque.domain.entities.Produto;

public interface Repository {
    Produto cadastrarProduto(Produto produto);
    List <Produto> listarTodosProdutos ();
    
}
