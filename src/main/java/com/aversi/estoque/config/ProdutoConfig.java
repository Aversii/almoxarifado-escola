package com.aversi.estoque.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.aversi.estoque.application.CriarProduto;
import com.aversi.estoque.application.DeletarProduto;
import com.aversi.estoque.application.ListarProduto;
import com.aversi.estoque.application.Repository;
import com.aversi.estoque.infra.gateways.ProdutoEntityMapper;
import com.aversi.estoque.infra.gateways.ProdutoRepositorioJpa;
import com.aversi.estoque.infra.persistence.ProdutoRepositorio;

@Configuration
public class ProdutoConfig {

    @Bean
    CriarProduto criarProduto(Repository repo){
        return new CriarProduto(repo);
    }

    @Bean
    ProdutoRepositorioJpa criarRepositorioProdutoJpa(ProdutoEntityMapper mapper, ProdutoRepositorio repo){
        return new ProdutoRepositorioJpa(mapper,repo);
    }

    @Bean
    ListarProduto listarProduto (Repository repo){
        return new ListarProduto(repo);
    }

    @Bean
    DeletarProduto deletarProduto (Repository repo){
        return new DeletarProduto(repo);
    }

    @Bean
    ProdutoEntityMapper retornaMapper(){
        return new ProdutoEntityMapper();
    }

    
}
