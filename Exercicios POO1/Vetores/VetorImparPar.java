import java.util.Scanner;

public class VetorImparPar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner (System.in);
		
		final int TAM = 20;
		
		int[] vetorNum = new int[TAM];
		int[] vetorPar = new int[TAM];
		int[] vetorImpar = new int[TAM];
		
		for (int x = 0; x < TAM; x++) {
			System.out.print((x + 1) + "° Número: ");
			vetorNum[x] = entrada.nextInt();
			
			if (vetorNum[x] % 2 == 0) {
				vetorPar[x] = vetorNum[x];
			}
			else {
				vetorImpar[x] = vetorNum[x];
			}
		}
		entrada.close();
		
		System.out.println("Numeros Digitados: ");
		for (int x = 0; x < TAM; x++) {
			System.out.print(vetorNum[x] + " | ");
		}
		
		System.out.println("\nPARES: ");
		for (int x = 0; x < TAM; x++) {
			if (vetorNum[x] % 2 == 0) {
				System.out.print(vetorPar[x] + " | ");
			}
		}
		
		System.out.println("\nIMPARES: ");
		for (int x = 0; x < TAM; x++) {
			if (vetorNum[x] % 2 == 1) {
				System.out.print(vetorImpar[x] + " | ");
			}
		}
	}
}
