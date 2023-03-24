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

import br.com.fiap.favoritesapp.dto.AvaliacaoDTO;
import br.com.fiap.favoritesapp.service.AvaliacaoService;

@RestController
public class AvaliacaoController {
  @Autowired
  private AvaliacaoService service;
  
  @GetMapping("/api/avaliacoes")
  public ResponseEntity<List<AvaliacaoDTO>> findAll(){
    List<AvaliacaoDTO> avaliacoes = service.findAll();
    return ResponseEntity.ok(avaliacoes);
  }

  @GetMapping("/api/avaliacoes/{id}")	
  public ResponseEntity<AvaliacaoDTO> findById(@PathVariable Long id){
    AvaliacaoDTO avaliacao = service.findById(id);
    return ResponseEntity.ok(avaliacao);
  }

  @PostMapping("/api/avaliacoes")
  public ResponseEntity<AvaliacaoDTO> insert(@RequestBody AvaliacaoDTO dto){
    AvaliacaoDTO avaliacao = service.insert(dto);
    return ResponseEntity.ok(avaliacao);
  }  

  @PutMapping("/api/avaliacoes/{id}")
  public ResponseEntity<AvaliacaoDTO> update(@PathVariable Long id, @RequestBody AvaliacaoDTO dto){
    AvaliacaoDTO avaliacao = service.update(id, dto);
    return ResponseEntity.ok(avaliacao);
  }

  @DeleteMapping("/api/avaliacoes/{id}")
  public ResponseEntity<Void> delete(@PathVariable Long id){
    service.delete(id);
    return ResponseEntity.noContent().build();
  }
}
