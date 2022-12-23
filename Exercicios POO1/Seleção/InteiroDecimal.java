import java.util.Scanner;

public class InteiroDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite Um Número: ");
		double num = entrada.nextDouble();
		
		entrada.close();
		
		if (num == (int)num) {
			System.out.println("O Número é Inteiro: " + num);
		}
		else {
			num = Math.round(num);
			System.out.println("O Número é Decimal, [Arredondado]: " + num);
		}
	}
}
