package com.aversi.estoque.application;

public class DeletarProduto {
    private final Repository produtoRepo;

    public DeletarProduto(Repository produtoRepo) {
        this.produtoRepo = produtoRepo;
    }

    public void delecao(String id){
        this.produtoRepo.deleteProduto(id);
    }

    

}
