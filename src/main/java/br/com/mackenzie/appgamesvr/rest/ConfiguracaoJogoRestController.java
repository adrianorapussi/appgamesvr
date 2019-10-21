package br.com.mackenzie.appgamesvr.rest;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import br.com.mackenzie.appgamesvr.rest.dto.ConfiguracaoJogoDTO;
import br.com.mackenzie.appgamesvr.service.ConfiguracaoJogoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/config-jogo")
@Api(value = "configuracaojogorestcontroller",
    description = "Operações executadas sobre as configurações de jogo")
public class ConfiguracaoJogoRestController extends AbstractRestController {

  @Autowired
  private ConfiguracaoJogoService configJogoService;

  @GetMapping(value = "/", produces = MediaType.APPLICATION_JSON_VALUE)
  @ApiOperation(value = "Retona as configurações do jogo", response = List.class)
  public List<ConfiguracaoJogoDTO> buscarTodasConfigJogo() {
    logger.info("Buscando todas as configuracoes de jogo");
    return configJogoService.buscarTodasConfigJogo();
  }

}
