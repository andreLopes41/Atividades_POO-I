import java.util.Scanner;

public class SomaIntervaloNumerico {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.print("Início Do Intervalo: ");
		int inicio = entrada.nextInt();
		
		System.out.print("Fim Do Intervalo: ");
		int fim = entrada.nextInt();
		
		entrada.close();
		
		int soma = 0;
			
		if (fim > inicio) {
			
			System.out.println("Intervalo Entre [" + inicio + "] e [" + fim + "]");
			
			for (int x = inicio; x <= fim; x++) {
				soma = soma + x; 
				System.out.println(x);
				
			}
		}
		else if (inicio > fim) {
			
			System.out.println("Intervalo Entre [" + inicio + "] e [" + fim + "]");
			
			for (int x = inicio; x >= fim; x--) {
				soma = soma + x; 
				System.out.println(x);
			}
		}
		else {
			System.out.println("Não Existe Intervalo Entres Os Números Informados!");
		}
		System.out.println("A Soma Entre Os Números Foi: " + soma);
	}

}
