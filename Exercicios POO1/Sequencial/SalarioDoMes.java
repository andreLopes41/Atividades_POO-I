import java.util.Scanner;

public class SalarioDoMes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.print("Horas Trabalhadas No Mês: ");
		float horasTrabalhadas = entrada.nextFloat();
		
		System.out.print("Valor Da Hora [R$]: ");
		float valordahora = entrada.nextFloat();
		
		entrada.close();
		
		float salario;
		
		salario = horasTrabalhadas * valordahora;
		
		System.out.print("O Salário Total A Ser Recebido É: " + salario + " R$");
	}

}
