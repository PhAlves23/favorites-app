package br.com.fiap.favoritesapp.model;

import java.io.Serializable;

import br.com.fiap.favoritesapp.dto.CategoriaDTO;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity(name = "Categoria")
@Table(name = "TB_CATEGORIA")
public class Categoria  implements Serializable {

      private static final long serialVersionUID = 1L;

      @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
      private Long id;
      private String nome;

      public Categoria() {
      }

      public Categoria(Long id, String nome) {
            this.id = id;
            this.nome = nome;
      }

      public Categoria(CategoriaDTO categoriaDTO){
            this.nome = categoriaDTO.getNome();
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

}