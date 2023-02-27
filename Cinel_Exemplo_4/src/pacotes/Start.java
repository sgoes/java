package pacotes;
import java.util.*;

public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// declaraçao de atributos
		String localidadePrincipal = null;
		int temperaturaPrincipal;
		int resposta = -1;
		
		// criaçao do objeto que permite interagir com a classe IPMA
		IPMA enviarDados = new IPMA();

		Scanner lerString = new Scanner(System.in);
		Scanner lerInt = new Scanner(System.in);
		
		enviarDados.setLocalidade(localidadePrincipal);
		
		
		// Enquanto a minha resposta for diferente de zero, o ciclo vai funcionar
		while(resposta != 0) {
			System.out.println("---IPMA CINEL ---");
			System.out.println("1 - Inserir Dados ");
			System.out.println("2 - Listar Temperatura Máxima: ");
			System.out.println("3- Listar temperatura Mínima: ");
			System.out.println("4 - Listar localidade com a temperatura máxima: ");
			System.out.println("0 - Sair");
			
			System.out.println("Escolha a sua opção: ");
			resposta = lerInt.nextInt();
			
			// atraves do switch case analisamos as varaiveis
			switch(resposta) {
			// na situação da resposta ser igual 1
			case 1: 
				// System.out.println("A opção 1 foi a selecionada");
				System.out.println("Indique o nome da localidade: ");
				localidadePrincipal = lerString.nextLine();
				
				System.out.println("Indique a temperatura da localidade: ");
				temperaturaPrincipal = lerInt.nextInt();
			
				
				// é enviado para a classe IPMA os dados recebidos pelo utilizador ---> LINHA QUE ENVIA DADOS PARA A CLASSE 
				enviarDados.GuardarDados(localidadePrincipal, temperaturaPrincipal);
				break;
				
				
			// na situação da resposta ser igual 2
			case 2:
				// enviarDados.MostrarTemperaturaMax() é substituido pelo valor this.max da class IPMA
				// como o método MostrarTemperaturaMax devolve um inteiro... temos o resultado prentendido
				System.out.println("A temperatura máxima é de: " + enviarDados.MostrarTemperaturaMax());
				break;
			
			case 3:
				System.out.println("A temperatura mínima é de " + enviarDados.MostrarTemperaturaMin());
				
			// entra nesta situação se nenhuma das anteriores for satisfeita --> funciona como o else
			
			case 4:
				System.out.println("A localidade: " + enviarDados.MostrarLocalidadePrincipal() + " está com a temperatura máxima: " + enviarDados.MostrarTemperaturaMax() + "ºC");
			default:
				System.out.println("Opção inválida");
				break;
			}
			
		}
	}

}
