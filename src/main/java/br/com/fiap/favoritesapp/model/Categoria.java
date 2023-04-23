package br.com.fiap.favoritesapp.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;


import br.com.fiap.favoritesapp.dto.CategoriaDTO;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Entity(name = "Categoria")
@Table(name = "TB_CATEGORIA")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Categoria {
      @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
      private Long id;

      @NotNull
      private String nome;

    @ManyToMany(mappedBy = "categorias")
    private Set<Estabelecimento> estabelecimentos = new HashSet<>();


    public Categoria(CategoriaDTO categoriaDTO){
        this.id = categoriaDTO.id();
        this.nome = categoriaDTO.nome();
      }

}