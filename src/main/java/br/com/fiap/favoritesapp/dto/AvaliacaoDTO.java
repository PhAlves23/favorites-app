package br.com.fiap.favoritesapp.dto;

import java.time.LocalDate;

import br.com.fiap.favoritesapp.model.Avaliacao;

public record AvaliacaoDTO(  Long id, Long usuario_id, Long categoria_id, Integer nota, LocalDate data, String comentario) {
  public AvaliacaoDTO(Avaliacao avaliacao){
    this(avaliacao.getId(), avaliacao.getUsuario_id(), avaliacao.getCategoria_id(), avaliacao.getNota(), avaliacao.getData(), avaliacao.getComentario());
  }
}
