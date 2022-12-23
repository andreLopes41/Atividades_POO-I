import java.util.Scanner;

public class FarenheitParaCelsius {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.print("Temperatura em Graus [°F]: ");
		float grausF = entrada.nextFloat();
		
		entrada.close();
		
		double grausC;
		
		grausC = (grausF - 32)/1.8;
		
		System.out.print("A Temperartura Em Graus Celsius É: " + grausC + " °C");
	}

}
