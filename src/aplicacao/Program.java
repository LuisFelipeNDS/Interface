package aplicacao;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import model.entidade.Aluguel;
import model.entidade.Carro;
import model.servicos.ServicoAluguel;
import model.servicos.TaxaBrasil;

public class Program {
	
	public static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		System.out.print("Qual o modelo do carro ?");
		String modelo = teclado.nextLine();
		System.out.print("Data de retirada (dd/MM/yyyy HH:mm): ");
		LocalDateTime inicio = LocalDateTime.parse(teclado.nextLine(), fmt);
		System.out.print("Data de retorno (dd/MM/yyyy HH:mm): ");
		LocalDateTime retorno = LocalDateTime.parse(teclado.nextLine(), fmt);
		
		
		Aluguel aluguel = new Aluguel(inicio, retorno, new Carro(modelo));
		
		System.out.println("Qual o valor por dia ?");
		double valorDia = teclado.nextDouble();
		System.out.println("Qual o valor por hora ?");
		double valorHora = teclado.nextDouble();
		
		ServicoAluguel sA = new ServicoAluguel(valorDia, valorHora, new TaxaBrasil()); 
		
		sA.imprimirFatura(aluguel);
		
		System.out.println("Fatura");
		System.out.println("-----------------------------------");
		System.out.println("Pagamento basico: " + String.format("%.2f", aluguel.getFatura().getPagamentoBasico()));
		System.out.println("Imposto: " + String.format("%.2f", aluguel.getFatura().getTaxa()));
		System.out.println("Pagamento total: " + aluguel.getFatura().pagamento());

	

	}

}
