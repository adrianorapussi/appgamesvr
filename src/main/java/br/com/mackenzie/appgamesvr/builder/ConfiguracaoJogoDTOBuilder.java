package br.com.mackenzie.appgamesvr.builder;

import br.com.mackenzie.appgamesvr.domain.ConfiguracaoJogo;

public class ConfiguracaoJogoDTOBuilder {

  private ConfiguracaoJogo configuracaoJogo;

  public ConfiguracaoJogoDTOBuilder criar() {
    this.configuracaoJogo = new ConfiguracaoJogo();
    return this;
  }

  public ConfiguracaoJogoDTOBuilder idConfiguracaoJogo(Integer idConfiguracaoJogo) {
    this.configuracaoJogo.setIdConfiguracaoJogo(idConfiguracaoJogo);
    return this;
  }

  public ConfiguracaoJogoDTOBuilder isModoImersivo(Integer isModoImersivo) {
    this.configuracaoJogo.setIsModoImersivo(isModoImersivo);
    return this;
  }

  public ConfiguracaoJogoDTOBuilder observacao(String observacao) {
    this.configuracaoJogo.setObservacao(observacao);
    return this;
  }

  public ConfiguracaoJogo build() {
    return this.configuracaoJogo;
  }

}
