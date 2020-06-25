package br.com.dbsdev.services;

import java.util.ArrayList;

import javax.validation.Valid;

import org.springframework.stereotype.Service;

import br.com.dbsdev.model.Veiculo;
import br.com.dbsdev.repositories.VeiculoRepository;

@Service
public class VeiculoService {
  
  private VeiculoRepository veiculoRepository;
  public VeiculoService( VeiculoRepository veiculoRepository) {
    this.veiculoRepository = veiculoRepository;
  }
  
  public ArrayList<Veiculo> consultarVeiculos() {
    return (ArrayList<Veiculo>) veiculoRepository.findAll();
  }

  public Veiculo consultarVeiculos(Long id) {
    return (veiculoRepository.findById(id)).get();
  }

  public Veiculo salvarVeiculo( Veiculo input) {
    return veiculoRepository.save(input);
  }

  public Veiculo atualizarVeiculo(Long id, @Valid Veiculo veiculo) {
    Veiculo c = consultarVeiculos(id);
    c = Veiculo.setVeiculo(c, veiculo);
    salvarVeiculo(c);
    return c;
  }
  
  
}
