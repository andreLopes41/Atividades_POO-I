import java.util.Scanner;

public class DigiteUmNumero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.print("Digite Um Número [Inteiro]: ");
		int numI = entrada.nextInt();
		System.out.print("O Número Digitado Foi: " + numI);
		
		entrada.close();
	}

}
