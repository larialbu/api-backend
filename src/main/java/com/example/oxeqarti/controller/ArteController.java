package com.example.oxeqarti.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.oxeqarti.model.Arte;
import com.example.oxeqarti.service.ArteService;

import java.util.List;

@RestController
@RequestMapping("/artes")
public class ArteController {

    @Autowired
    private ArteService arteService;

    @PostMapping
    public Arte salvarArte(@RequestBody Arte arte) {
        return arteService.salvarArte(arte);
    }

    @GetMapping("/{titulo}")
    public Arte encontrarArtePorTitulo(@PathVariable String titulo) {
        return arteService.encontrarArtePorTitulo(titulo);
    }

    @GetMapping
    public List<Arte> encontrarTodasAsArtes() {
        return arteService.encontrarTodasAsArtes();
    }

}
