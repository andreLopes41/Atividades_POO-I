import java.util.Scanner;

public class TresVetoresIntercalados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner (System.in);
		
		final int TAM = 10;
		final int FIM = 20;
		
		int[] vetor1 = new int [TAM];
		int[] vetor2 = new int [TAM];
		int[] vetor3 = new int [FIM] ;
		
		System.out.println("1° Vetor");
		for (int x = 0; x < TAM; x++) {
			System.out.print("Número[" + (x + 1) +"]: ");
			vetor1[x] = entrada.nextInt();
		}
		
		System.out.println("2° Vetor");
		for (int x = 0; x < TAM; x++) {
			System.out.print("Número[" + (x + 1) +"]: ");
			vetor2[x] = entrada.nextInt();
		}
		
		System.arraycopy(vetor1, 0, vetor3, 0, TAM);
		System.arraycopy(vetor2, 0, vetor3, 10, TAM);
		
		System.out.println("Resultado [1° Vetor]");
		for (int x = 0; x < TAM; x++) {
			System.out.print(vetor1[x] + " | ");
		}
		
		System.out.println("\nResultado [2° Vetor]");
		for (int x = 0; x < TAM; x++) {
			System.out.print(vetor2[x] + " | ");
		}
		
		System.out.println("\nResultado [3° Vetor]");
		for (int x = 0; x < FIM; x++) {
			System.out.print(vetor3[x] + " | ");
		}
		
		entrada.close();

	}
}
