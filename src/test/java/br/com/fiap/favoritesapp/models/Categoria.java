package br.com.fiap.favoritesapp.models;

public class Categoria {

      private Integer id;
      private String nome;
      private String descricao;

      public Categoria() {
      }

      public Categoria(Integer id, String nome, String descricao) {
            this.id = id;
            this.nome = nome;
            this.descricao = descricao;
      }

      public Integer getId() {
        return id;
      }

      public void setId(Integer id) {
        this.id = id;
      }

      public String getNome() {
        return nome;
      }

      public void setNome(String nome) {
        this.nome = nome;
      }

      public String getDescricao() {
        return descricao;
      }

      public void setDescricao(String descricao) {
        this.descricao = descricao;
      }

      @Override
      public String toString() {
        return "Categoria [id=" + id + ", nome=" + nome + ", descricao=" + descricao + "]";
      }

}