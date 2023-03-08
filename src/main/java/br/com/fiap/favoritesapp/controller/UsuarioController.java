package br.com.fiap.favoritesapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.fiap.favoritesapp.dto.UsuarioDTO;
import br.com.fiap.favoritesapp.service.UsuarioService;
  //findAll
  //findById
  //create
  //update
  //delete

@RestController
public class UsuarioController {

  @Autowired
  private UsuarioService service;

  @GetMapping("/api/usuarios")
  public ResponseEntity<List<UsuarioDTO>> findAll(){
    List<UsuarioDTO> usuarios = service.findAll();
    return ResponseEntity.ok().body(usuarios);
  }

  @GetMapping("/api/usuarios/{id}")
  public ResponseEntity<UsuarioDTO> findById(@PathVariable Long id){
    UsuarioDTO usuario = service.findById(id);
    return ResponseEntity.ok().body(usuario);  
  }

  //create
  // @PostMapping("/api/usuarios")
  // public ResponseEntity<UsuarioDTO> create(){
  //   return null;
  // }


  //update


  //delete
  @DeleteMapping("/api/usuarios/{id}")
  public ResponseEntity<Void> delete(@PathVariable Long id){
    service.delete(id);
    return ResponseEntity.noContent().build();
  }
}