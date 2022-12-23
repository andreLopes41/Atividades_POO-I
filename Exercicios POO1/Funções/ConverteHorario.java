package com.andre.funcoes;

import java.util.Scanner;

public class ConverteHorario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner (System.in);
		
		int hora = 0;
		int minuto = 0;
		int escolha = 0;
		
		do {
			System.out.print("Hora: ");
			hora = entrada.nextInt();
			
			System.out.print("Minuto: ");
			minuto = entrada.nextInt();
			
			System.out.println(MinhasFuncoes.mostraHora(hora, minuto));
			
				System.out.println("\nContinuar [1] ");
				System.out.println("Sair [Qualquer Outro Valor]");
				escolha = entrada.nextInt();
			
		}while (escolha == 1);
		
		System.out.println("Fim Da Excecução!");
		entrada.close();
		
		

	}

}
