import java.util.Scanner;

public class AprovadoOuReprovado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.print("1° Nota: ");
		float nota1 = entrada.nextFloat();
		
		System.out.print("2° Nota: ");
		float nota2 = entrada.nextFloat();
		
		entrada.close();
		
		float media;
		
		media = (nota1 + nota2) / 2;
		
		if (media >= 7) {
			System.out.println("Média: " + media);
			System.out.println("APROVADO");
		}
		
		else {
			System.out.println("Média: " + media);
			System.out.println("REPROVADO");
		}
	}
}
