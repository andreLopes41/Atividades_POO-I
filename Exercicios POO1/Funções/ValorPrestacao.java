package com.andre.funcoes;

import java.util.Scanner;

public class ValorPrestacao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner (System.in);
		
		float valor = 0;
		int diasAtraso = 0;
		int escolha = 0;
		
		System.out.println("Para Finalizar Difite [ZERO]");
		do {
			System.out.print("Valor Da Prestação: ");
			valor = entrada.nextInt();
			
			if (valor > 0) {
				System.out.print("Dias Em Atraso: ");
				diasAtraso = entrada.nextInt();
				
				System.out.println(MinhasFuncoes.valorPagamento(valor, diasAtraso));
			}
			else {
				System.out.println("Valor Inválido!");
			}
			
			System.out.println("[0] Sair");
			System.out.println("[1] Mais Operações");
			escolha = entrada.nextInt();
		}while (escolha != 0);
		
		entrada.close();
	
	}
}
