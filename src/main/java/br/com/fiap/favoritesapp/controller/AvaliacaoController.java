package br.com.fiap.favoritesapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AvaliacaoController {
  
  @GetMapping("/api/avaliacoes")
  public String avaliacao(){
    return "Avaliacao";
  }
}
