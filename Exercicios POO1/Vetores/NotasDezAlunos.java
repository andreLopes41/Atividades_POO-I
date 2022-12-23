import java.util.Scanner;

public class NotasDezAlunos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner (System.in);
		
		final int TAM = 10;
		
		float[] vetor = new float [TAM];
		float[] vetorMedia = new float [TAM];
		float soma = 0;
		int numMaiorSete = 0;
		
		for (int x = 0; x < TAM; x++) {
			System.out.println( "**Aluno " + (x + 1) + " **");
			soma = 0;
			for (int y = 0; y < 4; y++) {
				System.out.print((y + 1) + "° Nota: ");
				vetor[y] = entrada.nextInt();
				soma = soma + vetor[y];
			}
			vetorMedia[x] = soma / 4;
			 
			if (vetorMedia[x] >= 7) {
				numMaiorSete = numMaiorSete + 1;
			}
		}
		entrada.close();
		System.out.println("Foram " + numMaiorSete + " Alunos Com Média Maior Ou Igual a Sete");
		
		for (int x = 0; x < TAM; x++) {
			if (vetorMedia[x] >= 7) {
				System.out.println("O " + (x + 1) + "° Aluno Foi Com A Média: " + vetorMedia[x]);
			}
		}
	}
}
