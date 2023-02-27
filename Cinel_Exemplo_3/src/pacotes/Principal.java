package pacotes;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		Scanner lerInt = new Scanner(System.in);
		// criar uma instância para a classe Funcionario
		Funcionario novoFuncionario = new Funcionario();
		

		
		// chamar o método DadosFuncionario
		novoFuncionario.DadosFuncionario();
		
		novoFuncionario.DadosFuncionario();
		
		novoFuncionario.DadosFuncionario();
		
		
		
		novoFuncionario.FuncionarioMaisNovo();
		
		novoFuncionario.FuncionarioOrdenado();
		
		novoFuncionario.FuncionarioGenero();
		
		// encapsulamento evita o acesso direto aos atributos de uma classe 
		// pretende com que o programa fique mais seguro
		// exemplo de encapsulamento
		
	}
}
