package pacotes;
import java.util.*;

public class ficha_1_ex_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String resposta;
		
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Indique o seu sexo, indicado 'F' para feminino ou 'M' para maculino: ");
		resposta = ler.nextLine();
		
		
		if (resposta.equals("F"))
		{
			System.out.println("O sexo inserido foi feminino!");
		}
		else if (resposta.equals("M"))
		{
			System.out.println("O sexo inserido foi masculino!");
		}
		else
		{
			System.out.println("Sexo inválido");
		}
		

	}

}
