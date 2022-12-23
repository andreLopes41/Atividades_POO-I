import java.util.Scanner;

public class SequenciaFibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.print("Quantidade De Termos: ");
		int numTermos = entrada.nextInt();
		
		entrada.close();
		
		int aux = 1;
		int anterior = 0;
		int proximo;
		System.out.print(aux + "  ");
		
		for (int x = 0; x <= numTermos; x++) {
			proximo = anterior + aux;
			anterior = aux;
			aux = proximo;
			System.out.print(proximo + "  ");
		}

	}

}
