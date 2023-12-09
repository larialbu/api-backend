package com.example.oxeqarti.service;

import java.util.List;

import com.example.oxeqarti.model.Artista;

public interface ArtistaService {
    
    Artista salvarArtista(Artista artista);
    
    Artista encontrarArtistaPorNome(String nomeArtista);
    
    List<Artista> encontrarTodosOsArtistas();
    
}
