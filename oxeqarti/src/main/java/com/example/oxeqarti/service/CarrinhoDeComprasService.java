package com.example.oxeqarti.service;

import java.util.List;

import com.example.oxeqarti.model.CarrinhoDeCompras;
import com.example.oxeqarti.model.Usuario;

public interface CarrinhoDeComprasService {
    
    CarrinhoDeCompras salvarCarrinhoDeCompras(CarrinhoDeCompras carrinhoDeCompras);
    
    List<CarrinhoDeCompras> encontrarCarrinhosPorUsuario(Usuario usuario);
    
}
