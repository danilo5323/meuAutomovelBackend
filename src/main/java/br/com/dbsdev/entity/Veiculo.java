package br.com.dbsdev.entity;

import java.util.List;

import javax.persistence.Entity;

/**
 * Raiz 
 * @author danilo
 *
 */
@Entity
public class Veiculo {
	private Double capacidadeTanque;
	private String placa;
	private String codigoFipe;
	private Double valorCompra;
	private Double autonomiaMinima;
	private Double mediaConsumoTotal;
	private Double autonomiaTanque;
	private Double precoRevendaFipe;
	
	private List<Consumo> consumo;
	private List<Documentacao> documentacao;
	private List<OutrosCustos> outrosCustos;
	private List<Manutencao> manutencao;
}
