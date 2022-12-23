import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.print("Número Da Tabuada: ");
		int tabuada = entrada.nextInt();
			
		entrada.close();
		
		int resultado;
		
		for (int x = 1; x <= 10; x++) {
			resultado = x * tabuada;
			System.out.println(x + " x " + tabuada + " = " + resultado);
		}
	}

}
