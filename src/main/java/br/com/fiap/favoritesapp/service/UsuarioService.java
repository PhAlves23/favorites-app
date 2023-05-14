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
  public Page<UsuarioDTO> findAll(String nome, Pageable pageable) {

    if(nome == null){
      Page<Usuario> usuarios = repository.findAll(pageable);
      return usuarios.map(u -> new UsuarioDTO(u));
    }

    Page<Usuario> usuarios = repository.findByNomeContainingIgnoreCase(nome, pageable);
    return usuarios.map(u -> new UsuarioDTO(u));

  }

  @Transactional(readOnly = true)
  public Page<UsuarioDTO> findByNomeContainingIgnoreCase(String nome, Pageable pageable) {
    Page<Usuario> page = repository.findByNomeContainingIgnoreCase(nome, pageable);
    return page.map(usuario -> new UsuarioDTO(usuario));
  }

  //--------------------------------------------//
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
