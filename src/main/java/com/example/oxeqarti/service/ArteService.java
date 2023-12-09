package com.example.oxeqarti.service;

import java.util.List;

import com.example.oxeqarti.model.Arte;

public interface ArteService {
    
    Arte salvarArte(Arte arte);
    
    Arte encontrarArtePorTitulo(String titulo);
    
    List<Arte> encontrarTodasAsArtes();
    
}
