package br.com.mackenzie.appgamesvr.rest.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;

@JsonInclude(Include.NON_NULL)
public class ConfiguracaoJogoDTO implements Serializable {

  private static final long serialVersionUID = 1L;

  private int idConfiguracaoJogo;

  private int isModoImersivo;

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
