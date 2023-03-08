package br.com.fiap.favoritesapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.fiap.favoritesapp.dto.UsuarioDTO;
import br.com.fiap.favoritesapp.model.Usuario;
import br.com.fiap.favoritesapp.repository.UsuarioRepository;

@Service
public class UsuarioService {

  @Autowired
  public UsuarioRepository repository;

  @Transactional(readOnly = true)
  public List<UsuarioDTO> findAll(){
    List<Usuario> list = repository.findAll();
    return list.stream().map(u -> new UsuarioDTO(u)).toList();
  }

  @Transactional(readOnly = true)
  public UsuarioDTO findById(Long id){
    var usuario = repository.findById(id).get();
    return new UsuarioDTO(usuario);
  }

  // @Transactional
  // public UsuarioDTO create(UsuarioDTO dto){
    
  // }

  @Transactional
  public void  delete(Long id){
    repository.deleteById(id);
  }

}
