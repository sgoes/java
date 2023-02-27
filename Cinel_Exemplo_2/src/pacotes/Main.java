package pacotes;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner lerString = new Scanner(System.in);
		Scanner lerIdade = new Scanner(System.in);
		
		// Instância para a classe Pessoa
		Pessoa dadosPessoa;

		// Objeto para a classe Pessoa
		dadosPessoa = new Pessoa();
		
		//----------------------------------> Pessoa dadosPessoa = new Pessoa();  <-------------------> isto é a forma mais comum <-----------
		
		System.out.println("Indique o nome da pessoa: ");
		dadosPessoa.nome = lerString.nextLine();
		
		System.out.println("Indique a idade: ");
		dadosPessoa.idade = lerIdade.nextInt();
		
		System.out.println("Indique a localidade: ");
		dadosPessoa.localidade = lerString.nextLine();
		
		// Metodo que revela os dados das pessoas
		dadosPessoa.MostrarDadosPessoa();
		// Metodo para analisar os dados da pessoa
		dadosPessoa.AnalisaIdadePessoa();
		
		// Metodo que é chamado com um parâmetro do tipo inteiro
		dadosPessoa.DataNascimento(dadosPessoa.idade);
		
	}

}
