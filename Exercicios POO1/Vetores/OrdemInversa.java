import java.util.Scanner;

public class OrdemInversa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner (System.in);
		
		final int TAM = 10;
		
		int[] vetor = new int [TAM];
		
		for (int x = 0; x < TAM; x++) {
			System.out.print((x + 1) + "° Número: ");
			vetor[x] = entrada.nextInt();
		}
		
		for (int x = 9; x >= 0; x--) {
			System.out.print(vetor[x] + " | ");
		}
		entrada.close();
	}
}
