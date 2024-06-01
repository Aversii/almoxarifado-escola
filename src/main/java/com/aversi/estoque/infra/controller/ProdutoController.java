package com.aversi.estoque.infra.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aversi.estoque.application.CriarProduto;
import com.aversi.estoque.domain.entities.Produto;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    private CriarProduto criarProduto;

    public ProdutoController(CriarProduto criarProduto) {
        this.criarProduto = criarProduto;
    }

   @PostMapping
   public ProdutoDto cadastrarProduto(@RequestBody ProdutoDto dto) {
    Produto salvo = criarProduto.cadastraProduto(new Produto(dto.id(), dto.nome(), dto.quantidade(), dto.unidadeMedida()));
       return new ProdutoDto(salvo.getId(), salvo.getNome(), salvo.getQuantidade(), salvo.getUnidadeMedida());
   }

}
