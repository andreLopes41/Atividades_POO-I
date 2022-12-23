import java.util.Scanner;

public class VetorGrafico {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner (System.in);
		
		int tamanho = 0;
		
		do {
			System.out.print("Tamanho Do Vetor[0] a [20]: ");
			tamanho = entrada.nextInt();
			
			if ( tamanho < 0 || tamanho > 20) {
				System.out.println("Dado Inválido!");
			}
		}while ( tamanho < 0 || tamanho > 20);
		
		String[] vet = new String[tamanho];
		
		System.out.print(tamanho + ": ");
		for (int x = 0; x < tamanho; x++) {
			vet[x] = "#";
			System.out.print((vet[x] = "#"));
		}
		entrada.close();
		
	}
}
