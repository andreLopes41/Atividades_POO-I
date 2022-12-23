import java.util.Scanner;

public class MediaDoAlunoPart2 {

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
		
		if (media >= 0 && media <= 3.9) {
			System.out.println("Média: " + media);
			System.out.println("Aproveitamento: E");
		}
		else if (media >= 4 && media <= 5.9) {
			System.out.println("Média: " + media);
			System.out.println("Aproveitamento: D");
		}
		else if (media >= 6 && media <= 7.5) {
			System.out.println("Média: " + media);
			System.out.println("Aproveitamento: C");
		}
		else if (media >= 7.6 && media <= 8.9) {
			System.out.println("Média: " + media);
			System.out.println("Aproveitamento: B");
		}
		else if (media >= 9 && media <= 10) {
			System.out.println("Média: " + media);
			System.out.println("Aproveitamento: A");
		}
	}
}
