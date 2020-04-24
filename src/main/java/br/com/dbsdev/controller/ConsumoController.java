package br.com.dbsdev.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.dbsdev.entity.Consumo;

@Controller
@RequestMapping(value = "consumo")
public class ConsumoController {

	@GetMapping(value="/{limiteDias}")
	public ResponseEntity<Consumo[]> getConsumo(@PathVariable Long limiteDias){
		
		System.out.println(""+ limiteDias);
		
		Consumo[] consumo = new Consumo[3] ;
		
		consumo[0] = new Consumo();
		consumo[0].setCustoPorKm("R$ 300");
		consumo[0].setPrecoCombustivel("precoCombustivel");

		
		consumo[1] = new Consumo();
		consumo[1].setCustoPorKm("R$ 300");
		consumo[1].setPrecoCombustivel("precoCombustivel");
		
		consumo[2] = new Consumo();
		consumo[2].setCustoPorKm("R$ 300");
		consumo[2].setPrecoCombustivel("precoCombustivel");
		return ResponseEntity.ok().body(consumo);
	}
	
	@GetMapping
	public ResponseEntity<Consumo[]> getTodoConsumo(  ){
	 
		
		Consumo[] consumo = new Consumo[3] ;
		
		consumo[0] = new Consumo();
		consumo[0].setCustoPorKm("R$ 300");
		consumo[0].setPrecoCombustivel("precoCombustivel");

		
		consumo[1] = new Consumo();
		consumo[1].setCustoPorKm("R$ 300");
		consumo[1].setPrecoCombustivel("precoCombustivel");
		
		consumo[2] = new Consumo();
		consumo[2].setCustoPorKm("R$ 300");
		consumo[2].setPrecoCombustivel("precoCombustivel");
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
