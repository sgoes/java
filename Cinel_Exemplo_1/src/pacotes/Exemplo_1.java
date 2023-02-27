package pacotes;

import java.util.*;

public class Exemplo_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Declaração de um número inteiro

		// para guardar um número maior que 2147483647 devemos utilizar o tipo de dados
		//long numeroGrande;
		//short numeroPequeno;
		

		
		// a seguinte instução permite escrever informação, mas sem mudar de linha
		// a instrução \n permite mudar de linha
		//System.out.println("Hello World!");
		// a instrução println permite escrever a instrução por linha
		// a instrução print permite escrever o conteúdo da instrução da mesma linha
		System.out.println("CINEL - JAVA 2023!");
		// exercicio 1 - escrever o nosso nome na linha seguinte
		//System.out.println("Carolina Goes");
		
		
		
		/*System.out.println("Curiosidade sobre o número inteiro - valor máximo " + Integer.MAX_VALUE);
		System.out.println("Curiosidade sobre o número inteiro - valor mínimo " + Integer.MIN_VALUE);
		// outro tipo de variavel para números maiores
		System.out.println("Curiosidade sobre o número inteiro - valor máximo " + Long.MAX_VALUE);
		System.out.println("Curiosidade sobre o número inteiro - valor mínimo " + Long.MIN_VALUE);
		
		System.out.println("Curiosidade sobre o número inteiro - valor máximo " + Short.MAX_VALUE);
		System.out.println("Curiosidade sobre o número inteiro - valor mínimo " + Short.MIN_VALUE);
		
		System.out.println("Curiosidade sobre o número inteiro - valor máximo " + Float.MAX_VALUE);
		System.out.println("Curiosidade sobre o número inteiro - valor mínimo " + Float.MIN_VALUE);
		
		System.out.println("Curiosidade sobre o número inteiro - valor máximo " + Double.MAX_VALUE);
		System.out.println("Curiosidade sobre o número inteiro - valor mínimo " + Double.MIN_VALUE);
		*
		*
		*/
		
		
		// SOMA ENTRE DUAS VARIÁVEIS
		// utilização do objeto Scanner do Java para ler o conteúdo introduzido pelo teclado
		Scanner ler = new Scanner(System.in);
		int numeroUm;
		int numeroDois;
		int soma;
		float numeroTres = 0, numeroCinco = 0;
		
		// encurta as casas deciamais
		double numeroQuatro = 0;
		
		System.out.println("A divisão de dois números");
		
		System.out.println("Indique o primeiro número: ");
		numeroTres = ler.nextFloat();	
		
		System.out.println("Indique o primeiro número: ");
		numeroCinco = ler.nextFloat();	
		
		System.out.println("Resultado da divisão: " + (numeroTres/numeroCinco));
		

		
		/*System.out.println("Indique um número!");
		// permite ler o conteúdo introduzido pelo utilizador e guardar esse valor na variável n.º
		numeroUm = ler.nextInt();
		
		System.out.println("Indique outro número!");
		// permite ler o conteúdo introduzido pelo utilizador e guardar esse valor na variável n.º
		numeroDois = ler.nextInt();
		soma = numeroUm + numeroDois;
		
		// Devolver o número que é introduzido
		// a seguinte instrução permite apresentar texto concatenado com o valor de uma variavel
		System.out.println("O número inserido foi o: " + numeroUm + ", sabendo que é o meu número preferido");
		System.out.println("O número inserido foi o: " + numeroDois + ", sabendo que é o meu número preferido");
		
		// Aqui tenho que declarar uma nova variavel a consola efetuar a soma, caso contrário apenas concatena:
		System.out.println("A soma dos dois numeros é: " + soma);
		
		// Outra forma de efetuar a soma entra dois números:
		System.out.println("A soma dos dois números é:" + (numeroUm + numeroDois));*/
		

;	}

}
