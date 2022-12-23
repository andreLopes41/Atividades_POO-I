import java.util.Scanner;

public class InformacaoGeral {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner (System.in);
		
		String nome;
		int idade;
		float salario;
		String sexo;
		String estadoCivil;
		
		do {
			System.out.print("Nome: ");
			nome = entrada.nextLine();
			
			if ((nome.length() < 4)) {
				System.out.println("Nome Inválido!");
			}
		}while (nome.length() < 4);
		
		do {
			System.out.print("Idade: ");
			idade = entrada.nextInt();
			
			if ((idade < 0 || idade > 150)) {
				System.out.println("Idade Incorreta!");
			}
		}while (idade < 0 || idade > 150);
		
		do {
			System.out.print("Salário: ");
			salario = entrada.nextFloat();
			
			if ((salario < 0)) {
				System.out.println("ERRO! Salario Com Valor Negativo");
			}
		}while (salario < 0);
		
		entrada.nextLine();
		
		do {
			System.out.print("Sexo [F] ou [M]: ");
			sexo = entrada.nextLine();
			
			if (!sexo.equalsIgnoreCase("F") && !sexo.equalsIgnoreCase("M")) {
				System.out.println("Sexo Não Reconhecido!");
			}
		}while (!sexo.equalsIgnoreCase("F") && !sexo.equalsIgnoreCase("M"));
		
		do {
			System.out.print("Estado Civil [S] [C] [V] [D]: ");
			estadoCivil = entrada.nextLine();
			
			if (!estadoCivil.equalsIgnoreCase("S") && !estadoCivil.equalsIgnoreCase("C") && (!estadoCivil.equalsIgnoreCase("V")) && !estadoCivil.equalsIgnoreCase("D")) {
				System.out.println("Erro! Estado Civil Incorreto");
			}
		}while (!estadoCivil.equalsIgnoreCase("S") && !estadoCivil.equalsIgnoreCase("C") && (!estadoCivil.equalsIgnoreCase("V")) && !estadoCivil.equalsIgnoreCase("D"));
		
		entrada.close();
		
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("Salário: " + salario + " R$");
		
		if (sexo.equalsIgnoreCase("F")) {
			System.out.println("Sexo: Feminino");
		}
		else {
			System.out.println("Sexo: Masculino");
		}
		
		if (estadoCivil.equalsIgnoreCase("S")) {
			System.out.println("Estado Civil: Solteiro ");
		}
		else if (estadoCivil.equalsIgnoreCase("C")) {
			System.out.println("Estado Civil: Casado ");
		}
		else if (estadoCivil.equalsIgnoreCase("V")) {
			System.out.println("Estado Civil: Viúvo ");
		}
		else {
			System.out.println("Estado Civil: Divorciado ");
		}
	}
}
