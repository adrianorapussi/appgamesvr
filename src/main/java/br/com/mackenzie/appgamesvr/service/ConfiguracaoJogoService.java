package br.com.mackenzie.appgamesvr.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.google.common.base.Function;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import br.com.mackenzie.appgamesvr.domain.ConfiguracaoJogo;
import br.com.mackenzie.appgamesvr.repository.ConfiguracaoJogoRepository;
import br.com.mackenzie.appgamesvr.rest.dto.ConfiguracaoJogoDTO;

@Service
public class ConfiguracaoJogoService {

  private final ConfiguracaoJogoRepository repository;

  @Autowired
  public ConfiguracaoJogoService(ConfiguracaoJogoRepository repository) {
    this.repository = repository;
  }

  public List<ConfiguracaoJogoDTO> buscarTodasConfigJogo() {
    List<ConfiguracaoJogo> configuracaoJogos = repository.findAll();
    Function<ConfiguracaoJogo, ConfiguracaoJogoDTO> function =
        new Function<ConfiguracaoJogo, ConfiguracaoJogoDTO>() {
          @Override
          public ConfiguracaoJogoDTO apply(ConfiguracaoJogo input) {
            return new ConfiguracaoJogoDTO(input);
          }
        };
    var configuracaoJogoDTOs = Iterables.transform(configuracaoJogos, function);
    return Lists.newArrayList(configuracaoJogoDTOs);
  }

}
