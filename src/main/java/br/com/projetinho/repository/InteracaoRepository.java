package br.com.projetinho.repository;

import br.com.projetinho.model.InteracaoVoto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InteracaoRepository extends JpaRepository<InteracaoVoto, Long>{
}
