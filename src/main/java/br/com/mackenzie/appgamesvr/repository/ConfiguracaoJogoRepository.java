package br.com.mackenzie.appgamesvr.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.mackenzie.appgamesvr.domain.ConfiguracaoJogo;

public interface ConfiguracaoJogoRepository extends JpaRepository<ConfiguracaoJogo, Integer> {
}
