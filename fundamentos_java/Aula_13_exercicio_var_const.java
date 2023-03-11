package pacotes;

import java.util.Scanner;

public class Aula_13_exercicio_var_const {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		final double PI = 3.1456;
		
		
		System.out.println("Informe o nome do raio: ");
		double raio = input.nextDouble();
		
		double area = raio * raio * PI;
		System.out.println("O valor da área é:" + area);
	}

}
