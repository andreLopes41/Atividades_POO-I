package com.objetos.orientacao.andre;

import java.util.Scanner;

public class QuadradoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner (System.in);
		
		int tamanhoLado = 0;
		int escolha = 0;
		
		do {
			System.out.print("Tamanho Do Lado: ");
			tamanhoLado = entrada.nextInt();
			
			if (tamanhoLado < 1) {
				System.out.println("Digite Um Valor Aceitável");
			}
			
		}while(tamanhoLado < 1);
		
		Quadrado moldura = new Quadrado(tamanhoLado);
		
		
		System.out.println(moldura.DesenhaQuadrado());
		System.out.println(moldura.AreaQuadrado());
		
		do {
			System.out.println("Mudar Tamanho Do Quadrado? \n[1] Sim  [0] Não");
			escolha = entrada.nextInt();
			
			if (escolha < 0 || escolha > 1) {
				System.out.println("Opção Inválida");
			}
			
			else if (escolha == 1) {
				do {
					System.out.print("Tamanho Do Lado: ");
					tamanhoLado = entrada.nextInt();
					
					if (tamanhoLado < 1) {
						System.out.println("Digite Um Valor Aceitável");
					}
					
				}while(tamanhoLado < 1);
				
				System.out.println(moldura.MudarValor(tamanhoLado));
				System.out.println(moldura.DesenhaQuadrado());
				System.out.println(moldura.AreaQuadrado());
			}
			
			else {
		
				System.out.println("Programa Encerrado");
			
			}
			
		}while (escolha !=0);
		
		entrada.close();
		
	}

}
