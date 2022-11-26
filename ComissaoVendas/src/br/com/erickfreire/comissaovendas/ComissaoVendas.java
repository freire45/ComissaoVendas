package br.com.erickfreire.comissaovendas;

import java.util.Scanner;

public class ComissaoVendas {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int opcao = 0;
		double valor = 0.0;
		double valorSemana = 0.0;
		double salario = 0.0;
		
		System.out.println("Programa que calcula salário semanal: ");
		System.out.printf("%nMenu Principal: %n%n"
				         + "Escolha uma opção: %n%n"
				         + "1 - Inserir nova venda%n"
				         + "9 - Sair%n%n");
		System.out.print("Digite a opção: ");
		opcao = entrada.nextInt();
		
		while(opcao != 9) {
			
			System.out.print("Digite o valor da venda: ");
			valor = entrada.nextDouble();
			
			valorSemana = valorSemana + valor;
			
			System.out.printf("%nMenu Principal: %n%n"
			         + "Escolha uma opção: %n%n"
			         + "1 - Inserir nova venda%n"
			         + "9 - Sair%n%n");
			
			System.out.print("Digite a opção: ");
	        opcao = entrada.nextInt();			
			
		}
		
		salario = 200.00 + (valorSemana * 0.09);
		
		System.out.printf("O funcionario vendeu um total de %.2f%n"
				        + "Salario da Semana: R$ %.2f%n", valorSemana, salario);

	}

}
