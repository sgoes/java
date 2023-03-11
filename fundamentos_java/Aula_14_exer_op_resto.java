package pacotes;

import java.util.Scanner;

public class Aula_14_exer_op_resto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		// vamos fazer um programa que o usuario insira um valor em gramas e temos que passar para o usario o valor convertigo em kg e em gramas
		// se o uuario introduzir um valor de 1500 gr temos que informar ao usuario que corresponde a 1 kg + 500gr
		
		System.out.println("Insira um valor em gramas: ");
		int gramas = input.nextInt();
		
		int kilos = gramas /1000; // 1kg possui 1000gr
		gramas = gramas % 1000; // estamos a atribuir o que restou ou seja as gramas aqui
		
		System.out.println("O total de kilo é: " + kilos + " kg");
		System.out.println("O total de gramas é: " + gramas + " gr");
		

	}

}
