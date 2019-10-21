package br.com.mackenzie.appgamesvr.rest.dto;

import br.com.mackenzie.appgamesvr.domain.ConfiguracaoJogo;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.hibernate.annotations.GenericGenerator;

@JsonInclude(Include.NON_NULL)
public class GameDTO implements Serializable {

  private static final long serialVersionUID = 1L;

  private int idGame;

  private String nome;

  private Date dataCriacao;

  private Date dataAlteracao;

  private ConfiguracaoJogo configuracaoJogo;

  public int getIdGame() {
    return idGame;
  }

  public void setIdGame(int idGame) {
    this.idGame = idGame;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
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

  public ConfiguracaoJogo getConfiguracaoJogo() {
    return configuracaoJogo;
  }

  public void setConfiguracaoJogo(ConfiguracaoJogo configuracaoJogo) {
    this.configuracaoJogo = configuracaoJogo;
  }
}
