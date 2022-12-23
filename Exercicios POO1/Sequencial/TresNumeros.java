import java.util.Scanner;

public class TresNumeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.print("1° Número Inteiro: ");
		int numI1 = entrada.nextInt();
		
		System.out.print("2° Número Inteiro: ");
		int numI2 = entrada.nextInt();
		
		System.out.print("Número Real: ");
		float numF3 = entrada.nextFloat();
		
		entrada.close();
		
		int produto;
		
		produto = (numI1 + numI1) * (numI2 /2);
		
		float soma;
		
		soma = (numI1 * 3) + numF3;
		
		float aocubo;
		
		aocubo = (numF3 * numF3) * numF3;
		
		System.out.println("O Produto É: " + produto);
		System.out.println("A Soma É: " + soma);
		System.out.print("Ao Cubo É: " + aocubo);
	}

}
