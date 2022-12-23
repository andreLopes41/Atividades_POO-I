import java.util.Scanner;

public class FatorialNumerico {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.print("Fatorar Número: ");
		int numFatorar = entrada.nextInt();
		
		entrada.close();
		
		int resultado = 1;
		
		for (int x = numFatorar; x >= 1; x--) {
			resultado = resultado * x;
			
			if ( x == 1) {
			 System.out.println(numFatorar + "! = " + resultado);	
			}
			
		}
	}

}
