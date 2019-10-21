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
@Table(name = "paciente", schema = "appGamesVR")
public class Paciente implements Serializable {

  private static final long serialVersionUID = -6141535953039976754L;

  @EmbeddedId private PacienteId id;

  @Column(name = "objetivo", columnDefinition = "VARCHAR(100)")
  private String objetivo;

  @OneToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "idPessoa", insertable = false, updatable = false)
  private Pessoa pessoa;

  @OneToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "idPatologia", insertable = false, updatable = false)
  private Patologia patologia;

  public PacienteId getId() {
    return id;
  }

  public void setId(PacienteId id) {
    this.id = id;
  }

  public String getObjetivo() {
    return objetivo;
  }

  public void setObjetivo(String objetivo) {
    this.objetivo = objetivo;
  }

  public Pessoa getPessoa() {
    return pessoa;
  }

  public void setPessoa(Pessoa pessoa) {
    this.pessoa = pessoa;
  }

  public Patologia getPatologia() {
    return patologia;
  }

  public void setPatologia(Patologia patologia) {
    this.patologia = patologia;
  }
}
