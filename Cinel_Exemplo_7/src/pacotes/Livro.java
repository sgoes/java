package pacotes;

import java.util.Scanner;

public class Livro {
	
	// Atributos do tipo Array | vetor
	String[] nomeLivro = new String[10]; // so vou poder guardar no maximo 10 livros
	String[] autorLivro = new String[10];
	int[] precoLivro = new int[10];
	String[] isbnLivro = new String[10]; // tem que ter 10 digitos
	int i = -1;
	int aux = 0;
	String nome, autor, isbnCorreta;
	
	Scanner lerString = new Scanner(System.in);
	Scanner ler = new Scanner(System.in);
	

	public Livro() {
		// TODO Auto-generated constructor stub
	}
	
	public void ConsultarLivroAutor()
	{
		if(this.i<0 )
		{
			System.out.println("Ainda não foram registados livros");
		}
		else
		{
			System.out.println("Indique o nome do autor que pretende procurar: ");
			autor = lerString.nextLine().toUpperCase();
			
			for(int j = 0; j<= i ; j++)
			{
				if(autor.equals(this.autorLivro[j].toUpperCase()));
				{
					System.out.println("\n Livro: " + this.nomeLivro[j] + "\n Autor: " + 					this.autorLivro[j] + "\n Preço: " + this.precoLivro[j] + "\n ISBN: " + 					this.isbnLivro[j]);;
				}
			}
			
		}
	}
	
	
	// metodo para inserir novo livro
	public void InserirNovoLivro()
	{
		//incrementar a posição do Array
		++i;
		System.out.println("Refira o nome do livro");
		this.nome = lerString.nextLine(); 
		int aux = 0;
		for(int j = 0; j<= i; j++)
	{
		//verifico se existem livros com o mesmo nome
		if(this.nome.equals(this.nomeLivro[j]))
			{
				//se encontrar um livro com o mesmo nome a variável muda de estado
				aux = 1;
			}
		}
		if(aux == 1)
		{
			System.out.println("O Livro já existe !");
			//no caso do livro existir o valor do i tem que decrementar
			--i;
		}
		
		else
		{
					
			this.nomeLivro[i] = this.nome;
					
			System.out.println("Refira o autor do livro");
			this.autorLivro[i] = lerString.nextLine(); 
					
			System.out.println("Refira o preço do livro");
			this.precoLivro[i] = ler.nextInt(); 
					
			//temos aqui um grande problema!!!!
			System.out.println("Indique o ISBN do livro");
			
			this.isbnLivro[i] = lerString.nextLine();
			
			isbnCorreta = lerString.nextLine();
			// vou executar o ciclo enquanto a minha condição não é satisfeita
			// enquanto não colocar 10 digitos
			while(isbnCorreta.length() != 10)
			{
				System.out.println("O ISBN do livro não tem 10 digitos!");
				
				System.out.println("Indique o ISBN do livro");
				
				isbnCorreta = lerString.nextLine();
			}
			//else
			//{
				this.isbnLivro[i] = isbnCorreta;
			}
					
			aux = 0;
		}
	
	
	// É  o método que vai construir o array
	public void ListarLivros()
	{
		System.out.println("A informação guardada é a seguinte:");
		// o ciclo for é executado desde a posiçao 0 até à posiçao i (conta os livro inseridos)
		for(int j=0; j <= i; j++)
		{
			System.out.println("\n Livro: " + this.nomeLivro[j] + "\n Autor: " + this.autorLivro[j] + "\n Preço: " + this.precoLivro[j] + "\n ISBN: " + this.isbnLivro[j]);
			// o j é que é incrementado o i apenas serve para balizar o fim
		}
	}
	
	public void VerificaLivro()
	{
		// verificar se ja existe livros
		if (i < 0 )
		{
			System.out.println("Ainda não existe informação guardada.");
		}

	}
	
	
	}

