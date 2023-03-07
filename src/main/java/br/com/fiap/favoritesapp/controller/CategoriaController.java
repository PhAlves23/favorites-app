package br.com.fiap.favoritesapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CategoriaController {
  
  @GetMapping("/api/categorias")
  public String categoria(){
    return "Categoria";
  }
}
