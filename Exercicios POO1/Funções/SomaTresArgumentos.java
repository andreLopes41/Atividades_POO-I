package com.andre.funcoes;

import java.util.Scanner;

public class SomaTresArgumentos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.print("1° Número[Inteiro]: ");
		int numero1 = entrada.nextInt();
		
		System.out.print("2° Número[Inteiro]: ");
		int numero2 = entrada.nextInt();
		
		System.out.print("3° Número[Inteiro]: ");
		int numero3 = entrada.nextInt();
		
		entrada.close();
		
		System.out.println("Soma: " + MinhasFuncoes.somaTres(numero1, numero2, numero3));
	}
}
