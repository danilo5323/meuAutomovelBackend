package br.com.dbsdev.repositories;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.com.dbsdev.entity.Consumo;
import br.com.dbsdev.entity.Veiculo;

@Repository
public interface ConsumoRepository extends JpaRepository<Consumo, Long>{

  List<Consumo> findByVeiculo(Veiculo veiculo);
  //@Query("SELECT obj FROM Produto obj WHERE obj.nome LIKE %:nome% AND cat IN :categorias")
	
  
  @Transactional(readOnly=true)
  @Query("SELECT  u FROM Consumo u WHERE u.veiculo=?1")
  List<Consumo> findByVeiculoLimitedToLimit(@Param("veiculo")  Veiculo veiculo, Pageable limit);

}
