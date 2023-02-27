package pacotes;

import java.util.*;

public class ficha_1_ex_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a, b;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Insira um valor: ");
		a = ler.nextInt();
		
		System.out.println("Insira outro valor: ");
		b = ler.nextInt();
		
		if (a == b)
		{ 
			System.out.println("Os valores instroduzidos são iguais: " + a +" + "+ b + " = " + (a+b));
		}
		else
		{
			System.out.println("Os valores introduzidos são diferentes: " + a +" * "+ b + " = " + (a*b));
		}
		
	}

}
