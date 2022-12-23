import java.util.Scanner;

public class QuatroNotas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner (System.in);
		
		final int TAM = 4;
		int soma = 0;
		float media = 0;
		
		int[] vetor = new int [TAM];
		
		for (int x = 0; x < TAM; x++) {
			System.out.print((x + 1) + "° Nota: ");
			vetor[x] = entrada.nextInt();
			
			soma = soma + vetor[x];
		}
		entrada.close();
		
		media = soma / (float)TAM;
		
		System.out.println("A Média Foi: " + media);
	}

}
