package br.com.fiap.favoritesapp.model;

import java.io.Serializable;

import br.com.fiap.favoritesapp.dto.EstabelecimentoDTO;
import br.com.fiap.favoritesapp.dto.UsuarioDTO;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Entity(name = "Usuario")
@Table(name = "TB_USUARIO")

public class Usuario implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    private String nome;
    @Email
    private String email;

    @NotNull
    private String senha;

    private Byte avatar;

    @NotNull
    private String telefone;

    public Usuario() {
    }

    public Usuario(Long id, String nome, String email, String senha, String telefone, Byte avatar) {
      this.id = id;
      this.nome = nome;
      this.email = email;
      this.senha = senha;
      this.telefone = telefone;
      this.avatar = avatar;
    }

    public Usuario(UsuarioDTO usuarioDTO){
      this.nome = usuarioDTO.nome();
      this.email = usuarioDTO.email();
      this.senha = usuarioDTO.senha();
      this.telefone = usuarioDTO.telefone();
      this.avatar = usuarioDTO.avatar();
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

    public String getTelefone() {
      return telefone;
    }

    public void setTelefone(String telefone) {
      this.telefone = telefone;
    }

    public Byte getAvatar() {
      return avatar;
    }

    public void setAvatar(Byte avatar) {
      this.avatar = avatar;
    }

    @Override
    public String toString() {
      return "Usuario [id=" + id + ", nome=" + nome + ", email=" + email + ", senha=" + senha + ", telefone=" + telefone
          + ", avatar=" + avatar + "]";
    }

    @Override
    public int hashCode() {
      final int prime = 31;
      int result = 1;
      result = prime * result + ((id == null) ? 0 : id.hashCode());
      return result;
    }

    @Override
    public boolean equals(Object obj) {
      if (this == obj)
        return true;
      if (obj == null)
        return false;
      if (getClass() != obj.getClass())
        return false;
      Usuario other = (Usuario) obj;
      if (id == null) {
        if (other.id != null)
          return false;
      } else if (!id.equals(other.id))
        return false;
      return true;
    }

    public static long getSerialversionuid() {
      return serialVersionUID;
    }

}