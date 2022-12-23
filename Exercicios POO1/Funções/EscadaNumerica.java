package com.andre.funcoes;

import java.util.Scanner;

public class EscadaNumerica {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner (System.in);
		
		int numero = 0;
		
		do {
			System.out.print("Número[Maior Que ZERO]: ");
			numero = entrada.nextInt();
			
		}while (numero <= 0);
		
		entrada.close();
		
		System.out.println(MinhasFuncoes.escadaNumerica(numero));
	}

}
