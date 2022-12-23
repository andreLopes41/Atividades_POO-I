import java.util.Scanner;

public class AreaDoQuadrado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.print("Largura Do Quadrado [cm]: ");
		float largura = entrada.nextFloat();
		
		System.out.print("Comprimento Do Quaadrado [cm]: ");
		float comprimento = entrada.nextFloat();
		
		entrada.close();
		
		float area;
		
		area = largura * comprimento;
		
		System.out.print("A Área Do Quadrado É: " + area + " cm");
	}

}
