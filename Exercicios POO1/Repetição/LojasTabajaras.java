import java.util.Scanner;

public class LojasTabajaras {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner (System.in);
		
		int escolha;
		int contador = 1;
		float valorProduto = 0;
		float soma = 0;
		float dinheiro = 0;
		float troco = 0;
		
		do {
			System.out.println("[1] Registar Compra ");
			System.out.println("[2] Sair Do Caixa ");
			escolha = entrada.nextInt();
			
			if (escolha < 1 || escolha > 2 ) {
				System.out.println("Ops! Selecione Novamente");
			}
			else if (escolha == 1) {
				System.out.println("Lojas Tabajara");
				do {
					System.out.print(contador + "° Produto: ");
					valorProduto = entrada.nextFloat();
					
					if (valorProduto < 0) {
						System.out.println("Valor Incorreto!");
					}
					soma = soma + valorProduto;
					contador = contador + 1;
					
				}while(valorProduto != 0 || valorProduto < 0);
				
				System.out.println("Valor Total: " + soma + " R$");
				
				System.out.print("Dinheiro: ");
				dinheiro = entrada.nextFloat();
				
				troco = dinheiro - soma;
				
				System.out.println("Troco: " + troco + " R$");
				
				if (troco < 0) {
					System.out.println("Cliente Em Dívida com: " + troco + " R$");
				}
				contador = 1;
				soma = 0;
				troco = 0;
			}
		}while (escolha !=2);
		
		System.out.println("Programa Finalizado!");
		
		entrada.close();
	}
}
