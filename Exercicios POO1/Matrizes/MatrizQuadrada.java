import java.util.Scanner;

public class MatrizQuadrada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);

		int soma = 0;
		int maior = 0;
		int menor = 0;
		float media = 0;
		int linha = 0;
		int coluna = 0;
		int pares = 0;
		int impares = 0;
		int somaPrincipal = 0;
		int somaSecundaria = 0;
		int contador = 1;
		
		do {
			System.out.print("Tamanho Da Matriz Entre [3] e [11]: ");
			linha = entrada.nextInt();
			
			if (linha < 3 || linha > 11) {
				System.out.println("Digito Inválido!");
			}
		}while (linha < 3 || linha > 11);
		
		coluna = linha;

		int[][] matriz = new int[linha][coluna];

		for (int lin = 0; lin < linha; lin++) {
			for (int col = 0; col < coluna; col++) {
				System.out.print(contador + "° Número: ");
				matriz[lin][col] = entrada.nextInt();
				soma = soma + matriz [lin][col];
				contador = contador + 1;
				
				if (lin == col) {
					somaPrincipal = somaPrincipal + matriz[lin][col];
				}
				
				if (linha - 1 - lin == col) {
					somaSecundaria = somaSecundaria +  matriz[lin][col];
				}
				
				if (matriz[lin][col] % 2 == 0) {
					pares = pares + 1;
				}
				else {
					impares = impares + 1;
				}
	
				if (lin == 0 && col == 0){
					maior = matriz[lin][col];
					menor = matriz[lin][col];
				}
				else {
					
					if (maior < matriz[lin][col]) {
						maior = matriz[lin][col];
					}
						
					if (menor > matriz[lin][col]) {
						menor = matriz[lin][col];
					}
						
				}
			}
		}

		for (int lin = 0; lin < linha; lin++) {
			System.out.println();
			for (int col = 0; col < coluna; col++) 
				System.out.print(matriz[lin][col] + " | ");
		}


		media = soma / (float)(linha * coluna);
		System.out.println("\nMédia: " + media);
		System.out.println("Soma: " + soma);
		System.out.println("Soma Diagonal Principal: " + somaPrincipal);
		System.out.println("Soma Diagonal Secundária: " + somaSecundaria);
		System.out.println("Total De Pares: " + pares);
		System.out.println("Total De Impares: " + impares);
		System.out.println("Maior: " + maior);
		System.out.println("Menor: " + menor);

		entrada.close();

	}

}
