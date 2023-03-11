package packages;
import java.util.*;

public class A2_Metodos_de_Classe {
	//Continuacao da CALCULADORA

	public static void main(String[] args) {
		
		/*
		 * Execução do bloco soma - chama método soma
		 */
		soma();
		subtracao();
		multiplicacao();
		divisao();
		
		/*
		 * 	NOTA: se repararmos para todos os métodos foi criado um novo scope, isto quer dizer que as váriaveias declaradas dentro de cada método pertencem apenas aquele método daí termos variaveis x e y em todos os métodos e mesmo estas não se "tocaram". Porque são individuais pertencem a cada um dos métodos. São as chamadas variaveis locais. Vivem dentro de cada um dos scopes. Como é que fazemos que variaveis locais sejam compartilhadas entre scopes. O 
		 */
		
	}
	
	public static void soma() {
		/*
		 * Declaracao de variaveis
		 */
		
		int x, y;
		int soma;
		Scanner scanner = new Scanner(System.in); 
		
		/*
		 * Entrada de dados
		 */
		System.out.println("Digite o valor de x: ");
		x = scanner.nextInt();
		System.out.println("Digite o valor de y: ");
		y = scanner.nextInt();
		
		/*
		 * Processamento
		 */
		soma = x + y;
		
		/**
		 * Saída de dados
		 */
		System.out.println("[Método soma] Soma = " + soma);
	}
	
	public static void multiplicacao() {
		/*
		 * Declaracao de variaveis
		 */
		
		int x, y;
		int multiplicacao;
		Scanner scanner = new Scanner(System.in); 
		
		/*
		 * Entrada de dados
		 */
		System.out.println("Digite o valor de x: ");
		x = scanner.nextInt();
		System.out.println("Digite o valor de y: ");
		y = scanner.nextInt();
		
		/*
		 * Processamento
		 */
		multiplicacao = x * y;
		
		/**
		 * Saída de dados
		 */
		System.out.println("[Método multiplicacao] Multiplicacao = " + multiplicacao);
	}
	
	public static void subtracao() {
		/*
		 * Declaracao de variaveis
		 */
		
		int x, y;
		int subtracao;
		Scanner scanner = new Scanner(System.in); 
		
		/*
		 * Entrada de dados
		 */
		System.out.println("Digite o valor de x: ");
		x = scanner.nextInt();
		System.out.println("Digite o valor de y: ");
		y = scanner.nextInt();
		
		/*
		 * Processamento
		 */
		subtracao = x - y;
		
		/**
		 * Saída de dados
		 */
		System.out.println("[Método subtracao] Subtracao = " + subtracao);
	}

	public static void divisao() {
		/*
		 * Declaracao de variaveis
		 */
		
		int x, y;
		int divisao;
		Scanner scanner = new Scanner(System.in); 
		
		/*
		 * Entrada de dados
		 */
		System.out.println("Digite o valor de x: ");
		x = scanner.nextInt();
		System.out.println("Digite o valor de y: ");
		y = scanner.nextInt();
		
		/*
		 * Processamento
		 */
		divisao = x / y;
		/**
		 * Saída de dados
		 */
		System.out.println("[Método divisao] Divisao = " + divisao);
	}
}