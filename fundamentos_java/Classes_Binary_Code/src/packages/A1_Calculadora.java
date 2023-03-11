package packages;
import java.util.*;

public class A1_Calculadora {

	public static void main(String[] args) {
		/**
		 * 1. Declaração de variáveis
		 */
		int x, y;
		int soma, subtracao, multiplicacao;
		double divisao;
		Scanner scanner = new Scanner(System.in); 
		
		/*
		 * 2. Entrada de dados
		 */
		System.out.print("Digite o valor de x: ");
		x = scanner.nextInt();
		System.out.print("Digite o valor de y: ");
		y = scanner.nextInt();
		
		/*
		 * Processamento
		 */
		soma = x + y;
		subtracao = x - y;
		multiplicacao = x * y;
		divisao = x / y;
		
		/*
		 * 4. Saida de dados
		 */
		System.out.println("Soma = " + soma);
		System.out.println("Subtração = " + subtracao);
		System.out.println("Multiplicação = " + multiplicacao);
		System.out.println("Divisão = " + divisao);
		
		
	}
	
	public static void soma() {
		
	}

}
