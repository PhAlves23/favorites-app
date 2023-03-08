package br.com.fiap.favoritesapp.dto;

import br.com.fiap.favoritesapp.model.Categoria;

public class CategoriaDTO {

    private Long id;
    private String nome;

    public CategoriaDTO(){

    }

    public CategoriaDTO(Long id, String nome) {
        this.id = id;
        this.nome = nome;
    }


    public CategoriaDTO(Categoria categoria){
        this.id = categoria.getId();
        this.nome = categoria.getNome();
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }
}
