import java.util.Scanner;

public class CardapioLanchonete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner (System.in);
		
		int escolha = 0;
		int codigo = 0;
		int quantidade = 0;
		float codigo100 = 0;
		float codigo101 = 0;
		float codigo102 = 0;
		float codigo103 = 0;
		float codigo104 = 0;
		float codigo105 = 0;
		float total = 0;
		
		System.out.println("Especificação    | Código |   Preço");
		System.out.println(" Cachorro Quente |   100  |  R$ 1,20");
		System.out.println(" Bauru Simples   |   101  |  R$ 1,30");
		System.out.println(" Bauru com ovo   |   102  |  R$ 1,50 ");
		System.out.println(" Hambúrguer      |   103  |  R$ 1,20");
		System.out.println(" Cheeseburguer   |   104  |  R$ 1,30 ");
		System.out.println(" Refrigerante    |   105  |  R$ 1,00 ");
		
		do {
			System.out.print("Código: ");
			codigo = entrada.nextInt();
			
			if (codigo < 100 || codigo > 105) {
				System.out.println("Opção Não Computada!");
			}
			
			else if (codigo == 100) {
				System.out.print("Quant. Cachorro Quente: ");
				quantidade = entrada.nextInt();
				
				codigo100 = codigo100 + (quantidade * 1.20f);
			}
			
			else if (codigo == 101) {
				System.out.print("Quant. Bauru Simples: ");
				quantidade = entrada.nextInt();
				
				codigo101 = codigo101 + (quantidade * 1.30f);
			}
			
			else if (codigo == 102) {
				System.out.print("Quant. Bauru com ovo: ");
				quantidade = entrada.nextInt();
				
				codigo102 = codigo102 + (quantidade * 1.50f);
			}
			
			else if (codigo == 103) {
				System.out.print("Quant. Hambúrguer: ");
				quantidade = entrada.nextInt();
				
				codigo103 = codigo103 + (quantidade * 1.20f);
			}
			
			else if (codigo == 104) {
				System.out.print("Quant. Cheeseburguer: ");
				quantidade = entrada.nextInt();
				
				codigo104 = codigo104 + (quantidade * 1.30f);
			}
			
			else if (codigo == 105) {
				System.out.print("Quant. Refrigerante: ");
				quantidade = entrada.nextInt();
				
				codigo105 = codigo105 + (quantidade * 1);
			}
			
			System.out.println("[1] Continuar Comprando");
			System.out.println("[2] Finalizar Pedido");
			escolha = entrada.nextInt();
			
		}while (escolha == 1);
		
		entrada.close();
		
		total = codigo100 + codigo101 + codigo102 + codigo103 + codigo104 + codigo105;
			
		System.out.println("Valor Cachorro Quente: " + codigo100 + " R$");
		System.out.println("Valor Bauru Simples: " + codigo101 + " R$");
		System.out.println("Valor Bauru com ovo: " + codigo102 + " R$");
		System.out.println("Valor Hambúrguer: " + codigo103 + " R$");
		System.out.println("Valor Cheeseburguer: " + codigo104 + " R$");
		System.out.println("Valor Refrigerante: " + codigo105 + " R$");
		System.out.println("\nValor Total: " + total + " R$");
	}

}
