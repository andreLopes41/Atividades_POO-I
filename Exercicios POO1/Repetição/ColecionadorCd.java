import java.util.Scanner;

public class ColecionadorCd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.print("Quantos CD'S Foram Comprados: ");
		float quantCds = entrada.nextFloat();
		
		float valorcd;
		float soma = 0;
		float media;
		
		if (quantCds > 0) {
		
			for (int x = 1; x <= quantCds; x++) {
	
				do {
					System.out.print("Valor Do " + x +"° CD: ");
					valorcd = entrada.nextFloat();
					
					if (valorcd < 1 ) {
						System.out.println("Este Valor Não Pode!");
					}
					
					soma = soma + valorcd;
		
				}while (valorcd < 1);
			}
			media = soma / quantCds;
			
			System.out.println("O Valor Médio Gasto Em Cada CD: " + media + " R$");
			System.out.println("O Valor Total Foi: " + soma + " R$");
		}
		else {
			System.out.println("O Programa Não Pode Ser Inicializado!");
		}
		entrada.close();
	}

}
