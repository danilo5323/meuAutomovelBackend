package br.com.dbsdev.entity;

import javax.persistence.Entity;

@Entity
public class Consumo {

	private String dataAbastecimento;
	private String precoCombustivel;
	private String mediaConsumoParcial;
	private String mediaGeral10Dias;
	private String mediaConsumo;
	private String tipoCombustivel;
	private String custoPorKm;
	private String custoTotal;
	private String nomePosto;
	
	
	
	public Consumo() {
		super();
	}
	
	public Consumo(String dataAbastecimento, String precoCombustivel, String mediaConsumoParcial,
			String mediaGeral10Dias, String mediaConsumo, String tipoCombustivel, String custoPorKm, String custoTotal,
			String nomePosto) {
		super();
		this.dataAbastecimento = dataAbastecimento;
		this.precoCombustivel = precoCombustivel;
		this.mediaConsumoParcial = mediaConsumoParcial;
		this.mediaGeral10Dias = mediaGeral10Dias;
		this.mediaConsumo = mediaConsumo;
		this.tipoCombustivel = tipoCombustivel;
		this.custoPorKm = custoPorKm;
		this.custoTotal = custoTotal;
		this.nomePosto = nomePosto;
	}
	public String getDataAbastecimento() {
		return dataAbastecimento;
	}
	public void setDataAbastecimento(String dataAbastecimento) {
		this.dataAbastecimento = dataAbastecimento;
	}
	public String getPrecoCombustivel() {
		return precoCombustivel;
	}
	public void setPrecoCombustivel(String precoCombustivel) {
		this.precoCombustivel = precoCombustivel;
	}
	public String getMediaConsumoParcial() {
		return mediaConsumoParcial;
	}
	public void setMediaConsumoParcial(String mediaConsumoParcial) {
		this.mediaConsumoParcial = mediaConsumoParcial;
	}
	public String getMediaGeral10Dias() {
		return mediaGeral10Dias;
	}
	public void setMediaGeral10Dias(String mediaGeral10Dias) {
		this.mediaGeral10Dias = mediaGeral10Dias;
	}
	public String getMediaConsumo() {
		return mediaConsumo;
	}
	public void setMediaConsumo(String mediaConsumo) {
		this.mediaConsumo = mediaConsumo;
	}
	public String getTipoCombustivel() {
		return tipoCombustivel;
	}
	public void setTipoCombustivel(String tipoCombustivel) {
		this.tipoCombustivel = tipoCombustivel;
	}
	public String getCustoPorKm() {
		return custoPorKm;
	}
	public void setCustoPorKm(String custoPorKm) {
		this.custoPorKm = custoPorKm;
	}
	public String getCustoTotal() {
		return custoTotal;
	}
	public void setCustoTotal(String custoTotal) {
		this.custoTotal = custoTotal;
	}
	public String getNomePosto() {
		return nomePosto;
	}
	public void setNomePosto(String nomePosto) {
		this.nomePosto = nomePosto;
	}


	
}
