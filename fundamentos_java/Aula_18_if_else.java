package pacotes;
import java.util.*;

public class Aula_18_if_else {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String nome;
		int idade;
		
		
		System.out.println("Insira o seu nome: ");
		nome = input.nextLine();
		
		System.out.println("Insira a sua idade: ");
		idade = input.nextInt();
		
		if(idade >= 18)
		{
			System.out.println("Já podes tirar carta de condução");
		}
		else
		{
			System.out.println("Esquece lá isso, espera mais um bocadinho!");
		}
		
		

	}

}
