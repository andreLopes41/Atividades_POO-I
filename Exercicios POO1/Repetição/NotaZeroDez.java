import java.util.Scanner;

public class NotaZeroDez {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner (System.in);
		
		float nota;
		nota = 12;
		
		do {
			System.out.print("Nota Entre [0 e 10]: ");
			nota = entrada.nextFloat();
			
			if (nota < 0 || nota > 10) {
				System.out.println("Nota Inválida, Digite Novamente!");
			}
			
		} while (nota < 0 || nota > 10);
		
		System.out.print("[VÁLIDA] Nota: " + nota);
		
		entrada.close();
	}

}
