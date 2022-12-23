import java.util.Scanner;

public class LadosDoTriangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.print("Medidda Do 1° Lado [cm]: ");
		float lado1 = entrada.nextFloat();
		
		System.out.print("Medidda Do 2° Lado [cm]: ");
		float lado2 = entrada.nextFloat();
		
		System.out.print("Medidda Do 3° Lado [cm]: ");
		float lado3 = entrada.nextFloat();
		
		entrada.close();
		
		if (lado1 == lado2 && lado1 == lado3 && lado2 == lado3) {
			System.out.println("Triãngulo: EQUILÁTERO");
		}
		else if (lado1 != lado2 && lado1 != lado3 && lado2 != lado3) {
			System.out.println("Triãngulo: ESCALENO");
		}
		else {
			System.out.println("Triãngulo: ISÓCELES");
		}
	}
}
