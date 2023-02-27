package pacotes;

import java.util.ArrayList;
import java.util.Scanner;

public class Aluno {
	
	// atributos para o aluno
	String nomeAluno;
	String CC;
	int anoNascimento;
	
	Scanner lerString = new Scanner(System.in);
	
	//criacao e definição de uma ArrayList
	ArrayList<String> novoAluno = new ArrayList<String>();
	

	public Aluno() {
		// TODO Auto-generated constructor stub

	}
	
	public void GuardarDados(String nome, String numeroCC, int ano)
	{
		this.nomeAluno = nome;
		this.CC = numeroCC;
		this.anoNascimento = ano;
		
		String linha = this.nomeAluno + ";" + this.anoNascimento + ";" + this.CC;
		
		novoAluno.add(linha);
	}
	
	public void MostrarDadosAlunos()
	{
		for(int i = 0; i<novoAluno.size(); i++)
		{
			System.out.println(novoAluno.get(i));
			
			// guardo os dados do ArrayList numa variável auxiliar
			// String dados = novoAluno.get(i);
			// defino uma variável como o meu separador do ArrayList
			// String separador = ";";
			// guardo os dados num Array sem o separador inicial
			//String[] xColunas = dados.split(separador); 
			
			// System.out.println(xColunas[0] + " " + xColunas[1] + " " + xColunas[2]);
		}
	}
	
	public void AtualizarDadosAlunos()
	{
		int aux = 0;
		System.out.println("Indique o nome do aluno que pretende atualizar o CC: ");
		this.nomeAluno = lerString.nextLine();
		// vou ter que percorrer o meu array // se o nome existe ou nao existe
		for(int i = 0; i<novoAluno.size(); i++)
		{
			// guardo os dados do ArrayList numa variável auxiliar
			String dados = novoAluno.get(i);
			// defino uma variável como o meu separador do ArrayList
			String separador = ";";
			// guardo os dados num Array sem o separador inicial
			String[] xColunas = dados.split(separador); 
			
			if(this.nomeAluno.equals(xColunas[0]))
			{
				//procurar se o nome existe
				System.out.println("Indique o novo CC do aluno: " + xColunas[0]);
				this.CC = lerString.nextLine();
				
				//crio a nova linha que vai ser inserida no ArrayList
				String linha = xColunas[0] + ";" + xColunas[1] + ";" + this.CC;
				
				//permite atualizar a informação existente na linha i do ArrayList
				novoAluno.set(i, linha);
				aux = 1;
			}
			if(aux == 0)
			{
				System.out.println("O aluno que pretende atualizar não existe");
			}
			
		}
	}

}
