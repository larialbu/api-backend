package com.example.oxeqarti.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.oxeqarti.model.Arte;
import com.example.oxeqarti.model.Galeria;
import com.example.oxeqarti.repository.GaleriaRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class GaleriaServiceImpl implements GaleriaService {
    
    @Autowired
    private GaleriaRepository galeriaRepository;

    @Override
    public Galeria salvarGaleria(Galeria galeria) {
        return galeriaRepository.save(galeria);
    }

    @Override
    public List<Arte> encontrarObrasEmExposicaoPorGaleria(String nomeGaleria) {
        List<Arte> obrasEmExposicao = galeriaRepository.findByNomeGaleria(nomeGaleria);
        if (obrasEmExposicao != null && !obrasEmExposicao.isEmpty()) {
            return obrasEmExposicao;
        } else {
            return new ArrayList<>();
        }
    }
    
}


