import java.util.Scanner;

public class EstatisticaDasCidades {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner (System.in);
		
		boolean flag = true;
		int codigo = 0;
		int numVeiculos = 0;
		int numAcidentes = 0;
		int maiorAcidente = 0;
		int codigoMaiorAcidente = 0;
		int menorAcidente = 0;
		int codigoMenorAcidente = 0;
		int mediaVeiculos = 0;
		int mediaAcidentes = 0;
		
		for (int x = 1; x <= 5; x++) {
			System.out.print("Código Da " + x + "° Cidade: ");
			codigo = entrada.nextInt();
			
			System.out.print("Número De Veículos " + x + "° Cidade: ");
			numVeiculos = entrada.nextInt();
			
			System.out.print("Acidentes De Trânsito Da " + x + "° Cidade: ");
			numAcidentes = entrada.nextInt();
			
			if (numAcidentes < menorAcidente) {
				menorAcidente = numAcidentes;
				codigoMenorAcidente = codigo;
			}
			if (numAcidentes > maiorAcidente) {
				maiorAcidente = numAcidentes;
				codigoMaiorAcidente = codigo;
			}
			
			if (flag) {
				flag = false;
				menorAcidente = numAcidentes;
				codigoMenorAcidente = codigo;
				maiorAcidente = numAcidentes;
				codigoMaiorAcidente = codigo;
			}
			
			mediaVeiculos = mediaVeiculos + numVeiculos;
			
			if (numVeiculos < 2000 ) {
				mediaAcidentes = mediaAcidentes + numAcidentes;
			}
			
		}
		entrada.close();
		
		mediaVeiculos = mediaVeiculos / 5;
		mediaAcidentes = mediaAcidentes /5;
		
		System.out.println("Código: " + codigoMenorAcidente + "Menor Índice De Acidentes De Transito: " + menorAcidente + " Acidentes");
		System.out.println("Código: " + codigoMaiorAcidente +"Maior Índice De Acidentes De Transito: " + maiorAcidente + " Acidentes");
		System.out.println("Média De Veículos: " + mediaVeiculos + " Veículos");
		System.out.println("Média De Acidentes: " + mediaAcidentes + " Acidentes");
	}

}
