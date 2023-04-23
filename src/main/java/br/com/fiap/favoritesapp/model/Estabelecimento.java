package br.com.fiap.favoritesapp.model;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import br.com.fiap.favoritesapp.dto.EstabelecimentoDTO;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;

@Entity(name = "Estabelecimento")
@Table(name = "TB_ESTABELECIMENTO")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Estabelecimento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private float nota;

    @NotNull
    private String nome;

    @NotNull
    private String site;

    @NotNull
    private String logradouro;

    private Byte imagem;

    @NotNull
    private String contato;

    @NotNull
    private String endereco;

    @NotBlank
    private String descricao;

    @NotNull
    private LocalDateTime horarioFuncionamento;

    @OneToMany(mappedBy = "estabelecimento")
    private List<Avaliacao> avaliacoes;

    @ManyToMany
    @JoinTable(
            name = "TB_ESTABELECIMENTO_CATEGORIA",
            joinColumns = @JoinColumn(name = "estabelecimento_id"),
            inverseJoinColumns = @JoinColumn(name = "categoria_id"))
    private Set<Categoria> categorias = new HashSet<>();


    public Estabelecimento(EstabelecimentoDTO estabelecimentoDTO) {
        this.id = estabelecimentoDTO.id();
        this.nota = estabelecimentoDTO.nota();
        this.nome = estabelecimentoDTO.nome();
        this.site = estabelecimentoDTO.site();
        this.logradouro = estabelecimentoDTO.logradouro();
        this.imagem = estabelecimentoDTO.imagem();
        this.contato = estabelecimentoDTO.contato();
        this.endereco = estabelecimentoDTO.endereco();
        this.descricao = estabelecimentoDTO.descricao();
        this.horarioFuncionamento = estabelecimentoDTO.horarioFuncionamento();
    }

    // private Categoria categoria;

}