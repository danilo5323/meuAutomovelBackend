package br.com.dbsdev.controller;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.dbsdev.entity.Consumo;
import br.com.dbsdev.repositories.VeiculoRepository;

@Controller
@RequestMapping(value = "consumo")
public class ConsumoController {

  VeiculoRepository veiculoRepository;
  
  @Autowired
  public ConsumoController(VeiculoRepository veiculoRepository) {
    this.veiculoRepository = veiculoRepository;
  }
  
	@GetMapping(value="/{limiteDias}")
	public ResponseEntity<Consumo[]> getConsumo(@PathVariable Long limiteDias){
		
		System.out.println(""+ limiteDias);
		
		Consumo[] consumo = new Consumo[3] ;
		
		consumo[0] = new Consumo();
		consumo[0].setCustoPorKm(54.6);
		consumo[0].setPrecoCombustivel(new BigDecimal(45.4));

		
		consumo[1] = new Consumo();
		consumo[1].setCustoPorKm(54.6);
		consumo[1].setPrecoCombustivel(new BigDecimal(45.4));
		 
		return ResponseEntity.ok().body(consumo);
	}
	
	@GetMapping
	public ResponseEntity<Consumo[]> getTodoConsumo(  ){
	 
	  Consumo[] consumo = new Consumo[2];
		
 
		return ResponseEntity.ok().body(consumo);
	}
	
	@PostMapping
	public ResponseEntity<Long> inserirNovoConsumo( Consumo inserir ){
		Long id = 1l;//serviceConsumo.inserirConsumo(inserir);
		
		return ResponseEntity.ok().body( id );
	}
	
	@PutMapping
	public ResponseEntity< Mensagem > atualizarConsumo( Consumo parametro  ){
	 
		Mensagem mensagem  = new Mensagem("Atualizado com sucesso");
		 
		return ResponseEntity.ok().body(mensagem);
	}
	
	@DeleteMapping
	public ResponseEntity<Consumo> deletarConsumo( Long id) {
		
		Consumo consumoDeletado = new Consumo();
		
		
		
		return ResponseEntity.ok().body(consumoDeletado);
	}
}
