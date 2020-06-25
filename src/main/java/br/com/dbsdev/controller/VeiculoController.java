package br.com.dbsdev.controller;

import java.util.ArrayList;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.dbsdev.model.Veiculo;
import br.com.dbsdev.services.VeiculoService;

@RestController
@RequestMapping(value = "veiculo")
public class VeiculoController {

  VeiculoService veiculoService;

  @Autowired
  public VeiculoController(VeiculoService veiculoService) {
    this.veiculoService = veiculoService;
  }

  @GetMapping
  public ResponseEntity<ArrayList<Veiculo>> consultarVeiculo() {
    ArrayList<Veiculo> veiculo = veiculoService.consultarVeiculos();
    return ResponseEntity.ok().body(veiculo);
  }

  @GetMapping(value = "/{id}")
  public ResponseEntity<Veiculo> consultarVeiculo(@PathVariable Long id) {
    Veiculo veiculo = veiculoService.consultarVeiculos(id);
    return ResponseEntity.ok().body(veiculo);
  }

  @PostMapping
  public ResponseEntity<Veiculo> inserirVeiculo(@Valid @RequestBody Veiculo input) {
    Veiculo veiculo = veiculoService.salvarVeiculo(input);
    return ResponseEntity.ok().body(veiculo);
  }

  @PutMapping(value = "/{id}")
  public ResponseEntity<Veiculo> atualizarVeiculo(@Valid @RequestBody Veiculo veiculo, @PathVariable Long id) {
    Veiculo c = veiculoService.atualizarVeiculo(id, veiculo);
    return ResponseEntity.ok().body(c);
  }

}
