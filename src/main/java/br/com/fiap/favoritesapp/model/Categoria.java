package br.com.fiap.favoritesapp.model;

import java.io.Serializable;


import br.com.fiap.favoritesapp.dto.CategoriaDTO;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Entity(name = "Categoria")
@Table(name = "TB_CATEGORIA")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Categoria implements Serializable {

  private static final long serialVersionUID = 1L;
  
      @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
      private Long id;

      @NotNull
      private String nome;

      public Categoria(CategoriaDTO categoriaDTO){
        this.id = categoriaDTO.id();
        this.nome = categoriaDTO.nome();
      }

}