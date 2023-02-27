package pacotes;
import java.util.*;


public class Desafio_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// um programa que realize as quatro operações básicas da matematica
		/*Scanner ler = new Scanner(System.in);
		int numeroUm;
		int numeroDois;

		
		
		
		System.out.println("Indique um número!");
		numeroUm = ler.nextInt();
		
		System.out.println("Indique outro número!");
		numeroDois = ler.nextInt();
		
		// Pedir ao usuário para inserir dois numeros:
		System.out.println("O número inserido foi o: " + numeroUm);
		System.out.println("O  outro número inserido foi o: " + numeroDois );
		
		// Operações matemáticas:
		System.out.println("A soma dos dois números é: " + (numeroUm + numeroDois));
		System.out.println("A subtração dos dois números é: " + (numeroUm - numeroDois));
		System.out.println("A multiplicação dos dois números é: " + (numeroUm * numeroDois));
		System.out.println("A divisão dos dois números é: " + (numeroUm / numeroDois));	
		// sout + ctrl + space --> template to System.out.println
		
		
		// Exercicio 2
		
		
		/*double area= 3.14, r1, r2;
		double resultado;

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Escreva o valor do raio 1: ");
		r1 = scan.nextDouble();
		
		System.out.println("Escreva o valor do raio 2: ");
		r2 = scan.nextDouble();
		
		resultado = area * (r1 * r2);
		System.out.println("O valor da area é: " + resultado);*/
		
		
		// STRINGS
		
		String nome, apelido;
		Scanner lerString = new Scanner(System.in);
		
		
		System.out.println("Indique o seu nome: ");
		nome = lerString.nextLine();
		
		System.out.println("Indique o seu apelido: ");
		apelido = lerString.nextLine();
		
		System.out.println("Olá " + nome + " " + apelido);
	
	}

}
