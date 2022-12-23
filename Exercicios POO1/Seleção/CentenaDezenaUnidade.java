import java.util.Scanner;

public class CentenaDezenaUnidade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.print("Numero Inteiro [1 a 999]: ");
		int numI = entrada.nextInt();
		
		entrada.close();
		
		if (numI < 1 || numI > 999) {
			System.out.println("Número Inválido");
		}
		else {
			int centena;
			
			centena = numI / 100;
			
			int dezena;
			
			dezena = (numI % 100) / 10;
			
			int unidade;
			
			unidade = (numI % 100) % 10;
			
			System.out.println("Centena: " + centena);
			System.out.println("Dezena: " + dezena);
			System.out.println("Unidade: " + unidade);
		}
	}
}
