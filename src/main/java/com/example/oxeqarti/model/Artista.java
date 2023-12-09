package com.example.oxeqarti.model;

import java.util.ArrayList;
import java.util.List;

public class Artista {
    private String nomeArtista;
    private List<Arte> obras = new ArrayList<>();

    public Artista(String nomeArtista) {
        this.nomeArtista = nomeArtista;
    }

    public void criarObra(Arte arte) {
        obras.add(arte);
    }

    public void listarObras() {
        System.out.println("Obras do artista " + nomeArtista + ":");
        for (Arte obra : obras) {
            System.out.println(obra.getTitulo());
        }
    }

    public String getNomeArtista() {
        return nomeArtista;
    }

    public List<Arte> getObras() {
        return new ArrayList<>(obras);
    }
}
