import java.util.Scanner;

public class MediaDoAlunoPart3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.print("1° Nota: ");
		float nota1 = entrada.nextFloat();
		
		System.out.print("2° Nota: ");
		float nota2 = entrada.nextFloat();
		
		System.out.print("3° Nota: ");
		float nota3 = entrada.nextFloat();
		
		entrada.close();
		
		float media;
		
		media = (nota1 + nota2 + nota3) / 3;
		
		if (media < 7) {
			System.out.println("Média: " + media);
			System.out.println("REPROVADO");
		}
		else if (media >= 7 && media < 9.9) {
			System.out.println("Média: " + media);
			System.out.println("APROVADO");
		}
		else if (media == 10) {
			System.out.println("Média: " + media);
			System.out.println("AROVADO com Distinção");
		}

	}

}
