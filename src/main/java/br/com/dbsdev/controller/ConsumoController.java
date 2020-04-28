package br.com.dbsdev.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.dbsdev.entity.Consumo;
import br.com.dbsdev.entity.Veiculo;
import br.com.dbsdev.repositories.ConsumoRepository;
import br.com.dbsdev.repositories.VeiculoRepository;

@Controller
@RequestMapping(value = "consumo")
public class ConsumoController {

  private ConsumoRepository consumoRepository;
  private VeiculoRepository veiculoRepository;

  @Autowired
  public ConsumoController(ConsumoRepository consumoRepository, VeiculoRepository veiculoRepository) {
    super();
    this.consumoRepository = consumoRepository;
    this.veiculoRepository = veiculoRepository;
  }

  @GetMapping(value = "/{placaVeiculo}")
  public ResponseEntity<List<Consumo>> getConsumo(@PathVariable String placaVeiculo) {
    Veiculo veiculo = veiculoRepository.findByPlaca(placaVeiculo);
    List<Consumo> consumo =  consumoRepository.findByVeiculo( veiculo );
    return ResponseEntity.ok().body(consumo);
  }

  @PostMapping(value = "/{placaVeiculo}")
  public ResponseEntity<Long> inserirNovoConsumo(@PathVariable String placaVeiculo, @Valid @RequestBody Consumo inserir) {
    Long id = 1l;
    Veiculo veiculo = veiculoRepository.findByPlaca(placaVeiculo);
    List<Consumo> listaConsumo = new ArrayList();
    inserir.setVeiculo(veiculo);
    listaConsumo.add(inserir);
	veiculo.setConsumo(listaConsumo ); 
    consumoRepository.saveAll( listaConsumo);
    return ResponseEntity.ok().body(id);
  }
 
}
