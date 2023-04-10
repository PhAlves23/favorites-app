package br.com.fiap.favoritesapp.repository;

import br.com.fiap.favoritesapp.model.Estabelecimento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstabelecimentoRepository extends JpaRepository<Estabelecimento, Long> {
}
