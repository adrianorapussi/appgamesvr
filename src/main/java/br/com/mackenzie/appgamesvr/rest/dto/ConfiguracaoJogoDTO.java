package br.com.mackenzie.appgamesvr.rest.dto;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import br.com.mackenzie.appgamesvr.domain.ConfiguracaoJogo;

@JsonInclude(Include.NON_NULL)
public class ConfiguracaoJogoDTO implements Serializable {

  private static final long serialVersionUID = 1L;

  private int idConfiguracaoJogo;

  private int isModoImersivo;

  private String observacao;

  public ConfiguracaoJogoDTO(ConfiguracaoJogo input) {
    this.idConfiguracaoJogo = input.getIdConfiguracaoJogo();
    this.isModoImersivo = input.getIsModoImersivo();
    this.observacao = input.getObservacao();
  }

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
