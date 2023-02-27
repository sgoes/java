package pacotes;

// com a expressão extends a classe Aluno passa a Herdar os atributos e métodos da classe Pessoa
public class Aluno extends Pessoa{
	String turmaAluno;
	int numeroAluno;

	public Aluno() {
		// TODO Auto-generated constructor stub
	}
	
	public void MostrarAluno()
	{
		System.out.println("Eu até sou bom aluno porque gosto de Java!");
	}
	
	public void DadosAlunos(String nome, int idade, String localidade, String turma, int numero)
	{
		// eu para ter acesso dos dados da pessoa tenho que cirar uma extensão
		this.nomePessoa = nome;
		this.idadePessoa = idade;
		this.localidade = localidade;
		this.turmaAluno = turma;
		this.numeroAluno = numero;
		
		System.out.println("Dados guardados do Aluno: ");
		System.out.println("Nome: " + this.nomePessoa);
		System.out.println("Idade: " + this.idadePessoa);
		System.out.println("Localidade: " + this.localidade);
		System.out.println("Turma: " + this.turmaAluno);
		System.out.println("Número: " + this.numeroAluno);
		
		if(this.turmaAluno.equals("CINEL"))
		{
			
		}
	}


}
