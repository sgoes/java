
package packages;
import java.util.*;

public class A3_Variaveis_Locais {
	//Continuacao da CALCULADORA - metodos_de_clasee

	public static void main(String[] args) {
		
		/*
		 * Execução do bloco soma - chama método soma
		 */
		/*
		 * Declaracao das variaveis locais (main)
		 */
		int x, y;
		Scanner scanner = new Scanner(System.in);
		
		/*
		 * Entrada de dados do usuário
		 */
		System.out.println("Digite o valor de x: ");
		x = scanner.nextInt();
		
		System.out.println("Digite o valor de y: ");
		y = scanner.nextInt();
		
		//Chamada para o método soma, passando como parâmetros os valores
		soma(x,y);
		subtracao(x,y);
		multiplicacao(x,y);
		divisao(x,y);
		
		/*
		 * 	NOTA: se repararmos para todos os métodos foi criado um novo scope, isto quer dizer que as váriaveias declaradas dentro de cada método pertencem apenas aquele método daí termos variaveis x e y em todos os métodos e mesmo estas não se "tocaram". Porque são individuais pertencem a cada um dos métodos. São as chamadas variaveis locais. Vivem dentro de cada um dos scopes. Como é que fazemos que variaveis locais sejam compartilhadas entre scopes. O 
		 */
		
	}
	
	public static void soma(int x, int y) { // aqui temos a passagem de parâmetros
		/*
		 * Declaracao de variaveis
		 */
		int soma;
	
		
		/*
		 * Processamento
		 */
		soma = x + y;
		
		/*
		 * Saída de dados
		 */
		System.out.println("[Método soma] Soma = " + soma);
	}
	
	public static void multiplicacao(int x, int y) {
		/*
		 * Declaracao de variaveis
		 */
		
		int multiplicacao;

		/*
		 * Processamento
		 */
		multiplicacao = x * y;
		
		/**
		 * Saída de dados
		 */
		System.out.println("[Método multiplicacao] Multiplicacao = " + multiplicacao);
	}
	
	public static void subtracao(int x, int y) {
		/*
		 * Declaracao de variaveis
		 */
	
		int subtracao;

		/*
		 * Processamento
		 */
		subtracao = x - y;
		
		/**
		 * Saída de dados
		 */
		System.out.println("[Método subtracao] Subtracao = " + subtracao);
	}

	public static void divisao(int x, int y) {
		/*
		 * Declaracao de variaveis
		 */
		
		int divisao;

		/*
		 * Processamento
		 */
		divisao = x / y;
		
		/*
		 * Saída de dados
		 */
		System.out.println("[Método divisao] Divisao = " + divisao);
	}
}