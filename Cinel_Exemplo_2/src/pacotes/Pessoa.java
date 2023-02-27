package pacotes;

public class Pessoa {
	
	// São os atributos da classe Pessoa
	String nome;
	int idade;
	String localidade;


	// construtor
	public Pessoa() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	// metodo // o void não devolve nada... depois vamos perceber isto
	public void MostrarDadosPessoa()
	{
		System.out.println("Os dados inseridos foram os seguintes:\n Nome: " + this.nome + "\n Idade: " + this.idade + "\n Localidade: " + this.localidade);
		
	}
	
	// aqui mostra como funciona a estrutura if com um metodo
	public void AnalisaIdadePessoa()
	{ 
		if(this.idade >= 18)
		{
			System.out.println("Já podes tirar a carta de condução!!");
		}
		else
		{
			System.out.println("Ainda não podes tirar a carta de condução!!");
		}
	}
	
	// metodo que recebe parametro um valor que é enviado da class Main
	public void DataNascimento(int idadeMain)
	{
		this.idade = idadeMain;
		
		System.out.println("Ano de nascimento: " + (2023 - this.idade));
	}
	

}
