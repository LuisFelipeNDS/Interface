package model.servicos;

import model.entidade.Aluguel;
import model.entidade.Fatura;

public class ServicoAluguel {
	
	private Double valorDia;
	private Double valorHora;
	
	private TaxaBrasil taxaBrasil;

	public ServicoAluguel(Double valorDia, Double valorHora, TaxaBrasil taxaBrasil) {
		this.valorDia = valorDia;
		this.valorHora = valorHora;
		this.taxaBrasil = taxaBrasil;
	}
	
	public void imprimirFatura(Aluguel aluguel) {
		
		aluguel.setFatura(new Fatura(50.0, 10.0));
	}

	public Double getValorDia() {
		return valorDia;
	}

	public void setValorDia(Double valorDia) {
		this.valorDia = valorDia;
	}

	public Double getValorHora() {
		return valorHora;
	}

	public void setValorHora(Double valorHora) {
		this.valorHora = valorHora;
	}

	public TaxaBrasil getTaxaBrasil() {
		return taxaBrasil;
	}

	public void setTaxaBrasil(TaxaBrasil taxaBrasil) {
		this.taxaBrasil = taxaBrasil;
	}
	
	
	
	
	
	

}
