package model.servicos;

public class TaxaBrasil {
	
	public Double taxa(double valorTaxa) {
		if(valorTaxa <= 100) {
			return valorTaxa * 0.2;
		}
		else {
			return valorTaxa * 0.15;
		}
		
	}

}
