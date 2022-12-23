import java.util.Scanner;

public class MetrosParaCentimetros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.print("Informe Um Valor Em Metros: ");
		float valor = entrada.nextFloat();
		
		entrada.close();
		
		float resultado;
		
		resultado = valor * 100;
		
		System.out.print("O Valor Em Centimetros É: " + resultado + " cm");
	}

}
