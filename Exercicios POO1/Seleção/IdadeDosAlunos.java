import java.util.Scanner;

public class IdadeDosAlunos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.print("Idade 1° Aluno: ");
		int idade1 = entrada.nextInt();
		
		System.out.print("Idade 2° Aluno: ");
		int idade2 = entrada.nextInt();
		
		System.out.print("Idade 3° Aluno: ");
		int idade3 = entrada.nextInt();
		
		entrada.close();
		
		int media;
		
		media = (idade1 + idade2 + idade3) / 3;
		
		if (media < 25) {
			System.out.println("Média: " + media);
			System.out.println("Turma JOVEM");
		}
		else if (media < 25 || media <= 40 ) {
			System.out.println("Média: " + media);
			System.out.println("Turma ADULTA");
		}
		else if (media > 40 ) {
			System.out.println("Média: " + media);
			System.out.println("Turma IDOSA");
		}
	}
}
