import java.util.Scanner;

public class PesoIdealPart3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.print("Altura [m]: ");
		float altura = entrada.nextFloat();
		
		System.out.print("Peso [kg]: ");
		int peso = entrada.nextInt();
		
		entrada.nextLine();
		
		System.out.print("Sexo [F] Ou [M]: ");
		String sexo = entrada.nextLine();
		
		entrada.close();
		
		double pesoIdeal;
		
		pesoIdeal = 0;
		
		if (sexo.equals("F")) {
			
			pesoIdeal = (62.1 * altura) - 44.7;
			System.out.println("Altura: " + altura);
			System.out.println("Peso: " + peso);
			System.out.println("Sexo: Feminino");
			System.out.println("Peso Ideal: " + pesoIdeal);
		}
		
		if (sexo.equals("M")) {
			
			pesoIdeal = (72.7 * altura) - 58;
			System.out.println("Altura: " + altura);
			System.out.println("Peso: " + peso);
			System.out.println("Sexo: Masculino");
			System.out.println("Peso Ideal: " + pesoIdeal);
		}
		
		if ( peso > pesoIdeal) {
			System.out.println("Acima Do Peso Ideal");
		}
		
		if ( peso == pesoIdeal) {
			System.out.println("Está No Peso Ideal");
		}
		
		if ( peso < pesoIdeal) {
			System.out.println("Abaixo Do Peso Ideal");
		}
	}
}
