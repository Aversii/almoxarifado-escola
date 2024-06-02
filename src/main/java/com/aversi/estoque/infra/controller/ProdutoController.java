package com.aversi.estoque.infra.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aversi.estoque.application.CriarProduto;
import com.aversi.estoque.application.ListarProduto;
import com.aversi.estoque.domain.entities.Produto;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    private CriarProduto criarProduto;
    private ListarProduto listarProduto;

    public ProdutoController(CriarProduto criarProduto, ListarProduto listarProduto) {
        this.criarProduto = criarProduto;
        this.listarProduto = listarProduto;
    }

    @PostMapping
    public ProdutoDto cadastrarProduto(@RequestBody ProdutoDto dto) {
        Produto salvo = criarProduto
                .cadastraProduto(new Produto(dto.id(), dto.nome(), dto.quantidade(), dto.unidadeMedida()));
        return new ProdutoDto(salvo.getId(), salvo.getNome(), salvo.getQuantidade(), salvo.getUnidadeMedida());
    }

    @GetMapping
    public List<ProdutoDto> obterTodosProdutos() {
        return listarProduto.obterTodosProdutos().stream()
                .map(produto -> new ProdutoDto(produto.getId(), produto.getNome(), produto.getQuantidade(),
                        produto.getUnidadeMedida()))
                .collect(Collectors.toList());
    }

    @GetMapping("/{id}")
        public ProdutoDto listarProdutoPorId(@PathVariable("id")  String id) {
        Produto produto = listarProduto.listarProdutoPorId(id);
        return new ProdutoDto(produto.getId(), produto.getNome(), produto.getQuantidade(), produto.getUnidadeMedida());
   
    }
    

}
