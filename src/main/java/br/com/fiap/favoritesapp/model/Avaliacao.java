package br.com.fiap.favoritesapp.model;

public class Avaliacao {

  private Long id;
  private Integer nota;
  private String criadoEm;
  private String comentario;
  private Long donoId;

  // private Estabelecimento estabelecimento; 

  public Avaliacao() {
  }

  public Avaliacao(Long id, Integer nota, String comentario, String criadoEm, Long donoId) {
    this.id = id;
    this.nota = nota;
    this.comentario = comentario;
    this.criadoEm = criadoEm;
    this.donoId = donoId;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Integer getNota() {
    return nota;
  }

  public void setNota(Integer nota) {
    this.nota = nota;
  }

  public String getComentario() {
    return comentario;
  }

  public void setComentario(String comentario) {
    this.comentario = comentario;
  }

  public String getCriadoEm() {
    return criadoEm;
  }

  public void setCriadoEm(String criadoEm) {
    this.criadoEm = criadoEm;
  }

  public Long getDonoId() {
    return donoId;
  }

  public void setDonoId(Long donoId) {
    this.donoId = donoId;
  }

  @Override
  public String toString() {
    return "Avaliacao [id=" + id + ", nota=" + nota + ", comentario=" + comentario + ", criadoEm=" + criadoEm
        + ", donoId=" + donoId + "]";
  }

}
