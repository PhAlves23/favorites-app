package br.com.fiap.favoritesapp.dto;

import java.time.LocalDate;

import br.com.fiap.favoritesapp.model.Avaliacao;

public record AvaliacaoDTO(Long id, Long usuarioId, Long categoriaId, Integer nota, LocalDate data, String comentario) {
  public AvaliacaoDTO(Avaliacao avaliacao){
    this(avaliacao.getId(), avaliacao.getUsuarioId(), avaliacao.getCategoriaId(), avaliacao.getNota(), avaliacao.getData(), avaliacao.getComentario());
  }
}
