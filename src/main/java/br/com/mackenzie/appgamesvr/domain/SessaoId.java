package br.com.mackenzie.appgamesvr.domain;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import org.hibernate.annotations.GenericGenerator;

@Embeddable
public class SessaoId implements Serializable {

  private static final long serialVersionUID = 2060838177872534830L;

  @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
  @GenericGenerator(name = "native", strategy = "native")
  @Column(name = "idSessao", columnDefinition = "INT")
  private int idSessao;

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

  @Column(name = "idGame", columnDefinition = "INT")
  private int idGame;

  @Column(name = "idPontuacao", columnDefinition = "INT")
  private int idPontuacao;

  public int getIdSessao() {
    return idSessao;
  }

  public void setIdSessao(int idSessao) {
    this.idSessao = idSessao;
  }

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

  public int getIdGame() {
    return idGame;
  }

  public void setIdGame(int idGame) {
    this.idGame = idGame;
  }

  public int getIdPontuacao() {
    return idPontuacao;
  }

  public void setIdPontuacao(int idPontuacao) {
    this.idPontuacao = idPontuacao;
  }
}
