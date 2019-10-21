package br.com.mackenzie.appgamesvr.domain;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "terapeuta", schema = "appGamesVR")
public class Terapeuta implements Serializable {

  private static final long serialVersionUID = 9189281434624180288L;

  @EmbeddedId private TerapeutaId id;

  @Column(name = "nome", columnDefinition = "VARCHAR(100)")
  private String nome;

  @OneToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "idUsuario", insertable = false, updatable = false)
  private Usuario usuario;

  @OneToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "idPessoa", insertable = false, updatable = false)
  private Pessoa pessoa;

  public TerapeutaId getId() {
    return id;
  }

  public void setId(TerapeutaId id) {
    this.id = id;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public Pessoa getPessoa() {
    return pessoa;
  }

  public void setPessoa(Pessoa pessoa) {
    this.pessoa = pessoa;
  }

  public Usuario getUsuario() {
    return usuario;
  }

  public void setUsuario(Usuario usuario) {
    this.usuario = usuario;
  }
}
