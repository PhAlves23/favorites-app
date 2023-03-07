package br.com.fiap.favoritesapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.fiap.favoritesapp.dto.UsuarioDTO;
import br.com.fiap.favoritesapp.service.UsuarioService;

@RestController
public class UsuarioController {

  @Autowired
  private UsuarioService service;

  @GetMapping("/api/usuarios")
  public ResponseEntity<List<UsuarioDTO>> findAll(){
    List<UsuarioDTO> usuarios = service.findAll();
    return ResponseEntity.ok().body(usuarios);
  }

  // @GetMapping("/api/usuarios/{id}")
  // public ResponseEntity<UsuarioDTO> findById(){

  // }

    // @GetMapping("/api/usuarios")  
    // public String usuario(){
    //   return "Usuario";
    // }

}