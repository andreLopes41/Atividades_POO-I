package com.andre.funcoes;

import java.util.Scanner;

public class QuantidadeDigitos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.print("Qualquer Número[Inteiro]: ");
		int numero = entrada.nextInt();
		
		entrada.close();
		
		System.out.println("Digitos: " + MinhasFuncoes.tamanhoDoNumero(numero));

	}

}
