package pacotes;
import java.util.*;

public class Aula_20_operadores_logicos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Insira um número: ");
		numero = input.nextInt();
		
		if(numero % 2 == 0) // se eu dividir o numero por 2 e o resultado é 0, quer dizer que não tem resto ou seja é par
		{
			System.out.println("Digitou um par!");
		}else {
			System.out.println("Introduziu um numero impar");
		}
		// != diferente
		// &&  permite fazer duas comparações ao mesmo tempo é "e", as duas condições têm de ser verdadeiras
		// || "ou" basta uma das condições ser verdadeira

	}

}
