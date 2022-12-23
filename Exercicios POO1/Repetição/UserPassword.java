import java.util.Scanner;

public class UserPassword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner (System.in);
		
		String user;
		String senha;
		
		do {
			System.out.print("User: ");
			user = entrada.nextLine();
			
			System.out.print("Senha: ");
			senha = entrada.nextLine();
			
			if (senha.equals(user)) {
				System.out.println("ERRO! Senha Igual Ao User, Digite O Usuário E Senha Novamente!");
			}
			
		} while (senha.equals(user));
		
		System.out.print("Usuário Cadastrado!  User: " + user + "  Senha: " + senha);
		
		entrada.close();

	}

}
