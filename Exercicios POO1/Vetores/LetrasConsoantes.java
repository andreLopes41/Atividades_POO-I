import java.util.Scanner;

public class LetrasConsoantes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner (System.in);
		
		String[] vetor = new String[10]; 
		int quantasConsoantes = 0;
		
		for (int x = 0; x < 10; x++) {
			System.out.print((x + 1) + "° Letra: ");
			vetor[x] = entrada.nextLine();
			
			if (!(vetor[x].equalsIgnoreCase("A") || vetor[x].equalsIgnoreCase("E") || vetor[x].equalsIgnoreCase("I") || vetor[x].equalsIgnoreCase("O")|| vetor[x].equalsIgnoreCase("U"))) {
				quantasConsoantes = quantasConsoantes + 1;
			}
		}
		
		entrada.close();
		
		System.out.println("Houveram: " + quantasConsoantes + " Consoantes");
		
		for (int x = 0; x < 10; x++) {
			if (!(vetor[x].equalsIgnoreCase("A") || vetor[x].equalsIgnoreCase("E") || vetor[x].equalsIgnoreCase("I") || vetor[x].equalsIgnoreCase("O")|| vetor[x].equalsIgnoreCase("U"))) {
				System.out.print(vetor[x] + " | ");
			}
		}
	}

}
