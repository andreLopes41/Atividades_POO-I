import java.util.Scanner;
import java.util.Random;

public class CartelaLoteria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner (System.in);
		
		Random geraNum = new Random();
		
		final int COL = 6;
		 int lin = 0;
		
		System.out.print("Quant. Cartelas: ");
		lin = entrada.nextInt();
		
		for (int i = 0; i < lin; i++) {
			System.out.print(( i + 1) + "° Cartela");
			for (int j = 0; j < COL; j++) {
				System.out.print("  |  " + geraNum.nextInt(1,60) + "   |  ");
			}
			System.out.println();
		}
		
		entrada.close();
	}
}
