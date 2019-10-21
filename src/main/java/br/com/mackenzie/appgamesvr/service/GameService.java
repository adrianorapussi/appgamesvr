package br.com.mackenzie.appgamesvr.service;

import br.com.mackenzie.appgamesvr.domain.Game;
import br.com.mackenzie.appgamesvr.repository.GameRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GameService {

  private final GameRepository gameRepository;

  @Autowired
  public GameService(GameRepository gameRepository) {
    this.gameRepository = gameRepository;
  }

  public List<Game> buscarTodosGames() {
    return gameRepository.findAll();
  }

  public Game atualizarJogoPorId(Game jogoNovo) {
    return gameRepository.save(jogoNovo);
  }

  public void removerJogoPorId(Integer idGame) {
    this.gameRepository.deleteById(idGame);
  }

  public Game criarGame(Game gameNovo) {
    return gameRepository.saveAndFlush(gameNovo);
  }
}
