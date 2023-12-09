package com.example.oxeqarti.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.oxeqarti.model.Arte;
import com.example.oxeqarti.model.Galeria;
import com.example.oxeqarti.service.GaleriaService;

import java.util.List;

@RestController
@RequestMapping("/galerias")
public class GaleriaController {

    @Autowired
    private GaleriaService galeriaService;

    @PostMapping
    public Galeria salvarGaleria(@RequestBody Galeria galeria) {
        return galeriaService.salvarGaleria(galeria);
    }

    @GetMapping("/obras/{nomeGaleria}")
    public List<Arte> encontrarObrasEmExposicaoPorGaleria(@PathVariable String nomeGaleria) {
        return galeriaService.encontrarObrasEmExposicaoPorGaleria(nomeGaleria);
    }

}
