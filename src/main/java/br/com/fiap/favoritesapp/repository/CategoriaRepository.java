package br.com.fiap.favoritesapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import br.com.fiap.favoritesapp.model.Categoria;


public interface CategoriaRepository extends JpaRepository<Categoria, Long>{
}
