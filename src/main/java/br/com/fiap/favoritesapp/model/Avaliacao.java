package br.com.fiap.favoritesapp.model;

import java.time.LocalDate;

import br.com.fiap.favoritesapp.dto.AvaliacaoDTO;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity(name = "Avaliacao")
@Table(name = "TB_AVALIACAO")
public class Avaliacao {

  @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @NotNull
  private Long usuario_id;

  @NotNull
  private Long categoria_id;

  @NotNull
  private Integer nota;

  @NotNull
  private LocalDate data;

  @NotBlank @Size(min = 5, max = 255)
  private String comentario;
  // private Estabelecimento estabelecimento;

  public Avaliacao() {
  } 

  public Avaliacao(Long id, Long usuario_id, Long categoria_id, Integer nota, LocalDate data, String comentario) {
    this.id = id;
    this.usuario_id = usuario_id;
    this.categoria_id = categoria_id;
    this.nota = nota;
    this.data = data;
    this.comentario = comentario;
  }

  public Avaliacao(AvaliacaoDTO avaliacaoDTO){
    this.id = avaliacaoDTO.id();
    this.usuario_id = avaliacaoDTO.usuario_id();
    this.categoria_id = avaliacaoDTO.categoria_id();
    this.nota = avaliacaoDTO.nota();
    this.data = avaliacaoDTO.data();
    this.comentario = avaliacaoDTO.comentario();
  }

  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }
  public Long getUsuario_id() {
    return usuario_id;
  }
  public void setUsuario_id(Long usuario_id) {
    this.usuario_id = usuario_id;
  }
  public Long getCategoria_id() {
    return categoria_id;
  }
  public void setCategoria_id(Long categoria_id) {
    this.categoria_id = categoria_id;
  }
  public Integer getNota() {
    return nota;
  }
  public void setNota(Integer nota) {
    this.nota = nota;
  }
  public LocalDate getData() {
    return data;
  }
  public void setData(LocalDate data) {
    this.data = data;
  }
  public String getComentario() {
    return comentario;
  }
  public void setComentario(String comentario) {
    this.comentario = comentario;
  }

  @Override
  public String toString() {
    return "Avaliacao [id=" + id + ", usuario_id=" + usuario_id + ", categoria_id=" + categoria_id + ", nota=" + nota
        + ", data=" + data + ", comentario=" + comentario + "]";
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((id == null) ? 0 : id.hashCode());
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Avaliacao other = (Avaliacao) obj;
    if (id == null) {
      if (other.id != null)
        return false;
    } else if (!id.equals(other.id))
      return false;
    return true;
  }
}
