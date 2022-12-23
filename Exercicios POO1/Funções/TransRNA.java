package com.andre.funcoes;

import java.util.Scanner;

public class TransRNA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner (System.in);
		int quantA = 0;
		int quantT = 0;
		int quantG = 0;
		int quantC = 0;
		int quantUU = 0;
		int quantAA = 0;
		int quantCC = 0;
		int quantGG = 0;
		
		System.out.print("Tamanho Da Cadeia: ");
		int tamanho = entrada.nextInt();
		
		entrada.nextLine();
		
		String[] vetOriginal = new String[tamanho];
		
		System.out.println("Letras: [A] [T] [G] [C]");
		for (int x = 0; x < tamanho; x++) {
			do {
				System.out.print((x + 1) + "° Letra: ");
				vetOriginal[x] = entrada.nextLine();
				
				if (!(vetOriginal[x].equalsIgnoreCase("A") || vetOriginal[x].equalsIgnoreCase("T") || vetOriginal[x].equalsIgnoreCase("G") || vetOriginal[x].equalsIgnoreCase("C"))) {
					System.out.println("Letra Inválida, Digite Novamente!");
				}
			}while(!(vetOriginal[x].equalsIgnoreCase("A") || vetOriginal[x].equalsIgnoreCase("T") || vetOriginal[x].equalsIgnoreCase("G") || vetOriginal[x].equalsIgnoreCase("C")));
	
		}
		entrada.close();
		
		System.out.println(MinhasFuncoes.vetOriginal(vetOriginal, tamanho));
		
		
		for(int x = 0; x < tamanho; x++) {
			
			if(vetOriginal[x].equalsIgnoreCase("A")) {
				quantA++;
			}
			else if (vetOriginal[x].equalsIgnoreCase("T")) {
				quantT++;
			}
			else if (vetOriginal[x].equalsIgnoreCase("G")) {
				quantG++;
			}
			else if (vetOriginal[x].equalsIgnoreCase("C")) {
				quantC++;
			}
		}
		
		System.out.println("\nQuant. (A): " + quantA);
		System.out.println("Quant. (T): " + quantT);
		System.out.println("Quant. (G): " + quantG);
		System.out.println("Quant. (C): " + quantC);
		
		System.out.println("\n" + MinhasFuncoes.vetTrans(vetOriginal, tamanho));
		
		for(int x = 0; x < tamanho; x++) {

			if(vetOriginal[x].equalsIgnoreCase("A")) {
				quantUU++;
			}
			else if (vetOriginal[x].equalsIgnoreCase("T")) {
				quantAA++;
			}
			else if (vetOriginal[x].equalsIgnoreCase("G")) {
				quantCC++;
			}
			else if (vetOriginal[x].equalsIgnoreCase("C")) {
				quantGG++;
			}
		}
		
		System.out.println("\nQuant. (U): " + quantUU);
		System.out.println("Quant. (A): " + quantAA);
		System.out.println("Quant. (C): " + quantCC);
		System.out.println("Quant. (G): " + quantGG);
	}

}
