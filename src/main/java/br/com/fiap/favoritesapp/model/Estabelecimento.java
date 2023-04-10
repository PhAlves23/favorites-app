package br.com.fiap.favoritesapp.model;

import java.time.LocalDateTime;

import br.com.fiap.favoritesapp.dto.EstabelecimentoDTO;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
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
    private float nota;
    private String nome;
    private String site;
    private String logradouro;
    private Byte imagem;
    private String contato;
    private String endereco;
    private String descricao;
    private LocalDateTime horarioFuncionamento;

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