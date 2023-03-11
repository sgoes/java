package pacotes;
import java.util.*;

public class Aula_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		double base, altura, areaRetangulo;
		
		base = 10.34;
		altura = 20;
		areaRetangulo = base * altura;
		
		//System.out.println("A área de um retangulo de base = " + base);
		//System.out.println("A altura é: " + altura);
		//System.out.println("A área total é: " + areaRetangulo);
		
		System.out.println("Insira a área de base do retangulo: ");
		base = input.nextDouble();
		
		System.out.println("Insira a altura: " );
		altura = input.nextDouble();
		
		System.out.println("A área total do retangulo é " + areaRetangulo);
		
	}

}
