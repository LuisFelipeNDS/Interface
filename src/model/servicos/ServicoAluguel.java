package model.servicos;

import java.time.Duration;

import model.entidade.Aluguel;
import model.entidade.Fatura;

public class ServicoAluguel {
	
	private Double valorDia;
	private Double valorHora;
	
	private ServicoTaxa taxaTotal;

	public ServicoAluguel(Double valorDia, Double valorHora, ServicoTaxa taxaTotal) {			
		this.valorDia = valorDia;
		this.valorHora = valorHora;
		this.taxaTotal = taxaTotal;
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

	public ServicoTaxa getTaxaTotal() {
		return taxaTotal;
	}

	public void setTaxaBrasil(ServicoTaxa taxaTotal) {
		this.taxaTotal = taxaTotal;
	}
	
	public void imprimirFatura(Aluguel aluguel) {
		double minutes = Duration.between(aluguel.getInicio(), aluguel.getFim()).toMinutes();		
		double hours = minutes / 60.0;
		
		double pagamento;
		if (hours <= 12.0) {
			pagamento = valorHora * Math.ceil(hours);
		}
		else {
			pagamento = valorDia * Math.ceil(hours / 24);
		}

		double taxa = taxaTotal.taxa(pagamento);

		aluguel.setFatura(new Fatura(pagamento, taxa));
	}
	
	
	
	
	

}
