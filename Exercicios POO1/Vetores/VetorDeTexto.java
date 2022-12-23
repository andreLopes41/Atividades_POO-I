import java.util.Scanner;

public class VetorDeTexto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.print("Tudo Bem? : ");
		String texto = entrada.nextLine();
		
		for ( char vetor : texto.toCharArray ()) {
			System.out.print(vetor + "|");
		}
		
		entrada.close();

	}

}
