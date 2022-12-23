import java.util.Scanner;

public class ColegioAluno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		
		int linha = 0;
		final int COLUNA = 2;
		float somaTotal = 0;
		float mediaGeral = 0;
		boolean flagNota = true;
		float maiorNota = 0;
		float menorNota = 0;
		String nomeMenorNota = "";
		String nomeMaiorNota = "";
		boolean flagMedia = true;
		float maiorMedia = 0;
		float menorMedia = 0;
		String nomeMenorMedia = "";
		String nomeMaiorMedia = "";
		
		do {
			System.out.print("Quant. De Alunos: ");
			linha = entrada.nextInt();
			
			if (linha < 1) {
				System.out.println("Digito Inválido!");
			}
		}while (linha < 1);
		
		String[] nomeAluno = new String [linha];
		float[][] notas = new float [linha][COLUNA];
		float [][] somaNota = new float [linha][COLUNA];
		float [][] mediaAluno = new float [linha][COLUNA];
		

		for (int lin = 0; lin < linha; lin++) {
			entrada.nextLine();
			System.out.print("Nome Do " + (lin + 1) + "° Aluno:");
			nomeAluno[lin] = entrada.nextLine();
			for (int col = 0; col < COLUNA; col++) {
				System.out.print((col + 1) + "° Nota: ");
				notas[lin][col] = entrada.nextFloat();
				somaTotal = somaTotal + somaNota[lin][col];
				
				if (flagNota) {
					flagNota = false;
					maiorNota = notas[lin][col];
					menorNota = notas[lin][col];
					nomeMaiorNota = nomeAluno[lin];
					nomeMenorNota = nomeAluno[lin];
				}
				
				if (notas[lin][col] > maiorNota) {
					maiorNota = notas[lin][col];
					nomeMaiorNota = nomeAluno[lin];
				}
				
				if (notas[lin][col] < menorNota) {
					menorNota = notas[lin][col];
					nomeMenorNota = nomeAluno[lin];
				}
				
				somaNota[lin][col] = somaNota[lin][col] + notas[lin][col];
				mediaAluno[lin][col] = somaNota[lin][col] /2;
				
				if (flagMedia) {
					flagMedia = false;
					maiorMedia = mediaAluno[lin][col];
					menorMedia = mediaAluno[lin][col];
					nomeMaiorMedia = nomeAluno[lin];
					nomeMenorMedia = nomeAluno[lin];
				}
				
				if (mediaAluno[lin][col] > maiorMedia) {
					maiorMedia = mediaAluno[lin][col];
					nomeMaiorMedia = nomeAluno[lin];
				}
				
				if (mediaAluno[lin][col] < menorMedia) {
					menorMedia = mediaAluno[lin][col];
					nomeMenorMedia = nomeAluno[lin];	
				}
			}
		}
		
		entrada.close();
		
		mediaGeral = somaTotal / (float)COLUNA * linha;
		
		
		for (int lin = 0; lin < linha; lin++) {
			System.out.println("Aluno: " + nomeAluno[lin]);
			for (int col = 0; col < COLUNA; col++) {
				System.out.print((col + 1) + "° Nota: " + notas[lin][col]);
				if (mediaAluno[lin][col] < mediaGeral) {
					System.out.println("\nAluno: " + nomeAluno[lin] + " Está Abaixo Da Média!");
				}
				
				if (mediaAluno[lin][col] > mediaGeral) {
					System.out.println("\nAluno: " + nomeAluno[lin] + " Está Acima Da Média!");
				}
			}
			
		}
		
		System.out.println("\nMenor Nota: " + menorNota + " Do Aluno " + nomeMenorNota);
		System.out.println("Maior Nota: " + maiorNota + " Do Aluno " + nomeMaiorNota);
		
		System.out.println("\nMenor Média: " + menorMedia + " Do Aluno " + nomeMenorMedia);
		System.out.println("Maior Média: " + maiorMedia + " Do Aluno " + nomeMaiorMedia);
	}
}
