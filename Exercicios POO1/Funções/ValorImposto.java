package com.andre.funcoes;

import java.util.Scanner;

public class ValorImposto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.print("Porcentagem Do Imposto: ");
		float imposto = entrada.nextInt();
		
		System.out.print("Custo Do Produto: ");
		float valor = entrada.nextFloat();
		
		entrada.close();
		
		System.out.println("Valor Com Imposto: " + MinhasFuncoes.calculaImposto(imposto, valor) + " R$");

	}

}
