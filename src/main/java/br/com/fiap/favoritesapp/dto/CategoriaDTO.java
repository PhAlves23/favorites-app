package br.com.fiap.favoritesapp.dto;

import br.com.fiap.favoritesapp.model.Categoria;

public record CategoriaDTO(Long id, String nome) {
  public CategoriaDTO(Categoria categoria){
    this(categoria.getId(), categoria.getNome());
  }
}
