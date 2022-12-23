import java.util.Scanner;

public class ParesImpares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner (System.in);
		
		int numPar = 0;
		int numImpar = 0;

		for (int x = 1; x <= 10; x++) {
			System.out.print(x + "º Número: ");
			int num = entrada.nextInt();
			
			if (num % 2 == 0) {
				numPar = numPar  + 1;
			}
			else {
				numImpar = numImpar + 1;
			}
		}
		entrada.close();
		
		System.out.println("Quantidaede De Pares: " + numPar);
		System.out.println("Quantidaede De Ímpares: " + numImpar);
	}

}
