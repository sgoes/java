package pacotes;
import java.util.*;

public class Aula_20_operadores_logicos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Insira um n�mero: ");
		numero = input.nextInt();
		
		if(numero % 2 == 0) // se eu dividir o numero por 2 e o resultado � 0, quer dizer que n�o tem resto ou seja � par
		{
			System.out.println("Digitou um par!");
		}else {
			System.out.println("Introduziu um numero impar");
		}
		// != diferente
		// &&  permite fazer duas compara��es ao mesmo tempo � "e", as duas condi��es t�m de ser verdadeiras
		// || "ou" basta uma das condi��es ser verdadeira

	}

}
