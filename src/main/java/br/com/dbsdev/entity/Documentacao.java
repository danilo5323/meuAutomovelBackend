package br.com.dbsdev.entity;

import java.time.LocalDate;

import javax.persistence.Entity;

@Entity
public class Documentacao {
	private String descricaoDocumentacao;
	private String valorDocumentacao;
	private LocalDate dataPagamento;
	
	
}
