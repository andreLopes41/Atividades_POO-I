import java.util.Scanner;

public class PesoIdealPart2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.print("Informe A Altura [Homem]: ");
		float alturaH = entrada.nextFloat();
		
		System.out.print("Informe A Altura [Mulher]: ");
		float alturaM = entrada.nextFloat();
		
		entrada.close();
		
		double pesoH;
		
		pesoH = (72.7 * alturaH) - 58;
		
		double pesoM;
		
		pesoM = (62.1 * alturaM) - 44.7;
		
		System.out.println("O Peso Ideal Masculino É: " + pesoH + " Kg");
		System.out.println("O Peso Ideal Feminino É: " + pesoM + " Kg");
	}

}
