package br.com.dbsdev.controller;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.dbsdev.model.Consumo;
import br.com.dbsdev.services.ConsumoVeiculoService; 

@RestController
@RequestMapping(value = "consumo")
public class ConsumoController {
 
	ConsumoVeiculoService serviceConsumo;

	@Autowired
	public ConsumoController(ConsumoVeiculoService consumoVeiculoService) {
	}

	@GetMapping(value = "/{limiteDias}")
	public ResponseEntity<Consumo[]> getConsumo(@PathVariable Long limiteDias) {

		Consumo[] consumo = serviceConsumo.processarConsumo(limiteDias);

		return ResponseEntity.ok().body(consumo);
	}

	@GetMapping
	public ResponseEntity<Consumo[]> getConsumoTotal() {

		Consumo[] consumo = serviceConsumo.getConsumoTotal();

		return ResponseEntity.ok().body(consumo);
	}

	@PostMapping
	public ResponseEntity<Long> inserirNovoConsumo(Consumo inserir) {
		Long id = 1l;

		return ResponseEntity.ok().body(id);
	}

	@PutMapping
	public ResponseEntity<Consumo> atualizarConsumo(Consumo parametro) {

	  Consumo mensagem = serviceConsumo.atualizarConsumo(parametro);

		return ResponseEntity.ok().body(mensagem);
	}

	@DeleteMapping
	public ResponseEntity<Consumo> deletarConsumo(Long id) {

		Consumo response = serviceConsumo.deletar(id);

		return ResponseEntity.ok().body(response);
	}
}