package model.servicos;

public class TaxaBrasil implements ServicoTaxa {
	
	public double taxa(double valorTaxa) {
		if(valorTaxa <= 100) {
			return valorTaxa * 0.2;
		}
		else {
			return valorTaxa * 0.15;
		}
	}
}
