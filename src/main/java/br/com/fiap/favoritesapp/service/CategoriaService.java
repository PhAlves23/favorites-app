package br.com.fiap.favoritesapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.fiap.favoritesapp.dto.CategoriaDTO;
import br.com.fiap.favoritesapp.model.Categoria;
import br.com.fiap.favoritesapp.repository.CategoriaRepository;

@Service
public class CategoriaService {

  @Autowired
  private CategoriaRepository repository;

  @Transactional(readOnly = true)
  public List<CategoriaDTO> findAll(){
      List<Categoria> list = repository.findAll();
      return list.stream().map(c -> new CategoriaDTO(c)).toList();
  }

  @Transactional(readOnly = true)
  public CategoriaDTO findById(Long id){
    var categoria = repository.findById(id).get();
    return new CategoriaDTO(categoria);
  }

  @Transactional
  public CategoriaDTO insert(CategoriaDTO categoriaDTO){
   var categoria = repository.save(new Categoria(categoriaDTO));
   return new CategoriaDTO(categoria);
  }

  @Transactional
  public CategoriaDTO update(Long id, CategoriaDTO categoriaDTO){
    var categoria = repository.getReferenceById(id);
    categoria = repository.save(new Categoria(categoriaDTO));
    return new CategoriaDTO(categoria);
  }

  @Transactional
  public void delete(Long id){
    repository.deleteById(id);
  }
  
}
