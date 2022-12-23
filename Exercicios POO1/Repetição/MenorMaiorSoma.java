import java .util.Scanner;

public class MenorMaiorSoma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner (System.in);
		
		int escolha;
		int menorNumero = 0;
		int maiorNumero = 0;
		int soma;
		int num;
		
		do {
			System.out.println("[1] Para Digitar");
			System.out.println("[0] Para Sair");
			escolha = entrada.nextInt();
			
			if ( escolha > 1 || escolha < 0 ) {
				System.out.println("Opção Inválida");
			}
			else if (escolha == 1) {
				System.out.println("Digite Um Número:");
				num = entrada.nextInt();
				if (maiorNumero == 0 && menorNumero == 0) {
					maiorNumero = num;
					menorNumero = num;
				}
				if (num > maiorNumero ) {
					maiorNumero = num;
				}
				if (num < menorNumero) {
					menorNumero = num;
				}
			}
		}while(escolha != 0);
		
		soma = menorNumero + maiorNumero;
		
		System.out.println("Menor Número: " + menorNumero);
		System.out.println("Maior Número: " + maiorNumero);
		System.out.println("Soma Entre Ambos: " + soma);
		
		entrada.close();
		
		
		
		

	}

}
