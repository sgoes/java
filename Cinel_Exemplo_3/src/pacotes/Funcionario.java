package pacotes;

import java.util.Scanner;

public class Funcionario {
	
	// Declarar atributos do construtor
	// Sempre que declaro variaveis com inicialização tenho de declarar  antes dos métodos
	private String nome;
	private int idade;
	private char genero;
	double ordenado;
	// a vriavel max tem que ser inicializada com um valor muito pequeno
	double maxOrdenado = 0;
	// a variavel minima tem que ser incializada com um valor muito grande
	int minIdade = 1000;
	String nomeOrdenado, nomeIdade;
	int contarFeminino = 0;
	int contarMasculino = 0;
	

	public Funcionario() {
		// TODO Auto-generated constructor stub~
		// opção construtor na classe 
	}
	
	// metodos
	//vai ser aqui que vou pedir os dados, construo entao o método
	public void DadosFuncionario()
	{
		// se vou ler o nome do funcionario tenho de criar um scanner
		Scanner lerString = new Scanner(System.in);
		Scanner lerInteiro = new Scanner(System.in);
		
		System.out.println("Indique o nome do funcionário: ");
		this.nome = lerString.nextLine();
		
		System.out.println("Indique a idade do funcionário: ");
		this.idade = lerInteiro.nextInt();
		
		System.out.println("Refira o género do funcionário: F - Feminino | M - Masculino");
		// Ler o primeiro carater da string
		this.genero = lerString.nextLine().charAt(0);
		
		System.out.println("Indique o ordenado do funcionário: ");
		this.ordenado = lerInteiro.nextDouble();
		
		
		if(this.genero == 'f' || this.genero == 'F')
		{
			// incrementa em uma unidade sempre que a condição do if é satisfeita
			// contarFeminino = contarFemnino + 1;
			contarFeminino += 1;
		}
		
		if (this.genero == 'm' || this.genero == 'M')
		{
			contarMasculino += 1;
		}
		
		
		if(this.idade < minIdade)
		{
			// estou a garantir que guardo sempre o valor mais pequeno
			minIdade = this.idade;
			this.nomeIdade = this.nome;
		}
		
		if(this.ordenado > maxOrdenado)
		{
			// estou a garantir que guardo sempre o maior valor
			maxOrdenado = this.ordenado;
			this.nomeOrdenado = this.nome;
		}
		
	}
	
	public void FuncionarioMaisNovo() 
	{
		System.out.println("O funcionario mais novo tem a idade de " + this.minIdade + " anos");
		System.out.println("É conhecido por ter um nome em minúsculas " + this.nomeIdade.toLowerCase());
	}
	
	public void FuncionarioOrdenado()
	{
		System.out.println("O maior ordenado é de " + this.maxOrdenado + "€");
		System.out.println("É conhecido por ter um nome em minúsculas " + this.nomeOrdenado.toUpperCase());
	}
	
	// vou criar aqui uma função
	public void FuncionarioGenero()
	{
		System.out.println("Foram inseridas " + contarFeminino + " do género feminino!" );
		System.out.println("Foram inseridas " + contarMasculino + " do género masculino!" );
	}

}
