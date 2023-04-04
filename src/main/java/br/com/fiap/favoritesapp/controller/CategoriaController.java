package br.com.fiap.favoritesapp.controller;

import java.util.List;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import br.com.fiap.favoritesapp.dto.CategoriaDTO;
import br.com.fiap.favoritesapp.service.CategoriaService;

@RestController
@RequestMapping("/api/categorias")
public class CategoriaController {
  
  @Autowired
  private CategoriaService service;

 @GetMapping
 public ResponseEntity<List<CategoriaDTO>> findAll(){
    List<CategoriaDTO> categorias = service.findAll();
    return ResponseEntity.ok().body(categorias); 
 }

 @GetMapping("{id}")
 public ResponseEntity<CategoriaDTO> findById(@PathVariable Long id){
  CategoriaDTO categoria = service.findById(id);
  return ResponseEntity.ok().body(categoria);
 }

 @PostMapping
 public ResponseEntity<CategoriaDTO> insert(@RequestBody @Valid CategoriaDTO dto, UriComponentsBuilder uriBuilder){
    var categoria = service.insert(dto);
   var uri = uriBuilder.path("/api/categorias/{id}").buildAndExpand(categoria.id()).toUri();
  return ResponseEntity.created(uri).body(categoria);
 }   

 @PutMapping("{id}")
 public ResponseEntity<CategoriaDTO> update(@PathVariable Long id, @RequestBody @Valid CategoriaDTO dto){
  var categoria = service.update(id, dto);
  return ResponseEntity.ok().body(categoria);
 }

 @DeleteMapping("{id}")
 public ResponseEntity<Void> delete(@PathVariable Long id){
  service.delete(id);
  return ResponseEntity.noContent().build();
 }

}
