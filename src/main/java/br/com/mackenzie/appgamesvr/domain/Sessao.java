package br.com.mackenzie.appgamesvr.domain;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "sessao", schema = "appGamesVR")
public class Sessao implements Serializable {

  private static final long serialVersionUID = 3227016226357566564L;

  @EmbeddedId private SessaoId id;

  @Column(name = "isAtivo", columnDefinition = "BIT")
  private int isAtivo;

  @Temporal(TemporalType.TIMESTAMP)
  @Column(name = "dataCriacao", columnDefinition = "DATETIME")
  private Date dataCriacao;

  @Temporal(TemporalType.TIMESTAMP)
  @Column(name = "dataAlteracao", columnDefinition = "DATETIME")
  private Date dataAlteracao;

  @OneToOne(fetch = FetchType.LAZY)
  @JoinColumns({ //
    @JoinColumn(name = "idTerapia", insertable = false, updatable = false), //
    @JoinColumn(name = "idTerapeuta", insertable = false, updatable = false), //
    @JoinColumn(name = "idUsuario", insertable = false, updatable = false), //
    @JoinColumn(name = "idPessoaTerapeuta", insertable = false, updatable = false), //
    @JoinColumn(name = "idPaciente", insertable = false, updatable = false), //
    @JoinColumn(name = "idPessoaPaciente", insertable = false, updatable = false), //
    @JoinColumn(name = "idPatologia", insertable = false, updatable = false) //
  })
  private Terapia terapia;

  @OneToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "idGame", insertable = false, updatable = false)
  private Game game;

  @OneToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "idPontuacao", insertable = false, updatable = false)
  private Pontuacao pontuacao;

  public SessaoId getId() {
    return id;
  }

  public void setId(SessaoId id) {
    this.id = id;
  }

  public int getIsAtivo() {
    return isAtivo;
  }

  public void setIsAtivo(int isAtivo) {
    this.isAtivo = isAtivo;
  }

  public Date getDataCriacao() {
    return dataCriacao;
  }

  public void setDataCriacao(Date dataCriacao) {
    this.dataCriacao = dataCriacao;
  }

  public Date getDataAlteracao() {
    return dataAlteracao;
  }

  public void setDataAlteracao(Date dataAlteracao) {
    this.dataAlteracao = dataAlteracao;
  }

  public Terapia getTerapia() {
    return terapia;
  }

  public void setTerapia(Terapia terapia) {
    this.terapia = terapia;
  }

  public Game getGame() {
    return game;
  }

  public void setGame(Game game) {
    this.game = game;
  }

  public Pontuacao getPontuacao() {
    return pontuacao;
  }

  public void setPontuacao(Pontuacao pontuacao) {
    this.pontuacao = pontuacao;
  }
}
