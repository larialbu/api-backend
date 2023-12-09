package com.example.oxeqarti.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.oxeqarti.model.Artista;
import com.example.oxeqarti.service.ArtistaService;

import java.util.List;

@RestController
@RequestMapping("/artistas")
public class ArtistaController {

    @Autowired
    private ArtistaService artistaService;

    @PostMapping
    public Artista salvarArtista(@RequestBody Artista artista) {
        return artistaService.salvarArtista(artista);
    }

    @GetMapping("/{nomeArtista}")
    public Artista encontrarArtistaPorNome(@PathVariable String nomeArtista) {
        return artistaService.encontrarArtistaPorNome(nomeArtista);
    }

    @GetMapping
    public List<Artista> encontrarTodosOsArtistas() {
        return artistaService.encontrarTodosOsArtistas();
    }

}
