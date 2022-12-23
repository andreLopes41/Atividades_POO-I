import java.util.Scanner;

public class LetraVogal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Digite Uma Letra [Minúsculo]: ");
		String letra = entrada.nextLine();
		
		entrada.close();
		
		if (letra.equals("a") || letra.equals("e") || letra.equals("i") || letra.equals("o") || letra.equals("u")) {
			System.out.println("É Uma VOGAL");
		}
		
		else {
			System.out.println("NÃO É Uma Vogal");
		}
	}
}
