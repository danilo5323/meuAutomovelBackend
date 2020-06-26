package br.com.dbsdev.repositories;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.com.dbsdev.model.Consumo;
import br.com.dbsdev.model.Veiculo;

@Repository
public interface ConsumoRepository extends JpaRepository<Consumo, Long>{

  List<Consumo> findByVeiculo(Veiculo veiculo);
  //@Query("SELECT obj FROM Produto obj WHERE obj.nome LIKE %:nome% AND cat IN :categorias")
	
  
  @Transactional(readOnly=true)
  @Query("SELECT  u FROM Consumo u WHERE u.veiculo=?1")
  List<Consumo> findByVeiculoLimitedToLimit(@Param("veiculo")  Veiculo veiculo, Pageable limit);

  @Transactional(readOnly=true)
  @Query("SELECT  u FROM Consumo u WHERE u.dataAbastecimento > ?1 and u.dataAbastecimento < ?2")
  List<Consumo> findRetroativoDias(@Param("diaAtual") LocalDate dia1, @Param("diaAnterior") LocalDate dia2);

}
