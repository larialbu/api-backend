package com.example.oxeqarti.service;

import java.util.List;

import com.example.oxeqarti.model.Arte;
import com.example.oxeqarti.model.Galeria;

public interface GaleriaService {
    
    Galeria salvarGaleria(Galeria galeria);
    
    List<Arte> encontrarObrasEmExposicaoPorGaleria(String nomeGaleria);
    
}
