package br.com.fiap.favoritesapp.models;

import java.time.LocalDateTime;

public class Estabelecimento {

    private Integer id;
    private float nota;
    private String nome;
    private String site;
    private String local;
    private String imagem;
    private String contato;
    private String endereco;
    private String descricao;
    private LocalDateTime horarioFuncionamento;

    // private Categoria categoria;

    public Estabelecimento() {
    }

    public Estabelecimento(Integer id, String nome, String site, float nota, String local, String imagem,
        String contato, String endereco, String descricao, LocalDateTime horarioFuncionamento) {
      this.id = id;
      this.nome = nome;
      this.site = site;
      this.nota = nota;
      this.local = local;
      this.imagem = imagem;
      this.contato = contato;
      this.endereco = endereco;
      this.descricao = descricao;
      this.horarioFuncionamento = horarioFuncionamento;
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

    public String getSite() {
      return site;
    }

    public void setSite(String site) {
      this.site = site;
    }

    public float getNota() {
      return nota;
    }

    public void setNota(float nota) {
      this.nota = nota;
    }

    public String getLocal() {
      return local;
    }

    public void setLocal(String local) {
      this.local = local;
    }

    public String getImagem() {
      return imagem;
    }

    public void setImagem(String imagem) {
      this.imagem = imagem;
    }

    public String getContato() {
      return contato;
    }

    public void setContato(String contato) {
      this.contato = contato;
    }

    public String getEndereco() {
      return endereco;
    }

    public void setEndereco(String endereco) {
      this.endereco = endereco;
    }

    public String getDescricao() {
      return descricao;
    }

    public void setDescricao(String descricao) {
      this.descricao = descricao;
    }

    public LocalDateTime getHorarioFuncionamento() {
      return horarioFuncionamento;
    }

    public void setHorarioFuncionamento(LocalDateTime horarioFuncionamento) {
      this.horarioFuncionamento = horarioFuncionamento;
    }

    @Override
    public String toString() {
      return "Estabelecimento [id=" + id + ", nome=" + nome + ", site=" + site + ", nota=" + nota + ", local=" + local
          + ", imagem=" + imagem + ", contato=" + contato + ", endereco=" + endereco + ", descricao=" + descricao
          + ", horarioFuncionamento=" + horarioFuncionamento + "]";
    }

}