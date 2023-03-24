package br.com.fiap.favoritesapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.fiap.favoritesapp.dto.AvaliacaoDTO;
import br.com.fiap.favoritesapp.model.Avaliacao;
import br.com.fiap.favoritesapp.repository.AvaliacaoRepository;

@Service
public class AvaliacaoService {
  
  @Autowired
  public AvaliacaoRepository repository;

  @Transactional(readOnly = true)
  public List<AvaliacaoDTO> findAll(){
    List<Avaliacao> list = repository.findAll();
    return list.stream().map(a -> new AvaliacaoDTO(a)).toList();
  }  
  
  @Transactional(readOnly = true)
  public AvaliacaoDTO findById(Long id){
    var avaliacao = repository.findById(id).get();
    return new AvaliacaoDTO(avaliacao);
  }

  @Transactional
  public AvaliacaoDTO insert(AvaliacaoDTO avaliacaoDTO){
    var avaliacao = repository.save(new Avaliacao(avaliacaoDTO));
    return new AvaliacaoDTO(avaliacao);
  }

  @Transactional
  public AvaliacaoDTO update(Long id, AvaliacaoDTO avaliacaoDTO){
    var avaliacao = repository.getReferenceById(id);
    avaliacao = repository.save(new Avaliacao(avaliacaoDTO));
    return new AvaliacaoDTO(avaliacao);
  }

  @Transactional
  public void delete(Long id){
    repository.deleteById(id);
  } 
}

