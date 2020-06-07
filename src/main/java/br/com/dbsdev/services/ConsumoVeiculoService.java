package br.com.dbsdev.services;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import br.com.dbsdev.controller.Mensagem;
import br.com.dbsdev.model.Consumo;
import br.com.dbsdev.repositories.VeiculoRepository;

public class ConsumoVeiculoService {

	VeiculoRepository veiculoRepository;

	@Autowired
	public ConsumoVeiculoService(VeiculoRepository veiculoRepository) {
		this.veiculoRepository = veiculoRepository;
	}

	public Consumo[] processarConsumo(Long limiteDias) {

		System.out.println(""+ limiteDias);
		
		Consumo[] consumo = new Consumo[3] ;
		
		consumo[0] = new Consumo();
		consumo[0].setCustoPorKm(54.6);
		consumo[0].setPrecoCombustivel(new BigDecimal(45.4));

		consumo[1] = new Consumo();
		consumo[1].setCustoPorKm(54.6);
		consumo[1].setPrecoCombustivel(new BigDecimal(45.4));
		
		return consumo;
	}

	public Consumo[] getConsumoTotal() {
		// TODO Auto-generated method stub
		return null;
	}

	public Mensagem atualizarConsumo(Consumo parametro) {
		return new Mensagem("Atualizado com sucesso");
	}

	public Consumo deletar(Long id) {

		Consumo consumoDeletado = new Consumo();
		
		
		
		return consumoDeletado;
	}

}
