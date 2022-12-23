import java.util.Scanner;

public class BaseExpoente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.print("Número Da Base: ");
		int base = entrada.nextInt();
		
		System.out.print("Número Expoente: ");
		int expoente = entrada.nextInt();
		
		entrada.close();
		
		int resultado = 0;
		resultado = base * base;
		
		for (int x = 2; x < expoente; x++) {
			resultado = resultado * base;
		}
		System.out.println("O Resultado Da Potência é: " + resultado);
	}

}
