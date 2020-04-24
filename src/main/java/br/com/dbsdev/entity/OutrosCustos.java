package br.com.dbsdev.entity;

import java.time.LocalDate;

import javax.persistence.Entity;

@Entity
public class OutrosCustos {
	private String descricao;
	private Double custo;
	private LocalDate data;
}
