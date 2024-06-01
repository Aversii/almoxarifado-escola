package com.aversi.estoque.infra.persistence;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.UUID;

@Entity
@Table(name = "material")
public class ProdutoEntity {

    @Id
    private String id_material;
    private String nome;
    private Integer quantidade;
    private String unidade_medida;

    public ProdutoEntity() {
        this.id_material = UUID.randomUUID().toString();
    }

    public ProdutoEntity(String nome, Integer quantidade, String unidadeMedida) {
        this.id_material = UUID.randomUUID().toString();
        this.nome = nome;
        this.quantidade = quantidade;
        this.unidade_medida = unidadeMedida;
    }

    public String getId() {
        return id_material;
    }

    public void setId(String idMaterial) {
        this.id_material = idMaterial;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public String getUnidadeMedida() {
        return unidade_medida;
    }

    public void setUnidadeMedida(String unidadeMedida) {
        this.unidade_medida = unidadeMedida;
    }
}
