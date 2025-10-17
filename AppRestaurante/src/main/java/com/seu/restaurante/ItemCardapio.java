package com.seu.restaurante;

import java.math.BigDecimal;
import java.util.Objects;

public class ItemCardapio {

    private int id;
    private String nome;
    private String descricao;
    private BigDecimal preco;
    private String categoria;
    private boolean disponivel;

    public ItemCardapio(int id, String nome, String descricao, BigDecimal preco, String categoria, boolean disponivel) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.categoria = categoria;
        this.disponivel = disponivel;
    }
    public ItemCardapio(String nome, String descricao, BigDecimal preco, String categoria, boolean disponivel) {
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.categoria = categoria;
        this.disponivel = disponivel;
    }

    public int getId() { return id; }
    public String getNome() { return nome; }
    public String getDescricao() { return descricao; }
    public BigDecimal getPreco() { return preco; }
    public String getCategoria() { return categoria; }
    public boolean isDisponivel() {
        boolean isDisponivel = false;
        return isDisponivel; }
    public void setDisponivel(boolean disponivel) { this.disponivel = disponivel; }
    public void setId(int id) { this.id = id; }
    @Override
    public String toString() {
        return String.format("%s - R$ %.2f", nome, preco);
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ItemCardapio that = (ItemCardapio) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}