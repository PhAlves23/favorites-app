package br.com.fiap.favoritesapp.repository;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fiap.favoritesapp.model.Usuario;


public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    Optional<Usuario> findByEmail(String email);

    Page<Usuario> findByNomeContainingIgnoreCase(String nome, Pageable pageable);
    
}

// @Repository
// public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
     
//     Optional<Usuario> findByEmail(Object email);

//     @Query("SELECT u FROM Usuario u WHERE u.nome LIKE %:nome%")
//     Page<Usuario> findByNomeContainingIgnoreCase(String nome, Pageable pageable);

// }
