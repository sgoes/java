package packages;
import java.util.*;

public class A5_1_Static_Instcia_2 {
	//Continuacao da CALCULADORA - variaveis_locais
	/*
	 * Declaracao de variáveis de classe // assim as variaveis passam a pertencer ao escopo da classe inteira // consigo acessar em qualquer escopo // neste momento não preciso mais passar por parâmetro	 */
	int x, y;
	int soma;
	int subtracao;
	int multiplicacao;
	int divisao;


	public void soma() { 
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
	
	
	public int soma(int x, int y) {
		
		int soma = x + y;
		
		return soma;
		
	}
		
 	public void multiplicacao() {
 		
		/*
		 * Processamento
		 */
		multiplicacao = x * y;
		
		/**
		 * Saída de dados
		 */
		
		System.out.println("[Método multiplicacao] Multiplicacao = " + multiplicacao);
	}
	
	public void subtracao() {
		/*
		 * Processamento
		 */
		subtracao = x - y;
		
		/**
		 * Saída de dados
		 */
		System.out.println("[Método subtracao] Subtracao = " + subtracao);
	}

	public void divisao() {
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