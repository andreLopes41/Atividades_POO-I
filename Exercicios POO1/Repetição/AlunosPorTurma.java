import java.util.Scanner;

public class AlunosPorTurma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.print("Quantas Turmas Há Na Escola: ");
		int quantTurmas = entrada.nextInt();
		
		int quantAlunos;
		int soma = 0;
		int media;
		
		if (quantTurmas > 0) {
		
			for (int x = 1; x <= quantTurmas; x++) {
	
				do {
					System.out.print("Quantos Alunos Há Na " + x +"° Turma: ");
					quantAlunos = entrada.nextInt();
					
					if (quantAlunos < 1 ) {
						System.out.println("Alunos Insuficientes");
					}
					else if (quantAlunos > 40) {
						System.out.println("Capacidade Excedida");
					}
					
					soma = soma + quantAlunos;
		
				}while (quantAlunos < 1 || quantAlunos > 40);
			}
			media = soma / quantTurmas;
			
			System.out.println("A Média Por Turma É: " + media + " Aluno(s)");
		}
		else {
			System.out.println("O Programa Não Pode Ser Inicializado!");
		}
		entrada.close();
	}
}
