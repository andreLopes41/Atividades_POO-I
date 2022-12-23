import java.util.Scanner;

public class PesoIdeal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.print("Informe Sua Altura [m]: ");
		float altura = entrada.nextFloat();
		
		entrada.close();
		
		double peso;
		
		peso = (72.7 * altura) - 58;
		
		System.out.print("O Seu Peso Ideal É: " + peso + " Kg");
	}

}
