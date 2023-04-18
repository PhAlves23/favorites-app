package br.com.fiap.favoritesapp.controller;

import java.util.List;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import br.com.fiap.favoritesapp.dto.UsuarioDTO;
import br.com.fiap.favoritesapp.service.UsuarioService;

@RestController
@RequestMapping("/api/usuarios")
public class UsuarioController {

  @Autowired
  private UsuarioService service;

  @GetMapping
  public ResponseEntity<Page<UsuarioDTO>> findAll(
          @RequestParam(value = "page", defaultValue = "0") Integer page,
          @RequestParam(value = "linesPerPage", defaultValue = "12") Integer linesPerPage,
          @RequestParam(value = "direction", defaultValue = "ASC") String direction,
          @RequestParam(value = "orderBy", defaultValue = "nome") String orderBy,
          @RequestParam(value = "nome", defaultValue = "") String nome
  ){

    Pageable pageable = PageRequest.of(page, linesPerPage, Sort.Direction.valueOf(direction), orderBy);
    Page<UsuarioDTO> usuarios = service.findByNomeContainingIgnoreCase(nome, pageable);
      return ResponseEntity.ok().body(usuarios);
  }

  @GetMapping("{id}")
  public ResponseEntity<UsuarioDTO> findById(@PathVariable Long id){
    UsuarioDTO usuario = service.findById(id);
    return ResponseEntity.ok().body(usuario);  
  }

  @PostMapping
  public ResponseEntity<UsuarioDTO> insert(@RequestBody @Valid UsuarioDTO dto){
    var usuario = service.insert(dto);
    var uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(usuario.id()).toUri(); 
    return ResponseEntity.created(uri).body(usuario);
  }

  @PutMapping("{id}")
  public ResponseEntity<UsuarioDTO> update(@PathVariable Long id, @RequestBody @Valid UsuarioDTO dto){
    var usuario = service.update(id, dto);
    return ResponseEntity.ok().body(usuario);
  }

  @DeleteMapping("{id}")
  public ResponseEntity<Void> delete(@PathVariable Long id){
    service.delete(id);
    return ResponseEntity.noContent().build();
  }
}