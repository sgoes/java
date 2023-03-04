package pacotes;

import java.util.Scanner;

public class Lista_de_tarefas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("===== Registo de usuários =====");
		System.out.println("Digite o email: ");
		String email = scanner.nextLine();
		System.out.println("Digite a senha: ");
		String senha = scanner.nextLine();
		
		//Instanciar o objeto usuario e armazenando esta instância dentro da variavel u
		Usuario u = new Usuario();
		u.email = email;
		u.senha = senha;
		
		u.atribuirEmail(email);
		u.atribuirSenha(senha);
		
		
		

	}

}
