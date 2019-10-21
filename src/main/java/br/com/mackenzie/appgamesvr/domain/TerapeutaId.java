package br.com.mackenzie.appgamesvr.domain;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import org.hibernate.annotations.GenericGenerator;

@Embeddable
public class TerapeutaId implements Serializable {

  private static final long serialVersionUID = -7094013294459920585L;

  @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
  @GenericGenerator(name = "native", strategy = "native")
  @Column(name = "idTerapeuta", columnDefinition = "INT")
  private int idTerapeuta;

  @Column(name = "idUsuario", columnDefinition = "INT")
  private int idUsuario;

  @Column(name = "idPessoa", columnDefinition = "INT")
  private int idPessoa;

  public int getIdTerapeuta() {
    return idTerapeuta;
  }

  public void setIdTerapeuta(int idTerapeuta) {
    this.idTerapeuta = idTerapeuta;
  }

  public int getIdPessoa() {
    return idPessoa;
  }

  public void setIdPessoa(int idPessoa) {
    this.idPessoa = idPessoa;
  }

  public int getIdUsuario() {
    return idUsuario;
  }

  public void setIdUsuario(int idUsuario) {
    this.idUsuario = idUsuario;
  }
}
