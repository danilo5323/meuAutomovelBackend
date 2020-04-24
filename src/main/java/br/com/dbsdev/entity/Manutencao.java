package br.com.dbsdev.entity;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Entity;

@Entity
public class Manutencao {
	private String CustoTotalManutencao;
	private LocalDate data;
	List<ItemManutencao> itensManutencao;
}
