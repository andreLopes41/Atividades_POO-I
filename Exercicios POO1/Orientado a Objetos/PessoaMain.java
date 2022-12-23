package com.objetos.orientacao.andre;

import java.util.Scanner;

public class PessoaMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner (System.in);
		
		String nome = "";
		String sobreNome = "";
		
		do {
			System.out.print("Seu Nome: ");
			nome = entrada.next();
			
			if (nome.length() < 3) {
				System.out.println("Erro! Digite Novamente");
			}
			
		}while(nome.length() < 3);
		
		entrada.nextLine();
		
		do {	
			System.out.print("Seu SobreNome: ");
			sobreNome = entrada.next();
			
			if (sobreNome.length() < 3) {
				System.out.println("Erro! Digite Novamente");
			}
			
		}while(sobreNome.length() < 3);
		
		Pessoa nomeCompleto = new Pessoa(nome, sobreNome);
		
		entrada.close();
		
		System.out.println(nomeCompleto.toString());
	}

}
