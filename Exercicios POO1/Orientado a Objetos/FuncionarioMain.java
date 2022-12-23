package com.objetos.orientacao.andre;

import java.util.Scanner;

public class FuncionarioMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner (System.in);
		
		float valorHora = 0;
		int horas = 0;
		
		do {
			System.out.print("Ganho Por Hora[R$]: ");
			valorHora = entrada.nextFloat();
			
			if (valorHora < 0) {
				System.out.println("Digite Um Valor Aceitável");
			}
			
		}while(valorHora < 0);
		
		do {
			System.out.print("Horas Trabalhadas: ");
			horas = entrada.nextInt();
			
			if (horas < 0) {
				System.out.println("Digite Um Valor Aceitável");
			}
			
		}while(horas < 0);
		
		entrada.close();
		
		Funcionario func = new Funcionario (valorHora, horas);
		
	
		System.out.println(func.SalarioBruto());
		System.out.println(func.INSS());
		System.out.println(func.Sindicato());
		System.out.println(func.Imposto());
		System.out.println(func.SalarioLiquido());
	
	}

}
