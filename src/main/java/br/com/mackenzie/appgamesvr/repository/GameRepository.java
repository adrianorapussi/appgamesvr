package br.com.mackenzie.appgamesvr.repository;

import br.com.mackenzie.appgamesvr.domain.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Integer> {}
