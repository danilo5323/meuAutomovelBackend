package br.com.dbsdev.controller;

public class Mensagem {

	private String mensagem;
	public Mensagem(String string) {
		this.mensagem = string;
	}
	public String getMensagem() {
		return mensagem;
	}
	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
	@Override
	public String toString() {
		return "Mensagem [mensagem=" + mensagem + "]";
	}

	
}
