package br.com.dbsdev.services;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.dbsdev.model.Consumo;
import br.com.dbsdev.repositories.ConsumoRepository;

@Service
public class ConsumoService {

  ConsumoRepository consumoRepository;

  @Autowired
  public ConsumoService(ConsumoRepository consumoRepository) {
    this.consumoRepository = consumoRepository;
  }

  public List<Consumo> processarConsumo(Long limiteDias) {

    LocalDate diaFinal = LocalDate.now();
    LocalDate diaInicial = diaFinal.minusDays(limiteDias);
    List<Consumo> consumo = consumoRepository.findRetroativoDias(diaInicial, diaFinal);
    return consumo;
  }

  public List<Consumo> getConsumoTotal() {
    List<Consumo> consumo = consumoRepository.findAll();
    return consumo;
  }

  public Consumo deletar(Long id) {

    Consumo consumoDeletado = consumoRepository.findById(id).get();
    consumoRepository.delete(consumoDeletado);
    return consumoDeletado;
  }

}
