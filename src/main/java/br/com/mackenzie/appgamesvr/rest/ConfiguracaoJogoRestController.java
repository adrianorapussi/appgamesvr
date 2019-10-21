package br.com.mackenzie.appgamesvr.rest;

import br.com.mackenzie.appgamesvr.domain.ConfiguracaoJogo;
import br.com.mackenzie.appgamesvr.domain.Game;
import br.com.mackenzie.appgamesvr.rest.dto.ConfiguracaoJogoDTO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import java.util.List;
import org.springframework.http.MediaType;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/config-jogo")
@Api(value = "configuracaojogorestcontroller", description = "Operações executadas sobre as configurações de jogo")
public class ConfiguracaoJogoRestController extends  AbstractRestController{

  @GetMapping(value = "/", produces = MediaType.APPLICATION_JSON_VALUE)
  @ApiOperation(value = "Retona as configurações do jogo", response = List.class)
  public List<ConfiguracaoJogoDTO> buscarTodosGames() {
    logger.info("Buscando todos os games");
    return gameService.buscarTodosGames();
  }

  @PutMapping(
      value = "/",
      produces = MediaType.APPLICATION_JSON_VALUE,
      consumes = MediaType.APPLICATION_JSON_VALUE)
  @ApiOperation(
      value = "Atualiza o jogo com o id especificado e demais dados",
      response = ConfiguracaoJogoDTO.class)
  public ConfiguracaoJogoDTO atualizarJogoPorId(@Validated @RequestBody ConfiguracaoJogoDTO configuracaoJogoDTO) {
    logger.info("Atualizando game de id: "+jogoNovo.getIdGame());
    return gameService.atualizarJogoPorId(jogoNovo);
  }

  @DeleteMapping(value = "/{idGame}")
  @ApiOperation(value = "Removi o jogo pelo id especificado")
  public void removerJogoPorId(@Validated @PathVariable("idGame") Integer idGame) {
    logger.info("Removendo game de id: "+idGame);
    gameService.removerJogoPorId(idGame);
  }

  @PostMapping(
      value = "/",
      consumes = MediaType.APPLICATION_JSON_VALUE,
      produces = MediaType.APPLICATION_JSON_VALUE)
  @ApiOperation(value = "Cria um jogo com os dados especificados")
  public ConfiguracaoJogoDTO criarGame(@Validated @RequestBody ConfiguracaoJogoDTO configuracaoJogoDTO) {
    logger.info("Criar game novo");
    return gameService.criarGame(gameNovo);
  }

}
