import java.util.Scanner;

public class PescaDosPeixes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.print("Peso Dos Peixes [KG]: ");
		int peso_peixes = entrada.nextInt();
		
		entrada.close();
		
		int kg_excedente;
		
		kg_excedente = peso_peixes % 50;
		
		int multa;
		
		multa = kg_excedente * 4;
		
		System.out.println("Excederam O Total De: " + kg_excedente + " KG");
		System.out.println("O Valor Da Multa: " + multa + " R$");
	}

}
