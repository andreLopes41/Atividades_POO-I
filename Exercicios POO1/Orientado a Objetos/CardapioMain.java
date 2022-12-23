package com.objetos.orientacao.andre;

import java.util.Scanner;

public class CardapioMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int cod = 0;
		int quant = 0;
		int quantCod100 = 0;
		int quantCod101 = 0;
		int quantCod102 = 0;
		int quantCod103 = 0;
		int quantCod104 = 0;
		int quantCod105 = 0;
		
		Cardapio card = new Cardapio(quantCod100, quantCod101, quantCod102, quantCod103, quantCod104, quantCod105);
		
		System.out.println(card);
		
		Scanner entrada = new Scanner (System.in);
		
		do {
			System.out.print("Código: ");
			cod = entrada.nextInt();
			
			if (cod == 100) {
				
				do {
					System.out.print("Quantidade: ");
					quant = entrada.nextInt();
					
					if (quant < 1) {
						System.out.println("Favor Informar Uma Quantia Válida!");
					}
					else {
						quantCod100 = quantCod100 + quant;
					}
					
				}while(quant < 1);
			}
			
			else if (cod == 101) {
				
				do {
					System.out.print("Quantidade: ");
					quant = entrada.nextInt();
					
					if (quant < 1) {
						System.out.println("Favor Informar Uma Quantia Válida!");
					}
					else {
						quantCod101 = quantCod101 + quant;
					}
					
				}while(quant < 1);
			}
			
			else if (cod == 102) {
				
				do {
					System.out.print("Quantidade: ");
					quant = entrada.nextInt();
					
					if (quant < 1) {
						System.out.println("Favor Informar Uma Quantia Válida!");
					}
					else {
						quantCod102 = quantCod102 + quant;
					}
					
				}while(quant < 1);
			}
			
			else if (cod == 103) {
				
				do {
					System.out.print("Quantidade: ");
					quant = entrada.nextInt();
					
					if (quant < 1) {
						System.out.println("Favor Informar Uma Quantia Válida!");
					}
					else {
						quantCod103 = quantCod103 + quant;
					}
					
				}while(quant < 1);
			}
			
			else if (cod == 104) {
				
				do {
					System.out.print("Quantidade: ");
					quant = entrada.nextInt();
					
					if (quant < 1) {
						System.out.println("Favor Informar Uma Quantia Válida!");
					}
					else {
						quantCod104 = quantCod104 + quant;
					}
					
				}while(quant < 1);
			}
			else if (cod == 105) {
				
				do {
					System.out.print("Quantidade: ");
					quant = entrada.nextInt();
					
					if (quant < 1) {
						System.out.println("Favor Informar Uma Quantia Válida!");
					}
					else {
						quantCod105 = quantCod105 + quant;
					}
					
				}while(quant < 1);
			}
			
			else if (cod != 0) {
				System.out.println("Código Inválido");
			}
			
		}while(cod != 0);
		
		entrada.close();
		
		Cardapio conta = new Cardapio(quantCod100, quantCod101, quantCod102, quantCod103, quantCod104, quantCod105);
		
		System.out.println(conta.CachQuente());
		System.out.println(conta.BauSimp());
		System.out.println(conta.BauOvo());
		System.out.println(conta.Hambúrguer());
		System.out.println(conta.Cheeseburguer());
		System.out.println(conta.Refrigerante());
		System.out.println(conta.Total());
	}

}
