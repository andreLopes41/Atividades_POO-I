import java.util.Scanner;
public class NumeroImparPar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner (System.in);

		System.out.print("Número A Converter [Inteiro]: ");
		int numI = entrada.nextInt();

		entrada.close();

		if ( numI % 2 == 0) {
			numI = numI + 1;
			System.out.print("Número Convertido [Ímpar]: " + numI);
		}
		
		else {
			numI = numI -1;
			System.out.print("Número Convertido [Par]: " + numI);
		}
	}

}
