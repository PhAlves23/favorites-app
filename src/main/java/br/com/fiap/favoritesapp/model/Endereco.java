package br.com.fiap.favoritesapp.model;

public class Endereco {
  
  private String logradouro;
	private String bairro;
	private String cep;
	private String cidade;
	private String uf;
	private String numero;
	private String complemento;

  public Endereco() {
  }

  public Endereco(String logradouro, String bairro, String cep, String cidade, String uf, String numero,
      String complemento) {
    this.logradouro = logradouro;
    this.bairro = bairro;
    this.cep = cep;
    this.cidade = cidade;
    this.uf = uf;
    this.numero = numero;
    this.complemento = complemento;
  }

  public String getLogradouro() {
    return logradouro;
  }

  public void setLogradouro(String logradouro) {
    this.logradouro = logradouro;
  }

  public String getBairro() {
    return bairro;
  }

  public void setBairro(String bairro) {
    this.bairro = bairro;
  }

  public String getCep() {
    return cep;
  }

  public void setCep(String cep) {
    this.cep = cep;
  }

  public String getCidade() {
    return cidade;
  }

  public void setCidade(String cidade) {
    this.cidade = cidade;
  }

  public String getUf() {
    return uf;
  }

  public void setUf(String uf) {
    this.uf = uf;
  }

  public String getNumero() {
    return numero;
  }

  public void setNumero(String numero) {
    this.numero = numero;
  }

  public String getComplemento() {
    return complemento;
  }

  public void setComplemento(String complemento) {
    this.complemento = complemento;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((logradouro == null) ? 0 : logradouro.hashCode());
    result = prime * result + ((bairro == null) ? 0 : bairro.hashCode());
    result = prime * result + ((cep == null) ? 0 : cep.hashCode());
    result = prime * result + ((cidade == null) ? 0 : cidade.hashCode());
    result = prime * result + ((uf == null) ? 0 : uf.hashCode());
    result = prime * result + ((numero == null) ? 0 : numero.hashCode());
    result = prime * result + ((complemento == null) ? 0 : complemento.hashCode());
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
    Endereco other = (Endereco) obj;
    if (logradouro == null) {
      if (other.logradouro != null)
        return false;
    } else if (!logradouro.equals(other.logradouro))
      return false;
    if (bairro == null) {
      if (other.bairro != null)
        return false;
    } else if (!bairro.equals(other.bairro))
      return false;
    if (cep == null) {
      if (other.cep != null)
        return false;
    } else if (!cep.equals(other.cep))
      return false;
    if (cidade == null) {
      if (other.cidade != null)
        return false;
    } else if (!cidade.equals(other.cidade))
      return false;
    if (uf == null) {
      if (other.uf != null)
        return false;
    } else if (!uf.equals(other.uf))
      return false;
    if (numero == null) {
      if (other.numero != null)
        return false;
    } else if (!numero.equals(other.numero))
      return false;
    if (complemento == null) {
      if (other.complemento != null)
        return false;
    } else if (!complemento.equals(other.complemento))
      return false;
    return true;
  }


}
