package br.com.dbsdev.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.dbsdev.entity.Consumo;
import br.com.dbsdev.entity.Veiculo;

@Repository
public interface ConsumoRepository extends JpaRepository<Consumo, Long>{

  List<Consumo> findByVeiculo(Veiculo veiculo);

}
