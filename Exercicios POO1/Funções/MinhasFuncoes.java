package com.andre.funcoes;

import java.util.Collections;
import java.util.Random;
import java.util.List;

public class MinhasFuncoes {
	
	public static String escadaNumerica (int num) {
		StringBuilder saida = new StringBuilder();
		
		for (int x = 1; x <= num; x++) {
			for (int y = 1; y <= x; y++) {
				saida.append(x);
				saida.append(" | ");
			}
			saida.append("\n");
		}
		return saida.toString();
	}
	
	public static String escadaSequencial (int num) {
		StringBuilder saida = new StringBuilder();
		int contador = 0;
		
		for (int x = 1; x <= num; x++) {
			for (int y = 1; y <= x; y++) {
				contador += 1;
				saida.append(contador);
				saida.append(" | ");
			}
			saida.append("\n");
			contador = 0;
		}
		return saida.toString();
	}
	
	public static int somaTres (int num1, int num2, int num3) {
		int soma = num1 + num2 + num3;
		
		return soma;
	}
	
	public static String postivoOuNegativo (int num) {
		 String saida = "";
		if (num < 0 ) {
			saida = "N";
		}
		else {
			saida = "P";
		}
		return saida;
	}
	
	public static float calculaImposto (float imp, float val) {
		float saida = 0;
		float porcentagem = 0;
		
		porcentagem = imp / 100;
		porcentagem = porcentagem * val;
		saida = porcentagem + val; 
		
		return saida;
	}
	
	public static String mostraHora (int hr, int min) {
		StringBuilder saida = new StringBuilder();
		
		if (hr < 13) {
			saida.append("São: " + hr + ":" + min + " a.m");
		}
		else {
			hr = hr % 12;
			saida.append("São: " + hr + ":" + min + " p.m");
		}
		return saida.toString();
	}
	
	public static String valorPagamento (float val, int dia) {
		StringBuilder saida = new StringBuilder();
		float multa = 0;
		float atraso = 0;
		
			multa = val * 0.03f;
			atraso = val * 0.0001f;
			saida.append("Valor A Ser Pago: ");
			saida.append(val + multa + (atraso * dia));
			saida.append(" R$");
		
		return saida.toString();
	}
	
	public static int tamanhoDoNumero (int num) {
		String saida = "";
		saida = Integer.toString(num);
		
		return saida.length();
	}
	
	public static String numeroInverso (int num) {
		String saida = "";
		String inverte = "";
		saida = Integer.toString(num);
		
		for(int x = saida.length(); x > 0; x--) {
			inverte = inverte + saida.substring(x - 1, x);
		}
		
		saida = inverte;
		
		return saida;
	}
	
	public static int jogoCraps (int num) {
		Random gerador = new Random();
		int dado1 = 0;
		int dado2 = 0;
		int saida = 0;
		
		dado1 = gerador.nextInt(1,6);
		dado2 = gerador.nextInt(1,6);
			
		saida = dado1 + dado2;
				
		return saida;
	}
	
	public static String mostraData (String dat, String[] ext) {
		StringBuilder saida = new StringBuilder();
		
		ext = dat.split("/");
		saida.append("Hoje é ");
		
		for (int x = 0; x < 3; x++) {
			if (x == 0) {
				saida.append(ext[x]);
				saida.append(" Do Mês ");
			}
			
			if (x == 1) {
				saida.append(ext[x]);
				saida.append(" Do Ano ");
			}
			
			if (x == 2) {
				saida.append(ext[x]);
			}
		}
		
		return saida.toString();
	}
	
	public static String embaralhaPalavra(List<String> emb, String pal) {
		Collections.shuffle(emb);
		StringBuilder saida = new StringBuilder(pal.length());
		
		saida.append("=> ");
		
		for (String k : emb) {
	        saida.append(k);
		}
		
		return saida.toString();
	}
	
	public static String desenhaMoldura (int lin, int col) {
		String saida = "";
		
		for (int i = 0; i < lin; i++) {
			if (i == 0 ) {
				System.out.print("\nx");
			}
			
			System.out.print("---");
			
			if (i == (lin -1)) {
				System.out.print("x");
			}
			
		}
		
		for (int j = 0; j < col; j++) {
			for (int i = 0; i < lin; i++) {
				if (i == 0 ) {
					System.out.print("\n|");
				}
				else {
					System.out.print("   ");
				}
			
				if (i == (lin -1)) {
					System.out.print("   |");
				}
			}
		}
		
		for (int i = 0; i < lin; i++) {
			if (i == 0 ) {
				System.out.print("\nx");
			}
			
			System.out.print("---");
			
			if (i == (lin -1)) {
				System.out.print("x");
			}
			
		}
		return saida;
	}
	
	public static String vetOriginal(String[] vetor1, int tam) {
		StringBuilder saida = new StringBuilder();
		
		saida.append("Vetor Original:    ");
		for(int x = 0; x < tam; x++ ) {
			saida.append(" |" + vetor1[x] + "|");
		}
		return saida.toString();
	}
	
	public static String vetTrans(String[] vetor2, int tam) {
		StringBuilder saida = new StringBuilder();
		String[] vetTrans = new String[tam];
		
		saida.append("Vetor Transcrição: ");
		for(int x = 0; x < tam; x++ ) {
			if(vetor2[x].equalsIgnoreCase("A")) {
				vetTrans[x] = "U"; 
			}
			else if(vetor2[x].equalsIgnoreCase("T")) {
				vetTrans[x] = "A"; 
			}
			else if(vetor2[x].equalsIgnoreCase("G")) {
				vetTrans[x] = "C"; 
			}
			else if(vetor2[x].equalsIgnoreCase("C")) {
				vetTrans[x] = "G"; 
			}
			else {
				saida.append("");
			}
			saida.append(" |" + vetTrans[x] + "|");
		}
		return saida.toString();
	}
}

