package br.com.mackenzie.appgamesvr.domain;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "configuracaoJogo", schema = "appGamesVR")
public class ConfiguracaoJogo implements Serializable {

  private static final long serialVersionUID = -936196861870606987L;

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
  @GenericGenerator(name = "native", strategy = "native")
  @Column(name = "idConfiguracaoJogo", columnDefinition = "INT")
  private int idConfiguracaoJogo;

  @Column(name = "isModoImersivo", columnDefinition = "BIT")
  private int isModoImersivo;

  @Column(name = "observacao", columnDefinition = "VARCHAR(255)")
  private String observacao;

  public int getIdConfiguracaoJogo() {
    return idConfiguracaoJogo;
  }

  public void setIdConfiguracaoJogo(int idConfiguracaoJogo) {
    this.idConfiguracaoJogo = idConfiguracaoJogo;
  }

  public int getIsModoImersivo() {
    return isModoImersivo;
  }

  public void setIsModoImersivo(int isModoImersivo) {
    this.isModoImersivo = isModoImersivo;
  }

  public String getObservacao() {
    return observacao;
  }

  public void setObservacao(String observacao) {
    this.observacao = observacao;
  }

}
