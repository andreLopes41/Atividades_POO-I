import java.util.Scanner;

public class PanificadoraDeOntem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.print("Valor Do Pão: ");
		float valorPao = entrada.nextFloat();
		
		entrada.close();
		
		float soma = 0;
		float quantItens = 50;
		
		if (valorPao >= 0) {
			
			System.out.println("Panificadora Pão de Ontem - Tabela de preços");
			for (int x = 1; x <= quantItens; x++) {
				soma = soma + valorPao;
				
				System.out.println(x +"- R$ " + soma);
			}
		}
		else {
			System.out.println("Este Valor Não Pode!");
		}
	}
}
