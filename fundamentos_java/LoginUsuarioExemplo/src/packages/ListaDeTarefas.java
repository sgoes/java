package packages;
import java.util.ArrayList;
import java.util.Scanner;

public class ListaDeTarefas {
	public static Usuario usuarioLogado = null; 
	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		
		
		ArrayList<Usuario> usuarios = new ArrayList();
		
		boolean rodando = true;
		while (rodando) 
		{
			// Menu + input do usuario
			System.out.println("==== PÁGINA INICIAL ====");
			System.out.println("[1] Fazer cadastro.");
			System.out.println("[2] Fazer login.");
			System.out.println("[3] Sair.");
			System.out.println("Indique a opção: ");
			String opcao = scanner.nextLine();
			
			// Processar o input do usuário
			switch (opcao) {
				case "1": {
					System.out.println("==== CADASTRO ====");
					System.out.print("Digite o email: ");
					String email = scanner.nextLine();
					System.out.print("Digite a senha: ");
					String senha = scanner.nextLine();
					
					// Agora quero cadastrar um usuario, portanto vou criar um objeto "u" para a class Usuario
					Usuario u = new Usuario();
					u.setEmail(email);
					u.setSenha(senha);
					
					// vou pegar o meu array list de usuarios e vou adicionar este novo usuario
					usuarios.add(u);
					System.out.println("Usuario cadastrado com sucesso1");
					break;
				}
				case "2": {
					System.out.println("==== LOGIN ====");
					System.out.println("Digite o email: ");
					String email = scanner.nextLine();
					System.out.println("Digite a senha: ");
					String senha = scanner.nextLine();
					
					boolean loginSucesso = false;
					// Agora quero verificar no meu array list de usuarios se existe algum usuario que possui o mesmo e e-mail e a mesma senha 
					for (Usuario u : usuarios) {// isto lê-se da seguinte forma: para cada usuario no meu array list de usuarios
						String uEmail = u.getEmail();
						String uSenha = u.getSenha();
						
						// e agora vou criar duas variaveis de controle quero verificar se o uEmail é igual ao email do input 
						boolean emailConfere = email.equals(uEmail);
						boolean senhaConfere = senha.equals(uSenha);
						
						if (emailConfere && senhaConfere) {
							loginSucesso = true; // aqui so verifico se foi feito com sucesso ou nao, mas mensagem vem depois
							usuarioLogado = u;
							break; // para quebrar o for, não quero continuar a procurar
						}
					}
					if(!loginSucesso) {// é a mesma coisa que loginSucesso == false;
						System.out.println("------->Email/Senha incorretos");
					}else {
						System.out.println("Login feito com sucesso!");
						homePage();
					}
					
					break;
				}
				case "3": {
					rodando = false;
					System.out.println("Encerrando um programa...");
					break;
				}
				default: {
					break;
				}
			}
		}
		
		System.out.println("------> Fim do programa");
	}
	
	public static void homePage() {
		boolean rodando = true;
		while (rodando) {
			System.out.println("==== HOMEPAGE ====");
			System.out.println("[1] Mostrar tarefas");
			System.out.println("[2] Mostrar tarefas finalizas");
			System.out.println("[3] Mostrar tarefas não finalizadas");
			System.out.println("[4] Adicionar tarefa");
			System.out.println("[5] Finalizar tarefa");
			System.out.println("[6] Remover tarefa");
			System.out.println("[7] Logout");
			System.out.println("Digite a opção");
			String opcao = scanner.nextLine();
			
			switch(opcao) {
				case "1":{
					System.out.println("==== TAREFAS ===="); // criacao da arraylist na class usuario, criacao da class tarefa -- atribuiçao de geter and setters nada duas classes
					ArrayList<Tarefa> lista = usuarioLogado.getTarefas(); // pegar  a lista de tarefas do usuario, vou criar uma lista temporaria de lista, vou usar o usuario logado. getTarefas, ou seja, eu tou pegando o arraylist do usuario logado
					
					for(int i = 0; i < lista.size(); i++) {
						Tarefa t = lista.get(i); // vou criar uma variavel temporaria t para pegar a tarefa da posiçao
						System.out.println("Tarefa " + i);
						System.out.println("\tTítulo: " + t.getTitulo());
						System.out.println("\tFinalizada :" + t.isFinalizada());
					}
					
					break;
				}
				case "2":{
					break;
				}
				case "3":{
					break;
				}
				case "4":{
					break;
				}
				case "5":{
					break;
				}
				case "6":{
					break;
				}
				case "7":{
					System.out.println("----->Fazendo logout...");
					rodando = false;
					break;
				}
			}
		}
			
	}

}
