package br.com.fiap.favoritesapp.models;


public class Usuario {

    private Integer id;
    private String nome;
    private String email;
    private String senha;
    private String avatar;
    private String telefone;

    public Usuario() {
    }

    public Usuario(Integer id, String nome, String email, String senha, String telefone, String avatar) {
      this.id = id;
      this.nome = nome;
      this.email = email;
      this.senha = senha;
      this.telefone = telefone;
      this.avatar = avatar;
    }


    public Integer getId() {
      return id;
    }


    public void setId(Integer id) {
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


    public String getTelefone() {
      return telefone;
    }


    public void setTelefone(String telefone) {
      this.telefone = telefone;
    }


    public String getAvatar() {
      return avatar;
    }


    public void setAvatar(String avatar) {
      this.avatar = avatar;
    }

    @Override
    public String toString() {
      return "Usuario [id=" + id + ", nome=" + nome + ", email=" + email + ", senha=" + senha + ", telefone=" + telefone
          + ", avatar=" + avatar + "]";
    }

}