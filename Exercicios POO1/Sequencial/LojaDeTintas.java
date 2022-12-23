import java.util.Scanner;

public class LojaDeTintas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.print("Quantos Metros Quadrados A Ser Pintado: ");
		float area = entrada.nextFloat();
		
		entrada.close();
		
		float coberturaTinta;
		
		coberturaTinta = 3;
		
		float quantidadePorLata;
		
		quantidadePorLata = 18;
		
		float valorLata;
		
		valorLata = 80;
		
		float quantidadeLitros;
		
		quantidadeLitros = (area / coberturaTinta);
		
		float quantidadeLatas;
		
		quantidadeLatas = (quantidadeLitros / quantidadePorLata);
		
		float valorTotal;
		
		valorTotal = quantidadeLatas * valorLata;
		
		System.out.println("Será Necessário Comprar: " + quantidadeLatas +  " Lata(s) De Tinta");
		System.out.println("O Preço Total A Ser Pago É: " + valorTotal + " R$");
	}

}
