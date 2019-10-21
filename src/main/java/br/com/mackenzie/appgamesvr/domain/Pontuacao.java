package br.com.mackenzie.appgamesvr.domain;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "pontuacao", schema = "appGamesVR")
public class Pontuacao implements Serializable {

  private static final long serialVersionUID = 4473863329247093309L;

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
  @GenericGenerator(name = "native", strategy = "native")
  @Column(name = "idPontuacao", columnDefinition = "INT")
  private int idPontuacao;

  @Column(name = "acertos", columnDefinition = "INT")
  private String acertos;

  @Column(name = "erros", columnDefinition = "INT")
  private String erros;

  @Temporal(TemporalType.TIMESTAMP)
  @Column(name = "dataCriacao", columnDefinition = "DATETIME")
  private Date dataCriacao;

  public int getIdPontuacao() {
    return idPontuacao;
  }

  public void setIdPontuacao(int idPontuacao) {
    this.idPontuacao = idPontuacao;
  }

  public String getAcertos() {
    return acertos;
  }

  public void setAcertos(String acertos) {
    this.acertos = acertos;
  }

  public String getErros() {
    return erros;
  }

  public void setErros(String erros) {
    this.erros = erros;
  }

  public Date getDataCriacao() {
    return dataCriacao;
  }

  public void setDataCriacao(Date dataCriacao) {
    this.dataCriacao = dataCriacao;
  }
}
