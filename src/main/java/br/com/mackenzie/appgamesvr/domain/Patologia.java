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
@Table(name = "patologia", schema = "appGamesVR")
public class Patologia implements Serializable {

  private static final long serialVersionUID = -2798635450944619929L;

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
  @GenericGenerator(name = "native", strategy = "native")
  @Column(name = "idPatologia", columnDefinition = "INT")
  private int idPatologia;

  @Column(name = "descricao", columnDefinition = "VARCHAR(100)")
  private String descricao;

  @Column(name = "gmfcs", columnDefinition = "VARCHAR(100)")
  private String gmfcs;

  @Temporal(TemporalType.TIMESTAMP)
  @Column(name = "dataCriacao", columnDefinition = "DATETIME")
  private Date dataCriacao;

  @Temporal(TemporalType.TIMESTAMP)
  @Column(name = "dataAlteracao", columnDefinition = "DATETIME")
  private Date dataAlteracao;

  public String getDescricao() {
    return descricao;
  }

  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  public String getGmfcs() {
    return gmfcs;
  }

  public void setGmfcs(String gmfcs) {
    this.gmfcs = gmfcs;
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
}
