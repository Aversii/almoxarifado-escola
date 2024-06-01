package com.aversi.estoque.infra.controller;

public record ProdutoDto(
    String id,
    String nome,
    Integer quantidade,
    String unidadeMedida
) {


} 