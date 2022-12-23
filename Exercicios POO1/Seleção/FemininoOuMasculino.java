import java.util.Scanner;

public class FemininoOuMasculino {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.print(" Digite [F] ou [M]: ");
		String letra = entrada.nextLine();
		
		entrada.close();
		
		if (letra.equals("F")) {
			System.out.println("Gênero: FEMININO");
		}
		
		if (letra.equals("M")) {
			System.out.println("Gênero: MASCULINO");
		}
		
		else {
			System.out.println("Gênero: NÃO RECONHECIDO");
		}
	}
}
