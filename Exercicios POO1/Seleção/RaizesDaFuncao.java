import java.util.Scanner;
public class RaizesDaFuncao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.print("Coeficiente A: ");
		double coefA = entrada.nextDouble();
		
		if (coefA == 0) {
			System.out.println("A Equação Não É do 2 Grau");
		}
		else if (coefA != 0) { 
			System.out.print("Coeficiente B: ");
			double coefB = entrada.nextDouble();
			
			System.out.print("Coeficiente C: ");
			double coefC = entrada.nextDouble();
			
			double delta;
			
			delta = (coefB * coefB) - (4 * coefA * coefC);
			
			double raiz1;
			
			raiz1 = ((-coefB) + Math.sqrt(delta)) / (2 * coefA);
			
			double raiz2;
			
			raiz2 = ((-coefB) - Math.sqrt(delta)) / (2 * coefA);
			
			if (delta < 0) {
				System.out.println("A Equação Não Possui Raízes Reais");
			}
			else if (delta == 0) {
				System.out.println("Delta: " + delta);
				System.out.println("A Equação Possui Apenas Uma Raiz");
				System.out.println("x1: " + raiz1);
			}
			else {
				System.out.println("Delta: " + delta);
				System.out.println("x1: " + raiz1);
				System.out.println("x2: " + raiz2);
			}
		}
		entrada.close();
	}
}
