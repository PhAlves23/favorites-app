package br.com.fiap.favoritesapp.dto;

import br.com.fiap.favoritesapp.model.Usuario;

public record UsuarioDTO(  Long id, String nome, String email, String senha, Byte avatar, String telefone) {
  
  public UsuarioDTO(Usuario usuario){
    this(usuario.getId(), usuario.getNome(), usuario.getEmail(), usuario.getSenha(), usuario.getAvatar(), usuario.getTelefone());
  }
}
