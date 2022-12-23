import java.util.Scanner;

public class PostoDeGasolina {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Quantidade De Litros: ");
		double litros = entrada.nextDouble();
		
		entrada.nextLine();
		
		System.out.println("[A] Álcool");
		System.out.println("[G] Gasolina");
		String escolha = entrada.nextLine();
		
		entrada.close();
		
		double valorParaPagar;
		double desconto;
		
		valorParaPagar = 0;
		
		if (escolha.equals("A")) {
			valorParaPagar = litros * 1.90;
			
			if (litros < 20) {
				desconto = valorParaPagar * 0.03;
				valorParaPagar = valorParaPagar - desconto;
			}
			else {
				desconto = valorParaPagar * 0.05;
				valorParaPagar = valorParaPagar - desconto;
			}
		}
		else if (escolha.equals("G")) {
			valorParaPagar = litros * 2.50;
			
			if (litros < 20) {
				desconto = valorParaPagar * 0.04;
				valorParaPagar = valorParaPagar - desconto;
			}
			else {
				desconto = valorParaPagar * 0.06;
				valorParaPagar = valorParaPagar - desconto;
			}
		}
		if (escolha.equals("A") || escolha.equals("G")) {
			System.out.println("Valor A Ser Pago: " + valorParaPagar + " R$" );
		}
		else {
			System.out.println("Opção Inválida");
		}
	}
}
