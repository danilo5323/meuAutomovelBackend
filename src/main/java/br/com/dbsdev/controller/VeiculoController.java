package br.com.dbsdev.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.dbsdev.repositories.VeiculoRepository;

@Controller
@RequestMapping(value = "veiculo")
public class VeiculoController {

  VeiculoRepository veiculoRepository;
  
  @Autowired
  public VeiculoController(VeiculoRepository veiculoRepository) {
    this.veiculoRepository = veiculoRepository;
  }
  
}
