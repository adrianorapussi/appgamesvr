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
@Table(name = "pessoa", schema = "appGamesVR")
public class Pessoa implements Serializable {

  private static final long serialVersionUID = -7605282959802959123L;

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
  @GenericGenerator(name = "native", strategy = "native")
  @Column(name = "idPessoa", columnDefinition = "INT")
  private int idPessoa;

  @Column(name = "nome", columnDefinition = "VARCHAR(100)")
  private String nome;

  @Column(name = "idade", columnDefinition = "INT")
  private String idade;

  @Column(name = "sexo", columnDefinition = "VARCHAR(100)")
  private String sexo;

  @Column(name = "maoDominante", columnDefinition = "VARCHAR(100)")
  private String maoDominante;

  @Temporal(TemporalType.TIMESTAMP)
  @Column(name = "dataCriacao", columnDefinition = "DATETIME")
  private Date dataCriacao;

  @Temporal(TemporalType.TIMESTAMP)
  @Column(name = "dataAlteracao", columnDefinition = "DATETIME")
  private Date dataAlteracao;

  public int getIdPessoa() {
    return idPessoa;
  }

  public void setIdPessoa(int idPessoa) {
    this.idPessoa = idPessoa;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getIdade() {
    return idade;
  }

  public void setIdade(String idade) {
    this.idade = idade;
  }

  public String getSexo() {
    return sexo;
  }

  public void setSexo(String sexo) {
    this.sexo = sexo;
  }

  public String getMaoDominante() {
    return maoDominante;
  }

  public void setMaoDominante(String maoDominante) {
    this.maoDominante = maoDominante;
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
