import java.util.Scanner;

public class DiasDaSemana {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.print("Informe Um Número de [1] a [7]:");
		int numI = entrada.nextInt();
		
		entrada.close();
		
		if (numI < 1 || numI > 7) {
			System.out.println("Opção Inválida!");
		}
		else if (numI == 1) {
			System.out.println("Domingo");
		}
		else if (numI == 2) {
			System.out.println("Segunda-Feira");
		}
		else if (numI == 3) {
			System.out.println("Terça-Feira");
		}
		else if (numI == 4) {
			System.out.println("Quarta-Feira");
		}
		else if (numI == 5) {
			System.out.println("Quinta-Feira");
		}
		else if (numI == 6) {
			System.out.println("Sexta-Feira");
		}
		else if (numI == 7) {
			System.out.println("Sábado");
		}
	}

}
