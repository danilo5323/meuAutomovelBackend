package br.com.dbsdev.controller;

import java.util.ArrayList;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.dbsdev.model.Veiculo;
import br.com.dbsdev.repositories.VeiculoRepository;

@Controller
@RequestMapping(value = "veiculo")
public class VeiculoController {

  VeiculoRepository veiculoRepository;

  @Autowired
  public VeiculoController(VeiculoRepository veiculoRepository) {
    this.veiculoRepository = veiculoRepository;
  }

  @GetMapping
  public ResponseEntity<ArrayList<Veiculo>> consultarVeiculo() {
    ArrayList<Veiculo> veiculo = (ArrayList<Veiculo>) veiculoRepository.findAll();
    return ResponseEntity.ok().body(veiculo);
  }

  @GetMapping(value = "/{id}")
  public ResponseEntity<Veiculo> consultarVeiculo(@PathVariable Long id) {
    Veiculo veiculo = (veiculoRepository.findById(id)).get();
    return ResponseEntity.ok().body(veiculo);
  }

  @PostMapping
  public ResponseEntity<Veiculo> inserirVeiculo(@Valid @RequestBody Veiculo veiculo) {
    veiculoRepository.save(veiculo);
    return ResponseEntity.ok().body(veiculo);
  }

  @PutMapping(value = "/{id}")
  public ResponseEntity<Veiculo> atualizarVeiculo(@Valid @RequestBody Veiculo veiculo, @PathVariable Long id) {
    Veiculo c = consultarVeiculo(id).getBody();
    c = Veiculo.setVeiculo(c, veiculo);
    veiculoRepository.save(c);
    return ResponseEntity.ok().body(c);
  }

}
