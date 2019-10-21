package br.com.mackenzie.appgamesvr.domain;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import org.hibernate.annotations.GenericGenerator;

@Embeddable
public class TerapiaId implements Serializable {

  private static final long serialVersionUID = -8050987732228948397L;

  @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
  @GenericGenerator(name = "native", strategy = "native")
  @Column(name = "idTerapia", columnDefinition = "INT")
  private int idTerapia;

  @Column(name = "idTerapeuta", columnDefinition = "INT")
  private int idTerapeuta;

  @Column(name = "idUsuario", columnDefinition = "INT")
  private int idUsuario;

  @Column(name = "idPessoaTerapeuta", columnDefinition = "INT")
  private int idPessoaTerapeuta;

  @Column(name = "idPaciente", columnDefinition = "INT")
  private int idPaciente;

  @Column(name = "idPessoaPaciente", columnDefinition = "INT")
  private int idPessoaPaciente;

  @Column(name = "idPatologia", columnDefinition = "INT")
  private int idPatologia;

  public int getIdTerapia() {
    return idTerapia;
  }

  public void setIdTerapia(int idTerapia) {
    this.idTerapia = idTerapia;
  }

  public int getIdTerapeuta() {
    return idTerapeuta;
  }

  public void setIdTerapeuta(int idTerapeuta) {
    this.idTerapeuta = idTerapeuta;
  }

  public int getIdUsuario() {
    return idUsuario;
  }

  public void setIdUsuario(int idUsuario) {
    this.idUsuario = idUsuario;
  }

  public int getIdPessoaTerapeuta() {
    return idPessoaTerapeuta;
  }

  public void setIdPessoaTerapeuta(int idPessoaTerapeuta) {
    this.idPessoaTerapeuta = idPessoaTerapeuta;
  }

  public int getIdPaciente() {
    return idPaciente;
  }

  public void setIdPaciente(int idPaciente) {
    this.idPaciente = idPaciente;
  }

  public int getIdPessoaPaciente() {
    return idPessoaPaciente;
  }

  public void setIdPessoaPaciente(int idPessoaPaciente) {
    this.idPessoaPaciente = idPessoaPaciente;
  }

  public int getIdPatologia() {
    return idPatologia;
  }

  public void setIdPatologia(int idPatologia) {
    this.idPatologia = idPatologia;
  }
}
