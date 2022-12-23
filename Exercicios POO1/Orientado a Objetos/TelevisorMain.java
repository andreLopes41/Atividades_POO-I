package com.objetos.orientacao.andre;

import java.util.Scanner;

public class TelevisorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner (System.in);
		
		int canal = 24;
		int volume = 0;
		int escolha = 0;
		
		Televisor tv = new Televisor(canal, volume);
		
		do {
			System.out.println("Assistindo o Canal  || " + canal);
			System.out.println("Mudar Canal? \n[1] Sim  [0] Desligar Televisor ");
			escolha = entrada.nextInt();
			
			if (escolha < 0 || escolha > 1) {
				System.out.println("Opção Inválida");
			}
			
			else if (escolha == 1) {
				
				do {
					System.out.print("Canais Disponíveis [1 ao 31]: ");
					System.out.print("Mudar Para: ");
					canal = entrada.nextInt();
					
					if (canal < 1 || canal > 31) {
						System.out.println("Este Canal Não Existe");
					}
					
				}while(canal < 1 || canal > 31);
				
				canal = tv.Canal(canal);
				System.out.println("\nVolume Atual => " + volume);
				
				do {
					System.out.println("\nAlterar Volume? \n[1] Sim  [0] Não ");
					
					escolha = entrada.nextInt();
					
					if (escolha < 0 || escolha > 1) {
						System.out.println("Opção Inválida");
					}
					
					else if (escolha == 1) {
						System.out.println("[1] Aumentar Volume");
						System.out.println("[2] Diminuir Volume");
						System.out.println("[3] Manter Volume");
						escolha = entrada.nextInt();
						
						if (escolha < 0 || escolha > 3) {
							System.out.println("Opção Inválida");
						}
						
						else if (escolha == 1) {
							do {
								System.out.print("Volume: ");
								volume += entrada.nextInt();
								
								if (volume < 0 || volume > 100) {
									System.out.println("Volume Inválido!");
								}
								
								volume =  tv.AumentaVolume(volume);
								System.out.print("Volume Atual => " + volume);
								
							}while(volume < 0 || volume > 100);
						}
						
						else if (escolha == 2) {
							do {
								System.out.print("Diminuir Volume: ");
								volume -= entrada.nextInt();
								
								if (volume < 0 || volume > 100) {
									System.out.println("Volume Inválido!");
								}
								
								volume =  tv.DiminuiVolume(volume);
								System.out.print("Volume Atual => " + volume);
								
							}while(volume < 0 || volume > 100);
						}
						
						else if (escolha == 3) {
							escolha = 0;
						}
						
					}
				}while(escolha != 0);
				escolha = 1;
			}
	
		}while(escolha != 0);
		
		System.out.println("Televisor Desligado");
		
		entrada.close();
	}

}
