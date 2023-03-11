package packages;

import java.util.Scanner;

public class Lista_de_Tarefas {

	public static void main(String[] args) {
		// Instanciar o pacote
		Scanner scanner = new Scanner(System.in);
		
		// Agora vou pedir ao meu usuario para cadastrar um novo usuario, simular o cadastro
		
		System.out.println("==============CADASTRO DE USUARIO====================");
		
		System.out.println("Digite o e-mail: ");
		String email = scanner.nextLine();
		
		System.out.println("Digite a senha: ");
		String senha = scanner.nextLine();
		
		// Instanciar o objeto da classe Usuario  //as variaveis estão COM O MODIFICADOR DE ACESSO private
		Usuario u = new Usuario(); // estou a criar esta instância para enviar os dados inseridos do usuario para a classe Usuario no entanto, as variaveis sao privadas
		// o interessante disto é que posso criar outro usuario, ou seja, outro objeto
		
	
		
		// para resolver este problema é preciso criar uma maneira que de entrar na classe Usuraio, para ter acesso as variaveis. 
		// Basta criar um modificador de acesso  --> está na classe de usuario
		
		// Depois de criar o método que permite enviar os dados da classe main para a classe Usurio, é necessário declarar o método criado q permite aceder às variaveis privadas é da seguinte forma:
		u.atribuirEmail(email);
		u.atribuirSenha(senha);
		

		
		System.out.println("======= CADASTRO DO USUARIO U2 =========");
		System.out.println("Insira o email do U2: ");
		email = scanner.nextLine();
		
		System.out.println("Insira a senhade U2: ");
		senha = scanner.nextLine();
		
		Usuario u2 = new Usuario();
		u2.atribuirEmail(email);
		u2.atribuirSenha(senha);
		
		
		System.out.println("========= CADASTRO DO USUARIO U3 ========");
		System.out.println("Insira o email do U3: ");
		email = scanner.nextLine();
		
		System.out.println("Insira a senhade U3: ");
		senha = scanner.nextLine();
		
		Usuario u3 = new Usuario();
		u3.atribuirEmail(email);
		u3.atribuirSenha(senha);
		
		// Agora quero apresentar o valor inserido do usuario na consola, mas vou ter o mesmo problema, vou ter que criar um método para modificar o acesso para mostrar os valores das variaveis, a lógica é  mesma para a que foi para acessar os valores, vou então à classe construir o metodo que me permite mostras os valores na consola
		System.out.println("O email cadastrado foi U1: " + u.pegarEmail()); // aqui estou a fazer uma chamada do metodo que retorna o valor para a classe main -- está na classe usuario
		System.out.println("A senha cadastrada foi U1: " + u.pegarSenha());
		System.out.println("====================   =======================");
		System.out.println("O email cadastrado foi U2: " + u2.pegarEmail()); 
		System.out.println("A senha cadastrada foi U2: " + u2.pegarSenha());
		System.out.println("====================   =======================");
		System.out.println("O email cadastrado foi U3: " + u3.pegarEmail()); 
		System.out.println("A senha cadastrada foi U3: " + u3.pegarSenha());
		


		
		
		// AQUI TENHO A MANEIRA DE PEGAR VALORES DA CLASSE MAIN PARA A CLASSE USUARIO E DA CLASSE USUARIO PARA A CLASSE MAIN
		

	}

}
