package br.com.fiap.favoritesapp.model;

import java.io.Serializable;
import java.util.List;

import br.com.fiap.favoritesapp.dto.AvaliacaoDTO;
import br.com.fiap.favoritesapp.dto.EstabelecimentoDTO;
import br.com.fiap.favoritesapp.dto.UsuarioDTO;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Entity(name = "Usuario")
@Table(name = "TB_USUARIO")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Usuario {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    private String nome;
    @Email
    private String email;

    @NotNull
    private String senha;

    private Byte avatar;

    @NotNull
    private String telefone;

    @OneToMany(mappedBy = "usuario")
    private List<Avaliacao> avaliacoes;

    public Usuario(UsuarioDTO usuarioDTO){
      this.nome = usuarioDTO.nome();
      this.email = usuarioDTO.email();
      this.senha = usuarioDTO.senha();
      this.telefone = usuarioDTO.telefone();
      this.avatar = usuarioDTO.avatar();
    }

}