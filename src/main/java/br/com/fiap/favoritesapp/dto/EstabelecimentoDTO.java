package br.com.fiap.favoritesapp.dto;

import br.com.fiap.favoritesapp.model.Estabelecimento;

import java.time.LocalDateTime;

public record EstabelecimentoDTO(Long id, String nome, String site, float nota, String logradouro, Byte imagem,
                                 String contato, String endereco, String descricao,
                                 LocalDateTime horarioFuncionamento) {

public EstabelecimentoDTO(Estabelecimento estabelecimento) {
    this(estabelecimento.getId(), estabelecimento.getNome(),
            estabelecimento.getSite(), estabelecimento.getNota(),
            estabelecimento.getLogradouro(), estabelecimento.getImagem(),
            estabelecimento.getContato(), estabelecimento.getEndereco(),
            estabelecimento.getDescricao(), estabelecimento.getHorarioFuncionamento());
}
}
