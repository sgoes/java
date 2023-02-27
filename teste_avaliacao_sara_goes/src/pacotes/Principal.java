package pacotes;

import java.util.Scanner;

public class Principal {
	
	Scanner scanner = new Scanner(System.in);
	int opcao;

	public static void main(String[] args) {
		while(opcao != 0)
		{
			System.out.println("");
			System.out.println("1- Inserir medico: ");
			System.out.println("2 - Marcar consulta");
			System.out.println("Indique a sua opção: ");
			opcao = scanner.nextInt();
		}

	}

}
