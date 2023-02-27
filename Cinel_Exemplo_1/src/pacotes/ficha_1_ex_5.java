package pacotes;
import java.util.*;

public class ficha_1_ex_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b, c;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Insira um valor: ");
		a = ler.nextInt();
		
		System.out.println("Insira um segundo valor: ");
		b = ler.nextInt();
		
		System.out.println("Insira um terceiro valor: ");
		c = ler.nextInt();
		
		if (a < b && b < c)
		{
			System.out.println(a + " " + b + " "+ c);
		}
		if (c < b && b < a)
		{
			System.out.println(c + " " + b + " "+ a);
		}
		else
		{
			System.out.println("Valores introduzidos inválidos.");
		}
		

	}

}
