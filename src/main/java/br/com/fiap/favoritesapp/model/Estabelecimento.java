package br.com.fiap.favoritesapp.model;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity(name = "Estabelecimento")
@Table(name = "TB_ESTABELECIMENTO")
public class Estabelecimento {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private float nota;
    private String nome;
    private String site;
    private String local;
    private Byte imagem;
    private String contato;
    private String endereco;
    private String descricao;
    private LocalDateTime horarioFuncionamento;

    // private Categoria categoria;

    public Estabelecimento() {
    }

    private Estabelecimento(Long id, String nome, String site, float nota, String local, Byte imagem,
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

    public static EstabelecimentoBuilder builder() {
      return new EstabelecimentoBuilder();
    }

    public static final class EstabelecimentoBuilder{

      private Long id;
      private float nota;
      private String nome;
      private String site;
      private String local;
      private Byte imagem;
      private String contato;
      private String endereco;
      private String descricao;
      private LocalDateTime horarioFuncionamento;
  
      private EstabelecimentoBuilder() {

      }

      public EstabelecimentoBuilder id(Long id) {
        this.id = id;
        return this;
      }

      public EstabelecimentoBuilder nota(float nota) {
        this.nota = nota;
        return this;
      }

      public EstabelecimentoBuilder nome(String nome) {
        this.nome = nome;
        return this;
      }

      public EstabelecimentoBuilder site(String site) {
        this.site = site;
        return this;
      }

      public EstabelecimentoBuilder local(String local) {
        this.local = local;
        return this;
      }

      public EstabelecimentoBuilder imagem(Byte imagem) {
        this.imagem = imagem;
        return this;
      }

      public EstabelecimentoBuilder contato(String contato) {
        this.contato = contato;
        return this;
      }

      public EstabelecimentoBuilder endereco(String endereco) {
        this.endereco = endereco;
        return this;
      }

      public EstabelecimentoBuilder descricao(String descricao) {
        this.descricao = descricao;
        return this;
      }

      public EstabelecimentoBuilder horarioFuncionamento(LocalDateTime horarioFuncionamento) {
        this.horarioFuncionamento = horarioFuncionamento;
        return this;
      }

      public Estabelecimento build() {
        return new Estabelecimento(id, nome, site, nota, local, imagem, contato, endereco, descricao, horarioFuncionamento);
      }
    } 

    public Long getId() {
      return id;
    }

    public String getNome() {
      return nome;
    }

    public String getSite() {
      return site;
    }

    public float getNota() {
      return nota;
    }

    public String getLocal() {
      return local;
    }

    public Byte getImagem() {
      return imagem;
    }
    public String getContato() {
      return contato;
    }

    public String getEndereco() {
      return endereco;
    }

    public String getDescricao() {
      return descricao;
    }

    public LocalDateTime getHorarioFuncionamento() {
      return horarioFuncionamento;
    }

    @Override
    public String toString() {
      return "Estabelecimento [id=" + id + ", nome=" + nome + ", site=" + site + ", nota=" + nota + ", local=" + local
          + ", imagem=" + imagem + ", contato=" + contato + ", endereco=" + endereco + ", descricao=" + descricao
          + ", horarioFuncionamento=" + horarioFuncionamento + "]";
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
      Estabelecimento other = (Estabelecimento) obj;
      if (id == null) {
        if (other.id != null)
          return false;
      } else if (!id.equals(other.id))
        return false;
      return true;
    }

}