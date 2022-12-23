package com.andre.funcoes;

import java.util.Scanner;

public class DesenhaMoldura {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.print("Tamanho Da Linha[Min 1 e Máx 20]: ");
		int linha = entrada.nextInt();
		
		if (linha < 1) {
			linha = 1;
		}
		else if (linha > 20) {
			linha = 20;
		}
		
		System.out.print("Tamanho Da Coluna[Min 1 e Máx 20]: ");
		int coluna = entrada.nextInt();
		
		if (coluna < 1) {
			coluna = 1;
		}
		else if (coluna > 20) {
			coluna = 20;
		}
		
		entrada.close();
		
		System.out.println(MinhasFuncoes.desenhaMoldura(linha, coluna));

	}

}
