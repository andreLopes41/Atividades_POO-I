import java.util.Scanner;

public class DepartamentoMetereologico {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner (System.in);
		
		int quantTemperaturas;
		float temperatura;
		boolean flag1 = true;
		boolean flag2 = true;
		float menorTemp = 0;
		float maiorTemp = 0;
		float soma = 0;
		float media;
	
		System.out.print("Quantas Temperaturas Serão Informadas: ");
		quantTemperaturas = entrada.nextInt();
			
		for (int x = 1; x <= quantTemperaturas; x++) {
			System.out.print(x + "º Temperatura: ");
			temperatura = entrada.nextFloat();
			
			if (flag1) {
				flag1 = false;
				menorTemp = temperatura;
			}
			
			if (flag2) {
				flag2 = false;
				maiorTemp = temperatura;
			}
			
			if (temperatura > maiorTemp) {
				maiorTemp = temperatura;
			}
			
			if (temperatura < menorTemp) {
				menorTemp = temperatura;
			}
			
			soma = soma + temperatura;
		}
		
		media = soma / quantTemperaturas;
		
		entrada.close();

		System.out.println("A Menor Temperatura Foi: " + menorTemp + " °C");
		System.out.println("A Maior Temperatura Foi: " + maiorTemp + " °C");
		System.out.println("A Média De Temperaturas Foi: " + media + " °C");

	}

}
