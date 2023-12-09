package com.example.oxeqarti.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Arte {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String titulo;
    private String descricao;
    private String autor;
    private double preco;
    private String categoria;

    public Arte(String titulo, String descricao, String autor, double preco, String categoria) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.autor = autor;
        this.preco = preco;
        this.categoria = categoria;
    }

    public void listarDetalhes() {
        System.out.println("Título: " + titulo);
        System.out.println("Descrição: " + descricao);
        System.out.println("Autor: " + autor);
        System.out.println("Preço: $" + preco);
        System.out.println("Categoria: " + categoria);
    }

    public void adicionarAoCarrinho(CarrinhoDeCompras carrinho) {
        carrinho.adicionarItem(this);
        System.out.println("Arte '" + titulo + "' adicionada ao carrinho.");
    }

    public void comprar() {
        System.out.println("Arte '" + titulo + "' comprada com sucesso.");
    }

    public double getPreco() {
        return preco;
    }

    public String getTitulo() {
        return titulo;
    }

}
