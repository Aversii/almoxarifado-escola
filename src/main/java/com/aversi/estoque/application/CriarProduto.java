package com.aversi.estoque.application;

import com.aversi.estoque.domain.entities.Produto;

public class CriarProduto {

    private final Repository produtoRepo;

    public CriarProduto(Repository produtoRepo) {
        this.produtoRepo = produtoRepo;
    }

    public Produto cadastraProduto(Produto produto) {
        return produtoRepo.cadastrarProduto(produto);
    } 
    
    
    
}
