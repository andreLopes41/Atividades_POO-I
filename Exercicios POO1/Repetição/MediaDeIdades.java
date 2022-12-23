import java.util.Scanner;

public class MediaDeIdades {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner (System.in);
		
		int mostrarIdade = 1;
		float idade;
		int contador = 0;
		float soma = 0;
		float media;
		
		System.out.println("Digite ZERO Para Sair [Após Serem Informadados DUAS Idades]");
		
		do {
			System.out.print(mostrarIdade + "° Idade: ");
			idade = entrada.nextFloat();
			
			if (idade < 1 && contador < 2) {
				System.out.println("Entrada Inválida!");
			}
			else if (idade < 1) {
				System.out.println("Entrada Inválida!");
			}
			if (idade >= 1) {
				mostrarIdade = mostrarIdade + 1;
				contador = contador + 1;
				soma = soma + idade;
			}
			
		}while (idade != 0 || contador < 2);
		
		entrada.close();
		
		media = soma / contador;
		
		if (media >= 0 && media < 25) {
			System.out.println("Turma JOVEM!");
		}
		else if (media >= 25 && media < 60) {
			System.out.println("Turma ADULTA!");
		}
		else if (media > 60) {
			System.out.println("Turma IDOSA!");
		}
		else {
			System.out.println("OPS!");
		}
		System.out.println("Média Das Idades: " + media);
	}
}
