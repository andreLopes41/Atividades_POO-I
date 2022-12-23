package com.objetos.orientacao.andre;

import java.util.Scanner;

public class IntervaloMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner (System.in);
		
		System.out.println(" AVISO! Caso O Segundo Número For Menor Que o Primeiro O Programa Fará Uma Inversão");
		
		System.out.print("1° Número do Intervalo [INTEIRO]: ");
		int num1 = entrada.nextInt();
		
		System.out.print("1° Número do Intervalo [INTEIRO]: ");
		int num2 = entrada.nextInt();
		
		entrada.close();
		
		Intervalo numeros = new Intervalo (num1, num2);
		
		System.out.println(numeros.MostraIntervalo());
		
	}

}
