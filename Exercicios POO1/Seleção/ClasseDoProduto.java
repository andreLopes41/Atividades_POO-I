import java.util.Scanner;

public class ClasseDoProduto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.print("Preço De Custo: ");
		float valorProduto = entrada.nextFloat();
		
		System.out.print("Código Do Produto [1] a [8]: ");
		int codigo = entrada.nextInt();
		
		entrada.close();
		
		if (codigo < 1 || codigo > 8) {
			System.out.println("Origem Do Produto: Importado");
			System.out.println("Valor Do Produto: " + valorProduto + " R$");
		}
		else if (codigo == 1) {
			System.out.println("Origem Do Produto: SUL");
			System.out.println("Valor Do Produto: " + valorProduto + " R$");
		}
		else if (codigo == 2) {
			System.out.println("Origem Do Produto: NORTE");
			System.out.println("Valor Do Produto: " + valorProduto + " R$");
		}
		else if (codigo == 3) {
			System.out.println("Origem Do Produto: LESTE");
			System.out.println("Valor Do Produto: " + valorProduto + " R$");
		}
		else if (codigo == 4) {
			System.out.println("Origem Do Produto: OESTE");
			System.out.println("Valor Do Produto: " + valorProduto + " R$");
		}
		else if (codigo == 5 || codigo == 6) {
			System.out.println("Origem Do Produto: NORDESTE");
			System.out.println("Valor Do Produto: " + valorProduto + " R$");
		}
		else if (codigo == 7 || codigo == 8) {
			System.out.println("Origem Do Produto: CENTRO-OESTE");
			System.out.println("Valor Do Produto: " + valorProduto + " R$");
		}

	}

}
