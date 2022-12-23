import java.util.Scanner;

public class VetorAlturaIdade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final int TAM = 5;
		
		Scanner entrada = new Scanner (System.in);
		
		boolean flagIdade = true;
		boolean flagAltura = true; 
		int maisVelho = 0;
		int maisNovo = 0;
		float maisAlto = 0;
		float maisBaixo = 0;
		int somaIdade = 0;
		float somaAltura = 0;
		int mediaIdade = 0;
		float mediaAltura = 0;
		
		int[] vetIdade = new int[TAM];
		float[] vetAltura = new float[TAM];
		
		for (int x = 0; x < TAM; x++) {
			System.out.println((x + 1) + "° Pessoa");
			System.out.print("Idade: ");
			vetIdade[x] = entrada.nextInt();
			System.out.print("Altura: ");
			vetAltura[x] = entrada.nextFloat();
			
			somaIdade = somaIdade + vetIdade[x];
			somaAltura = somaAltura + vetAltura[x];
			
			if (flagIdade) {
				flagIdade = false;
				maisVelho = vetIdade[x];
				maisNovo = vetIdade[x];
			}
			
			if (vetIdade[x] > maisVelho) {
				maisVelho = vetIdade[x];
			}
			
			if (vetIdade[x] < maisNovo) {
				maisNovo = vetIdade[x];
			}
			
			
			if (flagAltura) {
				flagAltura = false;
				maisAlto = vetAltura[x];
				maisBaixo = vetAltura[x];
			}
			
			if (vetAltura[x] > maisAlto) {
				maisAlto = vetAltura[x];
			}
			
			if (vetAltura[x] < maisBaixo) {
				maisBaixo = vetAltura[x];
			}
		}
		
		entrada.close();
		
		mediaIdade = somaIdade / TAM;
		mediaAltura = somaAltura / (float)TAM;
		
		for (int x = 4; x >= 0 ; x--) {
			System.out.println("\n" + (x + 1) + "° Pessoa ");
			System.out.print("Idade: " + vetIdade[x]);
			System.out.println(" | Altura: " + vetAltura[x]);
		}
		
		System.out.println("\nMais Velho: " + maisVelho);
		System.out.println("Mais Novo: " + maisNovo);
		System.out.println("Mais Alto: " + maisAlto);
		System.out.println("Mais Baixo: " + maisBaixo);
		System.out.println("Média Idade: " + mediaIdade);
		System.out.println("Média Altura: " + mediaAltura);
		
		for (int x = 4; x >= 0 ; x--) {
			if (vetIdade[x] > mediaIdade) {
				System.out.println((x + 1) + "° | Acima Da Média [Idade] ");
			}
			
			if (vetIdade[x] < mediaIdade) {
				System.out.println((x + 1) + "° | Abaixo Da Média [Idade] ");
			}
			
			if (vetAltura[x] > mediaAltura) {
				System.out.println((x + 1) + "° | Acima Da Média [Altura] ");
			}
			
			if (vetAltura[x] < mediaAltura) {
				System.out.println((x + 1) + "° | Abaixo Da Média [Altura] ");
			}
		}

	}

}
