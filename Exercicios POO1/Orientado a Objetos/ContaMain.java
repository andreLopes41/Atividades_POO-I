package com.objetos.orientacao.andre;

import java.util.Scanner;

public class ContaMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		
		float valor = 0;
		String numConta;
		String nome;
		float saldo = 0;
		int escolha = 0;
		
		do {
			System.out.println("Criar Conta? \n[1] Sim  [0] Não");		
			escolha = entrada.nextInt();
			
			if (escolha < 0 || escolha > 1) {
				System.out.println("Opção Inválida");
			}
			
			else if (escolha == 1) {
		
				do {
					System.out.print("Número Da Conta [Min 3 Digitos]: ");
					numConta = entrada.next();
					
					if (numConta.length() < 3) {
						System.out.println("Conta Inválida");
					}
					
				}while(numConta.length() < 3);
		
				do {
					System.out.print("Nome [Min 4 Digitos]: ");
					nome = entrada.next();
					
					if (nome.length() < 4) {
						System.out.println("Nome Inválido");
					}
					
				}while(nome.length() < 4);
				
				do {
					System.out.print("Saldo[R$]: ");
					saldo = entrada.nextFloat();
					
					if (saldo < 0) {
						System.out.println("Saldo Inválida");
					}
					
				}while(saldo < 0);
				
				Conta conta = new Conta (numConta, nome, saldo, valor);
				
				System.out.print(conta.Incluir(numConta, nome, saldo));
				
				do {
					System.out.println("\nRealizar Alguma Operação? \n[1] Sim  [0] Não ");
					escolha = entrada.nextInt();
					
					if (escolha < 0 || escolha > 1) {
						System.out.println("Opção Inválida");
					}
					
					else if (escolha == 1) {
						System.out.println("[1] Alterar Nome");
						System.out.println("[2] Depositar");
						System.out.println("[3] Sacar");
						System.out.println("[0] Sair");
						escolha = entrada.nextInt();
						
						if (escolha < 0 || escolha > 3) {
							System.out.println("Opção Inválida");
						}
						
						else if (escolha == 1) {
							do {
								System.out.print("Alterar Nome: ");
								nome = entrada.next();
								
								if (nome.length() < 4) {
									System.out.println("Nome Inválido");
								}
								
								else {
									System.out.println(conta.AlterarNome(nome));							
								System.out.println(conta.Incluir(numConta, nome, saldo));
								}
								
							}while(nome.length() < 4);
						}
						
						else if (escolha == 2) {
							do {
								System.out.print("Depositar: ");
								valor += entrada.nextFloat();
								
								if (valor < 0) {
									System.out.println("Digite Um Valor Aceitável");
								}
								
								else {
									saldo =  saldo + conta.Deposito(valor);
								System.out.println(conta.Incluir(numConta, nome, saldo));
								}
		
							}while(valor < 0);
						}
						
						else if (escolha == 3) {
							do {
								System.out.print("Sacar: ");
								valor = entrada.nextFloat();
								
								if (valor > saldo) {
									System.out.println("A Conta Não Possui Esta Quantia Para Sacar");
								}
								
								else {
									saldo = saldo - conta.Sacar(valor);
								System.out.println(conta.Incluir(numConta, nome, saldo));
								}
							
							}while(valor > saldo);
						}
						
						else {
							System.out.println("Fim Da Transação");
						}
					}
				}while(escolha !=0);
				escolha = 1;
			}
			
			else {
				System.out.println("Programa Encerrado");
			}
			
		}while(escolha != 0);
		
		entrada.close();
	}
	
}
