package pacotes;
import java.util.*;

public class CINELSTREAM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ler = new Scanner(System.in);
		String resposta ="1";
		String nome = "";
		String ano = "";
		String duracao = "";
		String classificacao = "";
		BibliotecaDigital chama = new BibliotecaDigital();
		
		// != sempre que minha resposta for diferente de zero
		while(resposta !="0")
		{
			System.out.println("- CINEL Stream -");
			System.out.println("1 - Inserir o nome do filme: ");
			System.out.println("2 - Consultar filme o filme mais antigo: ");
			System.out.println("3 - Consultar filme com melhor classificação: ");
			System.out.println("4 - Consultar o filme com maior duração: ");
			System.out.println("0 - Sair");
			System.out.println("");
			System.out.println("");
			System.out.println("Indique a sua opção:");
			
			//retira os espaços da variável a ser lida
			resposta = ler.nextLine().trim();
			
			//forma de comparar string no java
			
			/*if(!resposta.equals("0"))
			{
				
			}*/
			
			switch(resposta)
			{
			case "1":
				System.out.println("Indique as informações do filme: ");
				nome = ler.nextLine();
				
				System.out.println("Indique o ano do filme: ");
				ano = ler.nextLine();
				
				System.out.println("Refira a duração do filme em minutos: ");
				duracao = ler.nextLine();
				
				System.out.println("Indique a classificação do filme | (1-5): ");
				classificacao = ler.nextLine();
				
				//criação da uma instacia que permite a utilizaçao de um objeto para a classe
				//exemplo de como enviar os dados pelo construtor da classe
				chama.GuardarDados(nome, ano, duracao, classificacao);
				
				break;
			case "2":
				chama.FilmeMaisAntigo();
				break;
			case "3":
				chama.MelhorFilmeClassificado();
				break;
			case "4":
				chama.FilmeMaiorDuracao();
				break;
			case "0":
				System.out.println("Volte sempre!");
				break;
			default:
				System.out.println("Opção inválida!");
				break;
			}
			
		}
		
		}	
	}
