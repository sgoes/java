package pacotes;
import java.util.*;

public class Aula_21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("Insira um ano: ");
		int ano = input.nextInt();
		
		if((ano % 400 == 0) || (ano % 4 == 0 && ano % 100 != 0))
		{
			System.out.println("Ano bissexto");
		}
		else
		{
			System.out.println("Ano não bissexto");
		}
		
		boolean x = ((ano % 400 == 0) || (ano % 4 == 0 && ano % 100 != 0));
		System.out.println(x);

	}

}
