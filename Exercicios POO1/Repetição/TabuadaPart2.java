import java.util.Scanner;

public class TabuadaPart2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.print("Número Da Tabuada: ");
		int tabuada = entrada.nextInt();
		
		System.out.print("Início Da Tabuada: ");
		int inicio = entrada.nextInt();
		
		System.out.print("Fim Da Tabuada: ");
		int fim = entrada.nextInt();
		
		if (inicio > fim) {			
			int aux = inicio;
			inicio = fim;
			fim = aux;
		}
			
		entrada.close();
		
		int resultado;
		
		for (int x = inicio; x <= fim; x++) {
			resultado = x * tabuada;
			System.out.println(tabuada + " x " + x + " = " + resultado);
		}	
	}
}
