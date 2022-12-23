package com.andre.funcoes;

import java.util.Scanner;

public class JogoCraps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner (System.in);
		
		int dados = 2;
		int escolha = 0;
		int ponto = 0;
		boolean flag = true;
		
		do {
			System.out.println("[1] Jogar Dados");
			System.out.println("[0] Encerrar Jogo");
			escolha = entrada.nextInt();
			dados = MinhasFuncoes.jogoCraps(escolha);
			
			if (escolha < 0 || escolha > 1) {
				System.out.println("Opcão Inválida!");
			}
			else if (escolha == 1) {
				System.out.println("Soma: " + dados);
				if (dados == 7 || dados == 11) {
					System.out.println("**Você Ganhou!");
				}
				else if (dados == 2 || dados == 3 || dados == 12) {
					System.out.println("**Você Perdeu!");
				}
				else if (dados == 4 || dados == 5 || dados == 6 || dados == 8 || dados == 9 || dados == 10) {
					if(flag) {
						flag = false;
						ponto = dados;
					}
					else if (ponto == dados) {
						System.out.println("**Você Ganhou!");
					}	
				}
			}
		}while (escolha != 0);
		
		System.out.println("Fim De Jogo!");
		
		entrada.close();
	}
}
