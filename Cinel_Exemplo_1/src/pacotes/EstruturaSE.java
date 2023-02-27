package pacotes;
import java.util.*;

public class EstruturaSE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Estruturas IF
		
		int numero;
		
		Scanner lerNumero = new Scanner(System.in);
		
		System.out.println("Insira um numero: ");
		numero = lerNumero.nextInt();
		
		// A estrutura de decisão IF permite tomar decisões mediante o valor lido
		/*if(numero > 0)
		{
			System.out.println("O número é positivo!");
		}
		else if (numero < 0)
		{
			System.out.println("O número é negativo");
		}
		else
		{
			System.out.println("O número é neutro");
		}*/
		
		// Operadores de comparação e operadores lógicos
		if (numero >= 0 && numero <18) // tem que ser true - true
		{
			System.out.println("Estás entre zero e 17");
		}
		else
		{
			System.out.println("Não é menor de idade");
		}
		
	}

}
