package packages;
import java.util.*;

import java.util.Scanner;

public class App {
	
	public static void main(String[] args) {
		
		
		/*
		 * Declaracao das variaveis locais (main)
		 */
	
		Scanner scanner = new Scanner(System.in);
		
		/*
		 * Entrada de dados do usuário
		 */
		System.out.println("Digite o valor de x: ");
		A4_Variaveis_de_Classe.x = scanner.nextInt();
		
		System.out.println("Digite o valor de y: ");
		A4_Variaveis_de_Classe.y = scanner.nextInt();
		
		//Chama método
		A4_Variaveis_de_Classe.soma();
		
		int somaApp = A4_Variaveis_de_Classe.soma(40,50); // realizar soma com variavis locais
		
		System.out.println("[metodoMain] Soma = " + somaApp);
		
		System.out.println("---------------------");
		
		A4_Variaveis_de_Classe.subtracao();
		
		A4_Variaveis_de_Classe.multiplicacao();
		
		A4_Variaveis_de_Classe.divisao();
		
	}
	

}
