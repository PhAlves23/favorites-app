package br.com.fiap.favoritesapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

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

  @GetMapping("/api/usuarios/{id}")
  public ResponseEntity<UsuarioDTO> findById(@PathVariable Long id){
    UsuarioDTO usuario = service.findById(id);
    return ResponseEntity.ok().body(usuario);  
  }

  @PostMapping("/api/usuarios")
  public ResponseEntity<UsuarioDTO> insert(@RequestBody UsuarioDTO dto){
    var usuario = service.insert(dto);
    var uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(usuario.getId()).toUri(); 
    // var uri = uriBuilder.path("/api/usuarios/{id}").buildAndExpand(usuario.getId()).toUri();
    return ResponseEntity.created(uri).body(usuario);
  }

  //update
  @PutMapping("/api/usuarios/{id}")
  public ResponseEntity<UsuarioDTO> update(@PathVariable Long id, @RequestBody UsuarioDTO dto){
    var usuario = service.update(id, dto);
    return ResponseEntity.ok().body(usuario);
  }

  @DeleteMapping("/api/usuarios/{id}")
  public ResponseEntity<Void> delete(@PathVariable Long id){
    service.delete(id);
    return ResponseEntity.noContent().build();
  }
}