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
import lombok.*;

@Entity(name = "Avaliacao")
@Table(name = "TB_AVALIACAO")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
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

  public Avaliacao(AvaliacaoDTO avaliacaoDTO){
    this.id = avaliacaoDTO.id();
    this.usuario_id = avaliacaoDTO.usuario_id();
    this.categoria_id = avaliacaoDTO.categoria_id();
    this.nota = avaliacaoDTO.nota();
    this.data = avaliacaoDTO.data();
    this.comentario = avaliacaoDTO.comentario();
  }

}
