import java.util.Scanner;

public class UmAteVinte {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner (System.in);

		int escolha;	
		
		do {	
			System.out.println("[1] Mostrar Verticalmente");
			System.out.println("[2] Mostrar Horizontalmente");
			escolha = entrada.nextInt();
		
			if (escolha < 1 || escolha > 2) {
				System.out.println("Opção Inválida");
			}
		
		}while (escolha < 1 || escolha > 2);
		
		if (escolha == 1) {
		
			for (int x = 1; x <= 20; x++) {
					System.out.println(x);
			}
		}
		else {
			for (int x = 1; x <= 20; x++) {
				
				if (x == 20) {
					System.out.print(x);
				}
				else {
					System.out.print(x + ",");	
				}
			}
		}
		entrada.close();
	}

}
