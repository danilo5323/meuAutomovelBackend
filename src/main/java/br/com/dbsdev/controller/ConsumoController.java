package br.com.dbsdev.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.dbsdev.model.Consumo;
import br.com.dbsdev.services.ConsumoService;

@RestController
@RequestMapping(value = "/consumo")
public class ConsumoController {

  ConsumoService serviceConsumo;

  @Autowired
  public ConsumoController(ConsumoService serviceConsumo) {
    this.serviceConsumo = serviceConsumo;
  }

  @GetMapping(value = "/{limiteDias}")
  public ResponseEntity<List<Consumo>> getConsumo(@PathVariable Long limiteDias) {

    List<Consumo> consumo = serviceConsumo.processarConsumo(limiteDias);

    return ResponseEntity.ok().body(consumo);
  }

  @GetMapping
  public ResponseEntity<List<Consumo>> getConsumoTotal() {

    List<Consumo> consumo = serviceConsumo.getConsumoTotal();

    return ResponseEntity.ok().body(consumo);
  }

  @PostMapping
  public ResponseEntity<Long> inserirNovoConsumo(Consumo inserir) {
    Long id = 1l;

    return ResponseEntity.ok().body(id);
  }


  @DeleteMapping
  public ResponseEntity<Consumo> deletarConsumo(Long id) {

    Consumo response = serviceConsumo.deletar(id);

    return ResponseEntity.ok().body(response);
  }
}