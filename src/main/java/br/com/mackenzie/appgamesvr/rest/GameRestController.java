package br.com.mackenzie.appgamesvr.rest;

import br.com.mackenzie.appgamesvr.domain.Game;
import br.com.mackenzie.appgamesvr.service.GameService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
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
@RequestMapping("/game")
@Api(value = "gamerestcontroller", description = "Operações executadas sobre games")
public class GameRestController extends AbstractRestController{

  private final GameService gameService;

  @Autowired
  public GameRestController(GameService gameService) {
    this.gameService = gameService;
  }

  @GetMapping(value = "/", produces = MediaType.APPLICATION_JSON_VALUE)
  @ApiOperation(value = "Retorna os jogos disponíveis", response = List.class)
  public List<Game> buscarTodosGames() {
    logger.info("Buscando todos os games");
    return gameService.buscarTodosGames();
  }

  @PutMapping(
      value = "/",
      produces = MediaType.APPLICATION_JSON_VALUE,
      consumes = MediaType.APPLICATION_JSON_VALUE)
  @ApiOperation(
      value = "Atualiza o jogo com o id especificado e demais dados",
      response = Game.class)
  public Game atualizarJogoPorId(@Validated @RequestBody Game jogoNovo) {
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
  public Game criarGame(@Validated @RequestBody Game gameNovo) {
    logger.info("Criar game novo");
    return gameService.criarGame(gameNovo);
  }
}
