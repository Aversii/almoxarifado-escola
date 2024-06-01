package com.aversi.estoque.application;

import java.util.List;

import com.aversi.estoque.domain.entities.Produto;

public class ListarProduto {
    private final Repository produtoRepo;

    public ListarProduto(Repository produtoRepo) {
        this.produtoRepo = produtoRepo;
    }

    public List <Produto> obterTodosProdutos(){
        return this.produtoRepo.listarTodosProdutos();

    }

    

    
}
