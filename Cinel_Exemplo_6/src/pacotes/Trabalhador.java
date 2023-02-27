package pacotes;

// herança - permite à classe Trabalhador aceder aos atributos e métodos da classe Pessoa
public class Trabalhador extends Pessoa {
	
	// atributos
	double salarioTrabalhador;
	String empresaTrabalhador;
	
	public Trabalhador() {
		// TODO Auto-generated constructor stub
	}
	
	
	// METODO QUE VAI SER APRESENTADO NA CLASSE PRINCIPAL - PARA IR BUSCAR OS DADOS INSERIDOS PELO UTILIZADOR
	public void MostraTrabalhador(String empresa, double salario, String nome, int idade, String localidade)
	{
		this.empresaTrabalhador = empresa;
		this.salarioTrabalhador = salario;
		// só é possível aceder a estes 3 atributos porque a classe Trabalhador é uma Herança da classe Pessoa  
		this.nomePessoa = nome;
		this.idadePessoa = idade;
		this.localidade = localidade;
		
		// uma outra forma de chamar os metodo da classe Mãe (Pessoa)
		//super.nomePessoa = nome;
		
		//mostrar os dados que estou a receber do "Inicio"
		System.out.println("Os dados do trabalhador são os seguintes: ");
		System.out.println("Nome: " + this.nomePessoa);
		System.out.println("Localidade" + this.localidade);
		System.out.println("Idade: " + this.idadePessoa);
		System.out.println("Empresa: " + this.empresaTrabalhador);
		System.out.println("Salário: " + this.salarioTrabalhador);
		
		// Este metodo é mostrado agora no inicio
		super.MostraPessoa();
	}

}
