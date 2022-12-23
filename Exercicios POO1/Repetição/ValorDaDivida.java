import java.util.Scanner;

public class ValorDaDivida {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner (System.in);
		
		float valorDivida = 0;
		float valorDivida3 = 0;
		float valorDivida6 = 0;
		float valorDivida9 = 0;
		float valorDivida12 = 0;
		int quantParcelas = 0;
		float valorJuros = 0;
		float valorParcela = 0;
		
		do {
			
			System.out.print("Valor Da Dívida [R$]: ");
			valorDivida = entrada.nextFloat();
			
			if (valorDivida < 1) {
				System.out.println("Valor Não Permitido!");
			}
		}while(valorDivida < 1);
		
		entrada.close();
		
		for(quantParcelas = 1; quantParcelas <= 12; quantParcelas++) {
			
			if (quantParcelas == 1) {
				valorParcela = valorDivida;
				System.out.println("Valor Dívida | Valor Juros | Quant. Parcelas | Valor Parcela");
				System.out.println(valorDivida + "               " + valorJuros + "          " + quantParcelas + "              " + valorParcela );
			}
			
			else if (quantParcelas == 3) {
				valorJuros = valorDivida *0.10f;
				valorDivida3 = valorDivida + valorJuros;
				valorParcela = valorDivida3 / quantParcelas;
				System.out.println(valorDivida3 + "              " + valorJuros + "         " + quantParcelas + "             " + valorParcela );
			}
			
			else if (quantParcelas == 6) {
				valorJuros = valorDivida *0.15f;
				valorDivida6 = valorDivida + valorJuros;
				valorParcela = valorDivida6 / quantParcelas;
				System.out.println(valorDivida6 + "              " + valorJuros + "         " + quantParcelas + "             " + valorParcela );
			}
			
			else if (quantParcelas == 9) {
				valorJuros = valorDivida *0.20f;
				valorDivida9 = valorDivida + valorJuros;
				valorParcela = valorDivida9 / quantParcelas;
				System.out.println(valorDivida9 + "              " + valorJuros + "         " + quantParcelas + "             " + valorParcela );
			}
			
			else if (quantParcelas == 12) {
				valorJuros = valorDivida *0.25f;
				valorDivida12 = valorDivida + valorJuros;
				valorParcela = valorDivida12 / quantParcelas;
				System.out.println(valorDivida12 + "              " + valorJuros + "         " + quantParcelas + "             " + valorParcela );
			}
		}
	}
}
