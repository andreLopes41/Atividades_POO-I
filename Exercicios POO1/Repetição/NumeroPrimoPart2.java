import java .util.Scanner;

public class NumeroPrimoPart2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Scanner entrada = new Scanner (System.in);
		
		System.out.print("Digite Um Número: ");
		int numI = entrada.nextInt();
		
		entrada.close();
		
		boolean flag = true;
		
		for (int x = 1; x <= numI; x++) {
			
			flag = true;
			
			for (int y = 2; y < x; y++) {
				if (x % y == 0 ) {
					flag = false;
				}
			}
		}
		if (flag) {
			System.out.println(numI + " é Primo!");
		}
		else {
			System.out.println(numI + " Não é Primo!");
			System.out.print("Divisores: ");
			
			for (int k = 1; k <= numI; k++) {
				if (numI % k == 0) {
					System.out.print(k + ", ");
				}
			}
		}
		
		

	}

}
