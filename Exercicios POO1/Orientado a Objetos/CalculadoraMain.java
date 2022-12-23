package com.objetos.orientacao.andre;

import java.util.Scanner;

public class CalculadoraMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner (System.in);
		
		int escolha = 0;
		
		do {
			System.out.println("[1] - Soma");
			System.out.println("[2] - SUbtração");
			System.out.println("[3] - Multiplicação");
			System.out.println("[4] - Divisão");
			escolha = entrada.nextInt();
			
			if (escolha < 1 || escolha > 4) {
				System.out.println("Informe Uma Opção Válida");
			}
			
		}while(escolha < 1 || escolha > 4);
		
		System.out.print("1° Número: ");
		float num1 = entrada.nextInt();
		
		System.out.print("2° Número: ");
		float num2 = entrada.nextInt();
		
		entrada.close();
		
		Calculadora calcular = new Calculadora(num1, num2, escolha);
		
		if(escolha == 1) {
			System.out.println(calcular.Somar(num1, num2));
		}
		else if (escolha == 2) {
			System.out.println(calcular.Subtrair(num1, num2));
		}
		else if (escolha == 3) {
			System.out.println(calcular.Multiplicar(num1, num2));
		}
		else {
			System.out.println(calcular.Dividir(num1, num2));
		}
	}

}
