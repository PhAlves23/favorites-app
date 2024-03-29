package br.com.fiap.favoritesapp.repository;

import br.com.fiap.favoritesapp.model.Estabelecimento;
import br.com.fiap.favoritesapp.model.Usuario;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface EstabelecimentoRepository extends JpaRepository<Estabelecimento, Long> {

    @Query("SELECT e FROM Estabelecimento e WHERE e.nome LIKE %:nome%")
    Page<Estabelecimento> findByNomeContainingIgnoreCase(String nome, Pageable pageable);

}
