package br.com.fiap.favoritesapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsuarioController {

    @GetMapping("/api/usuarios")  
    public String usuario(){
      return "Usuario";
    }

}