package com.andre.funcoes;

import java.util.Scanner;

public class NumeroReverso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.print("Um Número[Inteiro]: ");
		int numero = entrada.nextInt();
		
		entrada.close();
		
		System.out.println("O Inverso é: " + MinhasFuncoes.numeroInverso(numero));
	}

}
