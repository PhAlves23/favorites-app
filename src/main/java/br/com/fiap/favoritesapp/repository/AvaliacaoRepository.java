package br.com.fiap.favoritesapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fiap.favoritesapp.model.Avaliacao;

import java.util.List;

public interface AvaliacaoRepository extends JpaRepository<Avaliacao, Long>{

//    List<Avaliacao> findByUsuarioId(Long userId);
}
