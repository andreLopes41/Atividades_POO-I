import java.util.Scanner;

public class HiperMercadoTabajara {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Tipos De Carne [Apenas Uma Escolha]");
		System.out.println("[1] Filé Duplo");
		System.out.println("[2] Alcatra");
		System.out.println("[3] Picanha");
		int tipoDeCarne = entrada.nextInt();
		
		double valorTotalFile;
		double valorTotalAlcatra;
		double valorTotalPicanha;
		double desconto;
		
		valorTotalFile = 0;
		valorTotalAlcatra = 0;
		valorTotalPicanha = 0;
		
		if (tipoDeCarne == 1) {
			System.out.println("Quantidade De Filé Para Comprar [kg]: ");
			double quantidadeFile = entrada.nextDouble();
			
			if (quantidadeFile <= 5) {
				valorTotalFile = quantidadeFile * 4.90;
			}
			else {
				valorTotalFile = quantidadeFile * 5.80;
			}
		}
		else if (tipoDeCarne == 2) {
			System.out.println("Quantidade De Alcatra Para Comprar [kg]: ");
			double quantidadeAlcatra = entrada.nextDouble();
			
			if (quantidadeAlcatra <= 5) {
				valorTotalAlcatra = quantidadeAlcatra * 5.90;
			}
			else {
				valorTotalAlcatra = quantidadeAlcatra * 6.80;
			}
		}
		else if (tipoDeCarne == 3) {
			System.out.println("Quantidade De Picanha Para Comprar [kg]: ");
			double quantidadePicanha = entrada.nextDouble();
			
			if (quantidadePicanha <= 5) {
				valorTotalPicanha = quantidadePicanha * 6.90;
			}
			else {
				valorTotalPicanha = quantidadePicanha * 7.80;
			}
		}
		if (tipoDeCarne == 1) {
			System.out.println("Cartão Tabajara?");
			System.out.println("[1] Sim");
			System.out.println("[2] Não");
			int cartao = entrada.nextInt();
			
			if (cartao == 1); {
				desconto = valorTotalFile *0.05;
				valorTotalFile = valorTotalFile - desconto;
			}
			System.out.println("Valor A Pagar: " + valorTotalFile + " R$");
		}
		else if (tipoDeCarne == 2) {
			System.out.println("Cartão Tabajara?");
			System.out.println("[1] Sim");
			System.out.println("[2] Não");
			int cartao = entrada.nextInt();
			
			if (cartao == 1); {
				desconto = valorTotalAlcatra *0.05;
				valorTotalAlcatra = valorTotalAlcatra - desconto;
			}
			System.out.println("Valor A Pagar: " + valorTotalAlcatra + " R$");
		}
		else if (tipoDeCarne == 3) {
			System.out.println("Cartão Tabajara?");
			System.out.println("[1] Sim");
			System.out.println("[2] Não");
			int cartao = entrada.nextInt();
			
			if (cartao == 1); {
				desconto = valorTotalPicanha *0.05;
				valorTotalPicanha = valorTotalPicanha - desconto;
			}
			System.out.println("Valor A Pagar: " + valorTotalPicanha + " R$");
		}
		entrada.close();
	}
}
