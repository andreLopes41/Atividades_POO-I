import java.util.Scanner;

public class TurnoDeEstudo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Qual Seu Turno De Estudos?");
		System.out.println("[M] Matutino");
		System.out.println("[V] Vespertino");
		System.out.println("[N] Noturno");
		String turno = entrada.nextLine();
		
		entrada.close();
		
		if (turno.equals("M")) {
			System.out.println("Bom Dia!");
		}
		
		if (turno.equals("V")) {
			System.out.println("Boa Tarde!");
		}
		
		if (turno.equals("N")) {
			System.out.println("Boa Noite!");
		}

	}

}
