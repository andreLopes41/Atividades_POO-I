import java.util.Scanner;

public class IdadeAlturaAlunos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner (System.in);
		
		final int TAM = 4;
		int somaIdade = 0;
		float somaAltura = 0;
		int mediaIdade = 0;
		float mediaAltura = 0;
		int alturaInferior = 0;
		
		int[] vetIdade = new int[TAM];
		float[] vetAltura = new float[TAM];
		
		for (int x = 0; x < TAM; x++) {
			System.out.println((x + 1) + "° Aluno");
			System.out.print("Idade: ");
			vetIdade[x] = entrada.nextInt();
			System.out.print("Altura: ");
			vetAltura[x] = entrada.nextFloat();
			
			somaIdade = somaIdade + vetIdade[x];
			somaAltura = somaAltura + vetAltura[x];
		}
		
		entrada.close();
		
		mediaIdade = somaIdade / TAM;
		mediaAltura = somaAltura / (float)TAM;
		
		for (int x = 0; x < TAM; x++) {
			if (vetAltura[x] < mediaAltura && vetIdade[x] > 13 ) {
				alturaInferior = alturaInferior + 1;
			}	
		}
		
		System.out.println("Ao Total São " + alturaInferior + " Aluno(s) ");
		System.out.println("\nMédia Idade: " + mediaIdade);
		System.out.println("Média Altura: " + mediaAltura);
	}

}
