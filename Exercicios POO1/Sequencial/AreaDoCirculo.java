import java.util.Scanner;

public class AreaDoCirculo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.print("Informe O Raio Do Círculo: ");
		float raio = entrada.nextFloat();
		
		entrada.close();
		
		double area;
		
		area = (raio * raio) * 3.14;
		
		System.out.print("A Área Do Círculo É: " + area);
	}

}
