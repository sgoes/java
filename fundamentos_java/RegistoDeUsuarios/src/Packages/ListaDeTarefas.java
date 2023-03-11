package Packages;

import java.util.ArrayList;
import java.util.Scanner;

public class ListaDeTarefas {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		ArrayList<Usuario> usuarios = new ArrayList();
		
		boolean rodando = true;
		
		while(rodando) 
		{
			System.out.println("[1] Cadastrar usuário: ");
			System.out.println("[2] Listar todos usuários cadastrados.");
			System.out.println("[3] Procurar usuário por email.");
			System.out.println("[4] Atualizar dados de um usuário.");
			System.out.println("[5] Remover usuário.");
			System.out.println("[6] Sair ");
			System.out.println("Digite a opção: ");
			String opcao = scanner.nextLine();
		
			switch(opcao) {
				case "1":{
					System.out.println("========== CADASTRO DE USUARIO =========");
					
					System.out.println("Digite o email: ");
					String email = scanner.nextLine();
					
					System.out.println("Digite a senha: ");
					String senha = scanner.nextLine();
	
					// instanciar objeto da class usuario
					Usuario u = new Usuario();
					// Declaração do método criado q permite aceder às variaveis privadas
					u.setEmail(email);
					u.setSenha(senha);
					
					usuarios.add(u);
					break;
				}
				case "2":{
					System.out.println("========= USUÁRIOS CADASTRADOS ==========");
					
					for(int i = 0; i < usuarios.size(); i++) {
						Usuario uTemp = usuarios.get(i);
						System.out.println("Usuario: " + i);
						System.out.println("\t Email: " + usuarios.get(i).getEmail());
						System.out.println("\t Senha: " + usuarios.get(i).getSenha());
					}	
					break;
				}
				case "3":{
					System.out.println("=========== PROCURAR USUÁRIO ===========");
					System.out.println("Digite o e-mail:");
					String email = scanner.nextLine();
					
					boolean encontrado = false;
					for(int i=0; i < usuarios.size(); i++) {
						// vou pegar o usuario na posicao e guardar na variavel uTemp
						Usuario uTemp = usuarios.get(i);
						
						if(email.equals(uTemp.getEmail())) {
							System.out.println("Usuário encontrado: ");
							System.out.println("\t Email: " + uTemp.getEmail());
							System.out.println("\t Senha: " + uTemp.getSenha());
							encontrado = true;
							break; // Para que não fique sempre à procura
						}
					}	
					if (!encontrado) { // aqui estou a negar com ! é o mesmo que dizer encontrado == false
						System.out.println("Não foi encontrado nenhum usuario com esse email");
					}
					break;
				}
				case "4":{
					System.out.println("======== ATUALIZACÃO DE USUÁRIO ===========");
					// primeiro vou colocar todos os  emails dos usuarios que existem
					for (int i = 0; i < usuarios.size(); i++) {
						Usuario uTemp = usuarios.get(i);
						System.out.println("[" + i + "]" + uTemp.getEmail()); // estou a apresentar a posição do usuario no array e o email dele
					}
					System.out.println("Digite o valor de referência: ");
					int referencia = scanner.nextInt();
					scanner.nextLine();
					
					System.out.println("Digite o novo email: ");
					String novoEmail = scanner.nextLine();
					
					System.out.println("Digite a nova senha: ");
					String novaSenha = scanner.nextLine();
					
					Usuario u = usuarios.get(referencia);
					u.setEmail(novoEmail);
					u.setSenha(novaSenha);
					
					break;
				}
				case "5":{
					System.out.println("=================== REMOVER USUARIO ===================");
					// primeiro vou colocar todos os  emails dos usuarios que existem
					for (int i = 0; i < usuarios.size(); i++) {
						Usuario uTemp = usuarios.get(i);
						System.out.println("[" + i + "]" + uTemp.getEmail()); // estou a apresentar a posição do usuario no array e o email dele
					}
					System.out.println("Digite o valor de referência: ");
					int referencia = scanner.nextInt();
					scanner.nextLine();
					
					usuarios.remove(referencia);
					break;
				}
				case "6":{
					rodando = false;
					break;
				}
			}
		}
	}
}
