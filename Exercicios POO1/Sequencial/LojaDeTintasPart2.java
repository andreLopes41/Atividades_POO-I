import java.util.Scanner;

public class LojaDeTintasPart2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.print("Quantos Metros Quadrados A Ser Pintado: ");
		float area = entrada.nextFloat();
		
		entrada.close();
		
		float coberturaTinta;
		
		coberturaTinta = 6;
		
		float quantidadePorLata;
		
		quantidadePorLata = 18;
		
		float valorLata;
		
		valorLata = 80;
		
		double quantidadePorGalao;
		
		quantidadePorGalao = 3.6;
		
		float valorGalao;
		
		valorGalao = 25;
		
		float quantidadeLitros;
		
		quantidadeLitros = (area / coberturaTinta);
		
		float quantidadeLatas;
		
		quantidadeLatas = (quantidadeLitros / quantidadePorLata);
		
		float valorTotalLatas;
		
		valorTotalLatas = quantidadeLatas * valorLata;
		
		double quantidadeGaloes;
		
		quantidadeGaloes = (quantidadeLitros / quantidadePorGalao);
		
		double valorTotalGalao;
		
		valorTotalGalao = quantidadeGaloes * valorGalao;
		
		System.out.println("[LATAS] Será Necessário Comprar: " + quantidadeLatas +  " Lata(s) De Tinta");
		System.out.println("[LATAS] O Preço Total A Ser Pago É: " + valorTotalLatas + " R$");
		System.out.println("[GALÕES] Será Necessário Comprar: " + quantidadeGaloes +  " Galões(s) De Tinta");
		System.out.println("[GALÕES] O Preço Total A Ser Pago É: " + valorTotalGalao + " R$");
	}

}
