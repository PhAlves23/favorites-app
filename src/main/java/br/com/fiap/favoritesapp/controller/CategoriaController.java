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
import org.springframework.web.util.UriComponentsBuilder;

import br.com.fiap.favoritesapp.dto.CategoriaDTO;
import br.com.fiap.favoritesapp.service.CategoriaService;

@RestController
public class CategoriaController {
  
  @Autowired
  private CategoriaService service;

 @GetMapping("/api/categorias")
 public ResponseEntity<List<CategoriaDTO>> findAll(){
    List<CategoriaDTO> categorias = service.findAll();
    return ResponseEntity.ok().body(categorias); 
 }

 @GetMapping("/api/categorias/{id}")
 public ResponseEntity<CategoriaDTO> findById(@PathVariable Long id){
  CategoriaDTO categoria = service.findById(id);
  return ResponseEntity.ok().body(categoria);
 }

 @PostMapping("/api/categorias")
 public ResponseEntity<CategoriaDTO> insert(@RequestBody CategoriaDTO dto, UriComponentsBuilder uriBuilder){
    var categoria = service.insert(dto);
   var uri = uriBuilder.path("/api/categorias/{id}").buildAndExpand(categoria.id()).toUri();
  return ResponseEntity.created(uri).body(categoria);
 }   

 @PutMapping("/api/categorias/{id}")
 public ResponseEntity<CategoriaDTO> update(@PathVariable Long id, @RequestBody CategoriaDTO dto){
  var categoria = service.update(id, dto);
  return ResponseEntity.ok().body(categoria);
 }

 @DeleteMapping("/api/categorias/{id}")
 public ResponseEntity<Void> delete(@PathVariable Long id){
  service.delete(id);
  return ResponseEntity.noContent().build();
 }

}
