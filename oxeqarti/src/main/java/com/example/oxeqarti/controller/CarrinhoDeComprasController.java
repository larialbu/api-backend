package com.example.oxeqarti.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.oxeqarti.model.CarrinhoDeCompras;
import com.example.oxeqarti.model.Usuario;
import com.example.oxeqarti.service.CarrinhoDeComprasService;
import com.example.oxeqarti.service.UsuarioService;

import java.util.List;

@RestController
@RequestMapping("/carrinhos")
public class CarrinhoDeComprasController {

    @Autowired
    private CarrinhoDeComprasService carrinhoDeComprasService;

    @Autowired
    private UsuarioService usuarioService;

    @PostMapping
    public CarrinhoDeCompras salvarCarrinhoDeCompras(@RequestBody CarrinhoDeCompras carrinhoDeCompras) {
        return carrinhoDeComprasService.salvarCarrinhoDeCompras(carrinhoDeCompras);
    }

    @GetMapping("/usuario/{idUsuario}")
    public List<CarrinhoDeCompras> encontrarCarrinhosPorUsuario(@PathVariable Long idUsuario) {
        Usuario usuario = usuarioService.encontrarUsuarioPorId(idUsuario);
        return carrinhoDeComprasService.encontrarCarrinhosPorUsuario(usuario);
    }
}
