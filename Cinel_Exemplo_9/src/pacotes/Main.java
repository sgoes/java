package pacotes;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opcao = -1;
		String nome, numeroCC;
		int ano;
		
		String nomeInstrutorM;
		String CCInstrutorM;
		int anoNasInstrutorM;
		
		Aluno novosDados = new Aluno();
		Instrutor novosDadosInstrutor = new Instrutor();
		
		// objeto para a classe AgendarAulaPratica
		AgendarAulaPratica novaAula = new AgendarAulaPratica();
		
		Scanner lerString = new Scanner(System.in);
		Scanner lerInt = new Scanner(System.in);
		
		// vou criar aqui o meu menu, quando o menu está em constante movimento utiliza-se o while
		while(opcao != 0)
		{
			System.out.println("      CINEL - Rumo à CONDUÇÃO     ");
			System.out.println("");
			System.out.println("1- Inserir aluno: ");
			System.out.println("2 - Inserir instrutor: ");
			System.out.println("3 - Agendar aula prática: ");
			System.out.println("4 - Listar aula prática: ");
			System.out.println("5 - Listar aula prática | Instrutor: ");
			System.out.println("6 - Listar aula prática | Aluno: ");
			System.out.println("7 - Corrigir dados de um aluno: ");
			System.out.println("8 - Eliminar uma aula prática: ");
			System.out.println("0 - Fechar a aplicação");
			System.out.println("");
			System.out.println("Indique a sua opção: ");
			opcao = lerInt.nextInt();
			int aux = 0;
			
			while(aux != 1) 
			{
				try {
					aux = 1;
					opcao = lerInt.nextInt();
					
				} catch(Exception e) {
					aux = 0;
					System.out.println(" Opção inválida - só pode inserir algarismos");
					System.out.println("Indique novamente a sua opção: ");
					lerInt.nextInt();		
				}
			}
			switch(opcao)
			{
			case 1:
				System.out.println("Refira o nome do aluno: ");
				nome = lerString.nextLine();
				System.out.println("Indique o ano de nascimento: ");
				ano = lerInt.nextInt();
				int idade = (2023 - ano);
				if (idade < 18)
				{
					System.out.println(" O aluno não tem idade legal para se inscrever!");
				}
				else
				{
					System.out.println("Indique o número do CC: ");
					numeroCC = lerString.nextLine();
					novosDados.GuardarDados(nome, numeroCC, ano);
				}
				
				break;
				
			case 2:
				//novosDados.MostrarDadosAlunos();
				System.out.println("Refira o nome do instrutor: ");
				nomeInstrutorM = lerString.nextLine();
				
				System.out.println("Indique o ano de nascimento do instrutor: ");
				anoNasInstrutorM = lerInt.nextInt();
				
				System.out.println("Indique o número do CC: ");
				
				break;
				
			case 3:
				
				break;
				
			case 7: // corrigir dados de um aluno - admitir que apenas queremos trabalhar o numero do CC
				novosDados.AtualizarDadosAlunos();
				break;
			}
		
		}
		
	}

}


