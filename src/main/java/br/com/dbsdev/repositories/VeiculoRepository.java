package br.com.dbsdev.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.dbsdev.model.Veiculo;

@Repository
public interface VeiculoRepository extends JpaRepository<Veiculo, Long>{

  Veiculo findByPlaca(String placaVeiculo);

}
