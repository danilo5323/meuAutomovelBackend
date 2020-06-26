package br.com.dbsdev.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.dbsdev.model.Documentacao;

public interface DocumentacaoRepository extends JpaRepository<Documentacao, Long> {

}
