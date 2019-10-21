package br.com.mackenzie.appgamesvr.domain;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import org.hibernate.annotations.GenericGenerator;

@Embeddable
public class PacienteId implements Serializable {

  private static final long serialVersionUID = 7906074709136569870L;

  @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
  @GenericGenerator(name = "native", strategy = "native")
  @Column(name = "idPaciente", columnDefinition = "INT")
  private int idPaciente;

  @Column(name = "idPessoa", columnDefinition = "INT")
  private int idPessoa;

  @Column(name = "idPatologia", columnDefinition = "INT")
  private int idPatologia;

  public int getIdPaciente() {
    return idPaciente;
  }

  public void setIdPaciente(int idPaciente) {
    this.idPaciente = idPaciente;
  }

  public int getIdPessoa() {
    return idPessoa;
  }

  public void setIdPessoa(int idPessoa) {
    this.idPessoa = idPessoa;
  }

  public int getIdPatologia() {
    return idPatologia;
  }

  public void setIdPatologia(int idPatologia) {
    this.idPatologia = idPatologia;
  }
}
