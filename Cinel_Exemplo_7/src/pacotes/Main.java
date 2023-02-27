package pacotes;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// objeto para comunicar com a classe livro
		Livro novoLivro = new Livro();
		
		Scanner ler = new Scanner(System.in);
		
		int resposta = 0;
		
		while(resposta != 6)
		{	
			System.out.println();
			System.out.println();
			System.out.println("    Biblioteca CINEL     ");
			System.out.println();
			System.out.println("1 - Inserir um novo livro: ");
			System.out.println("2 - Consultar Livro | ISBN: ");
			System.out.println("3 - Consultar Livros | Autor: ");
			System.out.println("4- Listar todos os livros: ");
			System.out.println("5- Corrigir dados de um livro: ");
			System.out.println("6 - Fechar aplicação! " );
			System.out.println();
			System.out.println("Indique a sua opção: ");
			resposta = ler.nextInt();
			
			switch(resposta)
			{
			case 1:
				novoLivro.InserirNovoLivro();
			break;
			case 4:
				novoLivro.ListarLivros();
				break;
			case 3:
				novoLivro.ConsultarLivroAutor();
				break;
			case 6:
				System.out.println("Obrigado por usar os nossos serviços");
			default:
				System.out.println("Opção não reconhecida!");
				System.out.println("Em caso de anomalia contactar o administrador!");;
			}
		}

	}

}
