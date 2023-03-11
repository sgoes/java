package packages;

import java.util.ArrayList;
import java.util.Scanner;

public class ListaDeTarefas {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		ArrayList<Usuario> usuarios = new ArrayList(); // Esta class arrayList permite que eu armazene vários objetos do tipo usuario dentro da variável única que é usuários
		//[u ,u2, u3]
		// 0  1   2   index
		
		System.out.println("========== CADASTRO DE USUARIO =========");
		
		// Laço de repetição
		//Dentro do for configuramos quantas vezes o laço vai ficar repetindo para isso vou criar uma variavel i e inicializa-la com 0
		// Repara que o for é constituido por 3 partes cada um separado por ponto e virgula;
		// A 1ª parte é a inicialização das variaveis de controle do for
		// A 2ª parte é a condição se a condição for true, executa o bloco de código do laço
		// 			se a condição for False, NÃO executar o bloco do laço: FINALIZAR O LAÇO DE REPETIÇÃO
		// A 3ª parte - modifica o valor da variaveis de controle ( ++i == i + 1, o valor de i para a ser um depois de inicializar
		for(int i = 0; i < 3; ++i ) {
			System.out.println("Digite o email: ");
			String email = scanner.nextLine();
			
			System.out.println("Digite a senha: ");
			String senha = scanner.nextLine();
			
			// Vou instnciar um novo objeto para a class Usuario
			Usuario u = new Usuario();// sempre que o laço é executado estou a instanciar um novo objeto
			
			// Vou atribuir os valores de email e senha para este objeto
			u.atribuirEmail(email);
			u.atribuirSenha(senha);
			
			// Agora vou adicionar este objeto u no ArrayList Usuarios
			usuarios.add(u);
		}
		
		// É ASSIM QUE FUNCIONA UM ARRAY LIST num laço FOR
		// Como é que fazemos para pegar o objeto do arrayList para mostrar as informaçõe na tela
		// para isso vou fazer outro for, o metodo size permite-me saber quantos usuarios estao dentro do arrayList
		
		for(int i = 0; i < usuarios.size(); ++i ) { // muito util para acessar a posiçao do array, percorrer um array list
			Usuario uTemp = usuarios.get(i); // pega o objecto usuario que está na poiçao 0 e guarda na variável uTemp
			System.out.println("O email do U" + i + " é: " + uTemp.pegarEmail());
			System.out.println("A senha do U" + i + " é: " + uTemp.pegarSenha());
		}

	}

}
