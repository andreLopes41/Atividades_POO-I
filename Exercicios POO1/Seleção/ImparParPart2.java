import java.util.Scanner;

public class ImparParPart2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner (System.in);

		System.out.print("Número A Converter [Inteiro]: ");
		int numI = entrada.nextInt();

		entrada.close();

		if ( numI % 2 == 0) {
			System.out.print("Número: PAR ");
		}
		
		else {
			System.out.print("Número: ÍMPAR ");
		}

	}

}
