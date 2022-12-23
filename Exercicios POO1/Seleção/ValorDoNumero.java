import java.util.Scanner;

public class ValorDoNumero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.print(" Número A Ser Verificado [INTEIRO]: ");
		int numI = entrada.nextInt();
		
		entrada.close();
		
		if (numI < 0 ) {
			System.out.print("O Número " + numI + " é NEGATIVO!");
		}
		
		if (numI == 0) {
			System.out.print("O Número " + numI + " é Igual a ZERO!");
		}
		
		if (numI > 0) {
			System.out.print("O Número " + numI + " é POSITIVO!");
		}
	}

}
