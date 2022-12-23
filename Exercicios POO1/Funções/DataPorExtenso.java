package com.andre.funcoes;

import java.util.Scanner;

public class DataPorExtenso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner (System.in);
		
		String[] porextenso = new String[3];
		String data = "";
		
		do {
			System.out.print("Data No Padarão [dd/mm/aaaa]: ");
			data = entrada.nextLine();
			
			if (data.length() != 10) {
				System.out.println("Data Inválida!");
			}
		}while (data.length() != 10);
		
		entrada.close();
		
		System.out.println(MinhasFuncoes.mostraData(data, porextenso));
		
		

	}

}
