package com.andre.funcoes;

import java.util.Scanner;
import java.util.List;
import java.util.Arrays;

public class EmbaralhaPalavra {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.print("Palavra: ");
		String palavra = entrada.nextLine();
		
		entrada.close();
		
		List<String> embaralha = Arrays.asList(palavra.split(""));
		
		System.out.println(MinhasFuncoes.embaralhaPalavra(embaralha, palavra));
	}

}
