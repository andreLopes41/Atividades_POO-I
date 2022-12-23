package com.andre.funcoes;

import java.util.Scanner;

public class ArgumentoPositivoNegativo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.print("Um Número[Inteiro]: ");
		int numero = entrada.nextInt();
		
		entrada.close();
		
		System.out.println(MinhasFuncoes.postivoOuNegativo(numero));

	}

}
