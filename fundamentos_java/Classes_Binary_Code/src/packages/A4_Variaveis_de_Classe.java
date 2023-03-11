package packages;
import java.util.*;

public class A4_Variaveis_de_Classe {
	//Continuacao da CALCULADORA - variaveis_locais
	/*
	 * Declaracao de variáveis de classe // assim as variaveis passam a pertencer ao escopo da classe inteira // consigo acessar em qualquer escopo // neste momento não preciso mais passar por parâmetro	 */
	static int x, y;
	static int soma;
	static int subtracao;
	static int multiplicacao;
	static int divisao;


	public static void soma() { 
		/*
		 * Processamento
		 */
		soma = x + y;
		
		/*
		 * Saída de dados
		*/
		System.out.println("[Método soma] Soma = " + soma);	
		// Acabamos de transferir esta variavel aqui para outro escopo
		System.out.println("--------------------");
	}
	
	
	public static int soma(int x, int y) {
		
		int soma = x + y;
		
		return soma;
		
	}
		
 	public static void multiplicacao() {
 		
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
		 * Processamento
		 */
		divisao = x / y;
		
		/*
		 * Saída de dados
		 */
		System.out.println("[Método divisao] Divisao = " + divisao);
	}
}