import java.util.Scanner;

public class VendasDeFrutas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.print("Quantidade De Morangos [kg]: ");
		double quantidadeMorango = entrada.nextDouble();
		
		System.out.print("Quantidade De Maçãs [kg]: ");
		double quantidadeMacas = entrada.nextDouble();
		
		entrada.close();
		
		double valorMorango;
		double valorMaca;
		double valorTotal;
		double quantidadeTotal;
		double desconto;
		
		valorTotal = 0;
		quantidadeTotal = 0;
		
		if (quantidadeMorango <= 5) {
			valorMorango = quantidadeMorango * 2.50;
		}
		else {
			valorMorango = quantidadeMorango * 2.20;
		}
		
		if (quantidadeMacas <= 5) {
			valorMaca = quantidadeMacas * 1.80;
		}
		else {
			valorMaca = quantidadeMacas * 1.50;
		}
		
		valorTotal = valorMorango + valorMaca;
		quantidadeTotal = quantidadeMorango + quantidadeMacas;
		
		if (quantidadeTotal > 8 || valorTotal > 25); {
			desconto = valorTotal * 0.10;
			valorTotal = valorTotal - desconto;
		}
		System.out.println("Valor Dos Morangos: " + valorMorango + " R$" );
		System.out.println("Valor Das Maçãs: " + valorMaca + " R$" );
		System.out.println("Valor Total [Com Desconto]: " + valorTotal + " R$" );
	}
}