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
@Table(name = "terapia", schema = "appGamesVR")
public class Terapia implements Serializable {

  private static final long serialVersionUID = -736478313228029006L;

  @EmbeddedId private TerapiaId id;

  @Temporal(TemporalType.TIMESTAMP)
  @Column(name = "dataCriacao", columnDefinition = "DATETIME")
  private Date dataCriacao;

  @Temporal(TemporalType.TIMESTAMP)
  @Column(name = "dataAlteracao", columnDefinition = "DATETIME")
  private Date dataAlteracao;

  @OneToOne(fetch = FetchType.LAZY)
  @JoinColumns({ //
    @JoinColumn(
        name = "idTerapeuta",
        referencedColumnName = "idTerapeuta",
        insertable = false,
        updatable = false), //
    @JoinColumn(
        name = "idUsuario",
        referencedColumnName = "idUsuario",
        insertable = false,
        updatable = false), //
    @JoinColumn(
        name = "idPessoaTerapeuta",
        referencedColumnName = "idPessoa",
        insertable = false,
        updatable = false) //
  })
  private Terapeuta terapeuta;

  @OneToOne(fetch = FetchType.LAZY)
  @JoinColumns({ //
    @JoinColumn(
        name = "idPaciente",
        referencedColumnName = "idPaciente",
        insertable = false,
        updatable = false), //
    @JoinColumn(
        name = "idPessoaPaciente",
        referencedColumnName = "idPessoa",
        insertable = false,
        updatable = false), //
    @JoinColumn(
        name = "idPatologia",
        referencedColumnName = "idPatologia",
        insertable = false,
        updatable = false) //
  })
  private Paciente paciente;

  public TerapiaId getId() {
    return id;
  }

  public void setId(TerapiaId id) {
    this.id = id;
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

  public Terapeuta getTerapeuta() {
    return terapeuta;
  }

  public void setTerapeuta(Terapeuta terapeuta) {
    this.terapeuta = terapeuta;
  }

  public Paciente getPaciente() {
    return paciente;
  }

  public void setPaciente(Paciente paciente) {
    this.paciente = paciente;
  }
}
