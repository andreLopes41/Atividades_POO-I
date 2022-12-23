import java.util.Scanner;
import java.util.Random;

public class SenhaDoUsuario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner (System.in);
		
		final int TAM = 26;
		
		char[] alfabeto = new char[] {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		char[] senha = new char [TAM];
		int tamSenha = 0;
		
		do {
			System.out.print("Tamanho Da Senha: ");
			tamSenha = entrada.nextInt();
		}while(tamSenha < 2 || tamSenha > 26 );
		
		entrada.close();
		
		 Random random = new Random();
	        for (int x = 0; x < TAM; x++) {
	                senha[x] = alfabeto[random.nextInt(alfabeto.length)];
	        }
	        
	        System.out.print("Senha De acesso: ");
	        
	        for (int x = 0; x < tamSenha; x++) {
                System.out.print(senha[x]);
        }
		
		entrada.close();
	}
}
