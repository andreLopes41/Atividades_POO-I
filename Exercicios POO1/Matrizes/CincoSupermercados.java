import java.util.Scanner;

public class CincoSupermercados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		
		int somaTotal = 0;
		int soma1 = 0;
		int soma2 = 0;
		int soma3 = 0;
		int soma4 = 0;
		int soma5 = 0;
		int barato = 0;
		int caro = 0;
		float media = 0;
		final int LINHA = 5;
		final int COLUNA = 5;

		int[][] matriz = new int[LINHA][COLUNA];

		for (int lin = 0; lin < LINHA; lin++) {
			System.out.println((lin + 1) + "° Supermercado");
			for (int col = 0; col < COLUNA; col++) {
				System.out.print("Preço Do Produto: ");
				matriz[lin][col] = entrada.nextInt();
				somaTotal = somaTotal + matriz[lin][col];
				
				if (lin == 0){
					soma1 = soma1 + matriz[lin][col];
				}
				
				if (lin == 0 && col == 0){
					barato = soma1;
					caro = soma1;
				}
				
				if (lin == 1){
					soma2 = soma2 + matriz[lin][col];
				}
				
				if (lin == 2){
					soma3 = soma3 + matriz[lin][col];
				}
				
				if (lin == 3){
					soma4 = soma4 + matriz[lin][col];
				}
				
				if (lin == 4){
					soma5 = soma5 + matriz[lin][col];
				}
				
				if (soma5 < barato) {
					barato = soma5;
				}
				
				if (soma4 < barato) {
					barato = soma4;
				}
				
				if (soma3 < barato) {
					barato = soma3;
				}
				
				if (soma2 < barato) {
					barato = soma2;
				}
				
				if (soma1 < barato) {
					barato = soma1;
				}
				
				if (soma5 > caro) {
					caro = soma5;
				}
				
				if (soma4 > caro) {
					caro = soma4;
				}
				
				if (soma3 > caro) {
					caro = soma3;
				}
				
				if (soma2 > caro) {
					caro = soma2;
				}
				
				if (soma1 > caro) {
					caro = soma1;
				}
			}
		}

		for (int lin = 0; lin < LINHA; lin++) {
			System.out.println("\n" + (lin + 1) + "° Supermercado**");
			for (int col = 0; col < COLUNA; col++) 
				System.out.print(matriz[lin][col] + " | ");
		}

		entrada.close();
		media = somaTotal / (float)(LINHA * COLUNA);
		
		System.out.println("\nMédia: " + media);
		System.out.println("\nSoma 1° Supermercado: " + soma1 + " R$");
		System.out.println("Soma 1° Supermercado: " + soma1 + " R$");
		System.out.println("Soma 2° Supermercado: " + soma2 + " R$");
		System.out.println("Soma 3° Supermercado: " + soma3 + " R$");
		System.out.println("Soma 4° Supermercado: " + soma4 + " R$");
		System.out.println("Soma 5° Supermercado: " + soma5 + " R$");
		System.out.println("\nValor Mais Caro: " + caro + " R$");
		System.out.println("\nValor Mais Barato: " + barato + " R$");
	}

}
