package br.com.fiap.favoritesapp.model;

import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.yaml.snakeyaml.events.Event.ID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import br.com.fiap.favoritesapp.dto.UsuarioDTO;

import jakarta.validation.constraints.NotNull;


@Entity(name = "Usuario")
@Table(name = "TB_USUARIO")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode

public class Usuario implements UserDetails {

    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private String senha;
    private Byte avatar;

    @NotNull
    private String telefone;

    @OneToMany(mappedBy = "usuario")
    private List<Avaliacao> avaliacoes;



    // @Email
    // private String email;

    // @NotNull
    // private String senha;
    
    @Override
    public String getPassword() {
        return senha;
    }

    @Override
    public String getUsername() {
        return email;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        throw new UnsupportedOperationException("Unimplemented method 'isEnabled'");
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return List.of(new SimpleGrantedAuthority("ROLE_USER"));
    }

    public Usuario(UsuarioDTO usuarioDTO){
        this.nome = usuarioDTO.nome();
        this.email = usuarioDTO.email();
        this.senha = usuarioDTO.senha();
        this.telefone = usuarioDTO.telefone();
        this.avatar = usuarioDTO.avatar();
    }

}