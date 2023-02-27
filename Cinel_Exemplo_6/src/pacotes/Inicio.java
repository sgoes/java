package pacotes;
import java.util.*;

public class Inicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String empresa; // CT- empresaTrabalhador
		double salario; // CT- salarioTrabalhador
		String nome; // CP --> CT --> CA- nomePessoa
		int idade; // CP --> CT --> CA- idadePessoa
		String localidade; // CP --> CT --> CA - localidade
		
		String turma; //CA - turmaAluno
		int numero; // CA - numeroAluno
		
		// Como podemos ver a classe MAE será a classe Pessoa, tanto a classe Trabalhador, como a classe Aluno vai herdar atributos desta classe. 
		
		// Como é que vou buscar os atributos da classe Mae - Pessoa, para as classes Filhas? --> através do método EXTENDS (fica no ínicio)
		
		// Como é que declaro na classe filha que a reutilização da variável? 
		
		// Na classe MAE --> declaro os atributos que são comuns às outras duas classes filhas, neste caso tanto a classe Trabalhador como a classe Alunos vão herdar em comum os atributos nomePessoa, idadePessoa, localidade, estes atributos são comuns porque tanto o trabalhador como o aluno são pessoas.
		
		// De seguida na classe filha - Trabalhador - declaro os atributos que apenas pertencem a esta classe --> salarioTrabalhador e empresaTrabalhador
		
		// De seguida tenho como objetivo construir um método na classe Trabalhador, que permita mostrar os atributos do trabalhador, construo o método MostrarTrabalhador(e coloco os parâmetros/atributos que vão ser revelados no main, aqui tenho declarar os atributos como foram declarados no main ou seja -- public void MostraTrabalhador(String empresa, double salario, String nome, int idade, String localidade) {posto isto atribuo os atributos da classe Trabalhador à classe Main, por exemplo: this.empresaTrabalhador = empresa e assim por aditante, tenho que atribuir a todos os atributos declarados dentro dos parâmetros}
		
		// De seguida crio um objeto para a classe Trabalhador no main para instanciar a classe exemplo Trabalhador novo = new Trabalhador(); a partir deste momento posso ir chamar os métodos construídos da classe Trabalhador. Para chamar os metodos da classe construtora Trabalhador faço através do método criado novo.MostraTrabalhador(empresa, salario, nome, idade,localidade); o método por norma é chamado após da classe ter recebido valores introduzidos pelo usuário. Neste caso e só assim consegue mostrar os valores.
		
		String resposta;
		
		// metodo de scanner para ler os dados introduzidos pelo utilizador
		Scanner lerString = new Scanner(System.in);
		Scanner lerInt = new Scanner(System.in);
		
		
		
		// criação de um objeto para a classe trabalhador "novo" que me permite ir buscar tudo o que está na classe trabalhador
		Trabalhador novo = new Trabalhador();
		Aluno novoAluno = new Aluno();
		
		
		// insercao dados usuario
		System.out.println("Indique o nome da Pessoa: ");
		nome = lerString.nextLine();
		
		System.out.println("Indique a idade da Pessoa:");
		idade = lerInt.nextInt();
		
		System.out.println("Indique a localidade da Pessoa: ");
		localidade = lerString.nextLine();
		
		System.out.println("A Pessoa em causa é Trabalhador ou Aluno?");
		resposta = lerString.nextLine().toUpperCase();
		

		
		if(resposta.equals("TRABALHADOR"))
		{
			System.out.println("Indique o nome da empresa do Trabalhador: ");
			empresa = lerString.nextLine();
			
			System.out.println("Refira o salário do Trabalhador: ");
			salario = lerInt.nextDouble();
			
			// este novo vai buscar a classe trabalhador estas variaveis, isto trata-se de reutilizar codigo
			novo.MostraTrabalhador(empresa, salario, nome, idade, localidade);
		}
		else if(resposta.equals("ALUNO"))
		{
			System.out.println("Refira a turma do aluno:");
			turma = lerString.nextLine();
			
			System.out.println("Indique o número do aluno: ");
			numero = lerInt.nextInt();
			
			novoAluno.DadosAlunos(nome, idade, localidade, turma, numero);
			
			if(turma.equals("CINEL"))
			{
				novoAluno.MostrarAluno();
			}
			else
			{
				System.out.println("Não é reconhecida tal pessoa :)");
			}
		}
	}

}
