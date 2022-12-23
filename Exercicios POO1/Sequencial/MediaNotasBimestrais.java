import java.util.Scanner;

public class MediaNotasBimestrais {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.print("1° Nota: ");
		float nota1 = entrada.nextFloat();
		
		System.out.print("2° Nota: ");
		float nota2 = entrada.nextFloat();
		
		System.out.print("3° Nota: ");
		float nota3 = entrada.nextFloat();
		
		System.out.print("4° Nota: ");
		float nota4 = entrada.nextFloat();
		
		entrada.close();
		
		float media;
		
		media = (nota1 + nota2 + nota3 + nota4)/4;
		
		System.out.print("A Média Bimestral Foi: " + media);
	}

}
