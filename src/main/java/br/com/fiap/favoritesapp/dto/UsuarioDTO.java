package br.com.fiap.favoritesapp.dto;

import br.com.fiap.favoritesapp.model.Endereco;
import br.com.fiap.favoritesapp.model.Usuario;

public class UsuarioDTO { 

  private Long id;
  private String nome;
  private String email;
  private String senha;
  private Byte avatar;
  private String telefone;

  public UsuarioDTO() {
  }

  public UsuarioDTO(Long id, String nome, String email, String senha, Byte avatar, Endereco endereco, String telefone) {
    this.id = id;
    this.nome = nome;
    this.email = email;
    this.senha = senha;
    this.avatar = avatar;
    this.telefone = telefone;
  }

  public UsuarioDTO(Usuario usuario){
    this.id = usuario.getId();
    this.nome = usuario.getNome();
    this.email = usuario.getEmail();
    this.senha = usuario.getSenha();
    this.avatar = usuario.getAvatar();
    this.telefone = usuario.getTelefone();
  }

  public UsuarioDTO(UsuarioDTO usuarioDTO){
    this.nome = usuarioDTO.getNome();
    this.email = usuarioDTO.getEmail();
    this.senha = usuarioDTO.getSenha();
    this.telefone = usuarioDTO.getTelefone();
    this.avatar = usuarioDTO.getAvatar();
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }


  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getSenha() {
    return senha;
  }

  public void setSenha(String senha) {
    this.senha = senha;
  }

  public Byte getAvatar() {
    return avatar;
  }

  public void setAvatar(Byte avatar) {
    this.avatar = avatar;
  }

  public String getTelefone() {
    return telefone;
  }

  public void setTelefone(String telefone) {
    this.telefone = telefone;
  }

}
