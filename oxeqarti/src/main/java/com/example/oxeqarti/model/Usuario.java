package com.example.oxeqarti.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String nome;
    private String email;
    private String senha;

    public Usuario(String nome, String email, String senha) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }

    public void cadastrarConta() {
        System.out.println("Conta de usuário criada para " + nome);
    }

    public void fazerLogin() {
        System.out.println("Usuário " + nome + " fez login com sucesso.");
    }

    public void visualizarPerfil() {
        System.out.println("Perfil de " + nome + ", abaixo:");
        System.out.println("Email: " + email);
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

   public String getSenha() {
       return senha;
   }
}
