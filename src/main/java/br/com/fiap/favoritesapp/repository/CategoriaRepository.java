package br.com.fiap.favoritesapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.fiap.favoritesapp.model.Categoria;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Long>{
}
