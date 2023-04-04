package br.com.fiap.favoritesapp.controller;

import java.util.List;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import br.com.fiap.favoritesapp.dto.AvaliacaoDTO;
import br.com.fiap.favoritesapp.service.AvaliacaoService;

@RestController
@RequestMapping("/api/avaliacoes")
public class AvaliacaoController {
  @Autowired
  private AvaliacaoService service;
  
  @GetMapping
  public ResponseEntity<List<AvaliacaoDTO>> findAll(){
    List<AvaliacaoDTO> avaliacoes = service.findAll();
    return ResponseEntity.ok(avaliacoes);
  }

  @GetMapping("{id}")
  public ResponseEntity<AvaliacaoDTO> findById(@PathVariable Long id){
    AvaliacaoDTO avaliacao = service.findById(id);
    return ResponseEntity.ok(avaliacao);
  }

  @PostMapping
  public ResponseEntity<AvaliacaoDTO> insert(@RequestBody @Valid AvaliacaoDTO dto){
    AvaliacaoDTO avaliacao = service.insert(dto);
    return ResponseEntity.ok(avaliacao);
  }  

  @PutMapping("{id}")
  public ResponseEntity<AvaliacaoDTO> update(@PathVariable Long id, @RequestBody @Valid AvaliacaoDTO dto){
    AvaliacaoDTO avaliacao = service.update(id, dto);
    return ResponseEntity.ok(avaliacao);
  }

  @DeleteMapping("{id}")
  public ResponseEntity<Void> delete(@PathVariable Long id){
    service.delete(id);
    return ResponseEntity.noContent().build();
  }
}
