package br.com.fiap.favoritesapp.service;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
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
  public UsuarioDTO findById(Long id){
    var usuario = repository.findById(id).get();
    return new UsuarioDTO(usuario);
  }

  @Transactional
  public UsuarioDTO insert(UsuarioDTO usuarioDTO){
    var usuario = repository.save(new Usuario(usuarioDTO));
    return new UsuarioDTO(usuario);
  }

  @Transactional
  public UsuarioDTO update(Long id, UsuarioDTO usuarioDTO){
    var usuario = repository.getReferenceById(id);
    usuario = repository.save(new Usuario(usuarioDTO));
    return new UsuarioDTO(usuario);
  }

  @Transactional
  public void  delete(Long id){
    repository.deleteById(id);
  }


}
