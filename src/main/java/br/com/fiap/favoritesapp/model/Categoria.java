package br.com.fiap.favoritesapp.model;

import java.io.Serializable;


import br.com.fiap.favoritesapp.dto.CategoriaDTO;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

@Entity(name = "Categoria")
@Table(name = "TB_CATEGORIA")
public class Categoria implements Serializable {

  private static final long serialVersionUID = 1L;
  
      @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
      private Long id;

      @NotNull
      private String nome;

      public Categoria() {
      }

      public Categoria(Long id, String nome) {
            this.id = id;
            this.nome = nome;
      }

      public Categoria(CategoriaDTO categoriaDTO){
        this.id = categoriaDTO.id();
        this.nome = categoriaDTO.nome();
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
      
      @Override
      public String toString() {
        return "Categoria [id=" + id + ", nome=" + nome + "]";
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
        Categoria other = (Categoria) obj;
        if (id == null) {
          if (other.id != null)
            return false;
        } else if (!id.equals(other.id))
          return false;
        return true;
      }
}