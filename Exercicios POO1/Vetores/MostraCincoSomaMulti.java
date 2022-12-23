import java.util.Scanner;

public class MostraCincoSomaMulti {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner (System.in);
		
		final int TAM = 5;
		
		int[] vetor = new int [TAM];
		int soma = 0;
		int produto = 1;
		
		for (int x = 0; x < TAM; x++) {
			System.out.print((x + 1) + "° Número: ");
			vetor[x] = entrada.nextInt();
			soma = soma + vetor[x];
			produto = produto * vetor[x];
		}
		
		for (int x = 0; x < TAM; x++) {
			System.out.print(vetor[x] + " | ");
			
		}
		
		System.out.println("\nA Soma: " + soma);
		System.out.println("O Produto: " + produto);
		entrada.close();

	}

}
