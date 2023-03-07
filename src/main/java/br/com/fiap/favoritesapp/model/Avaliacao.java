package br.com.fiap.favoritesapp.model;

public class Avaliacao {

  private Integer id;
  private Integer nota;
  private String criadoEm;
  private String comentario;
  private Integer donoId;

  // private Estabelecimento estabelecimento; 

  public Avaliacao() {
  }

  public Avaliacao(Integer id, Integer nota, String comentario, String criadoEm, Integer donoId) {
    this.id = id;
    this.nota = nota;
    this.comentario = comentario;
    this.criadoEm = criadoEm;
    this.donoId = donoId;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
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

  public Integer getDonoId() {
    return donoId;
  }

  public void setDonoId(Integer donoId) {
    this.donoId = donoId;
  }

  @Override
  public String toString() {
    return "Avaliacao [id=" + id + ", nota=" + nota + ", comentario=" + comentario + ", criadoEm=" + criadoEm
        + ", donoId=" + donoId + "]";
  }

}
