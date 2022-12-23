import java.util.Scanner;

public class PalavrasSeparadas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.print("Quant. De Palavras: ");
		int palavras = entrada.nextInt();
		
		String[] separar = new String[palavras];
		
		entrada.nextLine();
		
		for (int x = 0; x < palavras; x++) {
			System.out.print((x + 1) + "° Palavra[Press Enter]: ");
			separar[x] = entrada.nextLine();
		}
		System.out.println("Palavras Digitadas");
		
		for (int x = 0; x < palavras; x++) {
			System.out.print(separar[x] + " | ");
		}
		entrada.close();
		
	}

}
