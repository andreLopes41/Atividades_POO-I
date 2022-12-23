package com.objetos.orientacao.andre;

import java.util.Scanner;

public class SerHumanoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner (System.in);
		
		String nome = "";
		int idade = 0;
		int peso = 0;
		float altura = 0;
		int escolha = 0;
		
		do {
			System.out.println("Registrar Pessoa? \n[1] Sim  [0] Não");		
			escolha = entrada.nextInt();
			
			if (escolha < 0 || escolha > 1) {
				System.out.println("Opção Inválida");
			}
			
			else if (escolha == 1) {
				
				do {
					System.out.print("Seu Nome: ");
					nome = entrada.next();
					
					if (nome.length() < 3) {
						System.out.println("Digite Um Nome Válido");
					}
					
				}while(nome.length() < 3);
				
				entrada.nextLine();
				
				do {
					System.out.print("Idade: ");
					idade = entrada.nextInt();
					
					if (idade < 0 || idade > 200) {
						System.out.println("Digite Um Valor Aceitável");
					}
					
				}while(idade < 0 || idade > 200);
				
				do {
					System.out.print("Peso[Kg]: ");
					peso = entrada.nextInt();
					
					if (peso < 0 || peso > 250) {
						System.out.println("Digite Um Valor Aceitável");
					}
					
				}while(peso < 0 || peso > 250);
				
				do {
					System.out.print("Altura[m]: ");
					altura = entrada.nextFloat();
					
					if (altura < 0 || altura > 3) {
						System.out.println("Digite Um Valor Aceitável");
					}
					
				}while(altura < 0 || altura > 3);
				
				SerHumano pessoa = new SerHumano(nome, idade, peso, altura);
				
				System.out.println(pessoa);
				
				do {
					System.out.println("Alterar Alguma Medida? \n[1] Sim  [0] Não ");
					escolha = entrada.nextInt();
					
					if (escolha < 0 || escolha > 1) {
						System.out.println("Opção Inválida");
					}
					
					else if (escolha == 1) {
						System.out.println("[1] Envelhecer");
						System.out.println("[2] Engordar");
						System.out.println("[3] Emagrecer");
						System.out.println("[4] Crescer");
						System.out.println("[0] Sair");
						escolha = entrada.nextInt();
						
						if (escolha < 0 || escolha > 4) {
							System.out.println("Opção Inválida");
						}
						
						else if (escolha == 1) {
							do {
								System.out.print("Adicionar Idade: ");
								idade += entrada.nextInt();
								
								if (idade < 0 || idade > 200) {
									System.out.println("Digite Um Valor Aceitável");
								}
								
								idade = idade + pessoa.Envelhecer(idade);
								System.out.println(pessoa);
								
							}while(idade < 0 || idade > 200);
						}
						
						else if (escolha == 2) {
							do {
								System.out.print("Adicionar Peso: ");
								peso += entrada.nextInt();
								
								if (peso < 0) {
									System.out.println("Digite Um Valor Aceitável");
								}
								
								peso = peso + pessoa.Engordar(peso);
								System.out.println(pessoa);
								
							}while(peso < 0);
						}
						
						else if (escolha == 3) {
							do {
								System.out.print("Remover Peso: ");
								peso -= entrada.nextInt();
								
								if (peso < 0) {
									System.out.println("Digite Um Valor Aceitável");
								}
								
								peso = peso - pessoa.Emagrecer(peso);
								System.out.println(pessoa);
								
							}while(peso < 0);
						}
						
						else if (escolha == 4) {
							do {
								System.out.print("Crescer Altura: ");
								altura += entrada.nextFloat();
								
								if (altura < 0) {
									System.out.println("Digite Um Valor Aceitável");
								}
								
								altura = altura + pessoa.Crescer(altura);
								System.out.println(pessoa);
								
							}while(altura < 0);
						}
						else {
							System.out.println("Fim Das Modificações");
						}
					}
					
				}while(escolha !=0);
				escolha = 1;
			}
			
			else {
				System.out.println("Programa Encerrado");
			}
			
		}while(escolha !=0);
		
		entrada.close();
	}

}
