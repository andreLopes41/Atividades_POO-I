import java.util.Scanner;

public class OlimpiadasIFC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		
		int linha = 0;
		final int COLUNA = 5;
		float somaTotal = 0;
		boolean flagSalto = true;
		float campeao = 0;
		float ultimo = 0;

		
		do {
			System.out.print("Quant. De Atletas: ");
			linha = entrada.nextInt();
			
			if (linha < 1) {
				System.out.println("Digito Inválido!");
			}
		}while (linha < 1);
		
		float[][] saltos = new float [linha][COLUNA];
		float [][] mediaSalto = new float [linha][COLUNA];
		

		for (int lin = 0; lin < linha; lin++) {
			System.out.println((lin + 1) + "° Atleta");
			for (int col = 0; col < COLUNA; col++) {
				System.out.print((col + 1) + "° Salto: ");
				saltos[lin][col] = entrada.nextFloat();
				somaTotal = somaTotal + mediaSalto[lin][col];
				
				mediaSalto[lin][col] = somaTotal /5;
				
				if (flagSalto) {
					flagSalto = false;
					ultimo = saltos[lin][col];
					campeao = saltos[lin][col];
				}
				
				if (saltos[lin][col] > campeao) {
					campeao = saltos[lin][col];
				}
				
				if (saltos[lin][col] < ultimo) {
					ultimo = saltos[lin][col];
				}
				
			}
		}
		
		entrada.close();
		
		
		for (int lin = 0; lin < linha; lin++) {
			System.out.println((lin + 1) + "° Atleta");
			for (int col = 0; col < COLUNA; col++) {
				System.out.print((col + 1) + "° Salto: " + saltos[lin][col]);
				System.out.println("\nMédia: " + mediaSalto[lin][col]);
				
			}
		}
		
		System.out.println("\nCampeão: " + campeao);
		System.out.println("\nÚltimo: " + ultimo);
	}

}
