package br.com.fiap.favoritesapp.model;

import java.time.LocalDate;

import br.com.fiap.favoritesapp.dto.AvaliacaoDTO;
import jakarta.persistence.*;
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

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private Long usuarioId;

    @NotNull
    private Long categoriaId;

    @NotNull
    private Integer nota;

    @NotNull
    private LocalDate data;

    @NotBlank
    @Size(min = 5, max = 255)
    private String comentario;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "estabelecimento_id")
    private Estabelecimento estabelecimento;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "usuarioId", referencedColumnName = "id", insertable = false, updatable = false)
    private Usuario usuario;


    public Avaliacao(AvaliacaoDTO avaliacaoDTO) {
        this.id = avaliacaoDTO.id();
        this.usuarioId = avaliacaoDTO.usuarioId();
        this.categoriaId = avaliacaoDTO.categoriaId();
        this.nota = avaliacaoDTO.nota();
        this.data = avaliacaoDTO.data();
        this.comentario = avaliacaoDTO.comentario();
    }

}
