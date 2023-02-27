package pacotes;

import java.util.*;

public class ficha_1_ex_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float nota1, nota2, nota3;
		float media = 3;
		float resultado;
		String aluno;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Insira o seu nome: ");
		aluno = ler.nextLine();
		
		System.out.println("Insira a nota do primeiro período: ");
		nota1 = ler.nextFloat();
		
		System.out.println("Insira a nota do segundo período: ");
		nota2 = ler.nextFloat();
		
		System.out.println("Insira a nota do terceiro período: ");
		nota3 = ler.nextFloat();
		
		resultado = (nota1 + nota2 + nota3) / media;
		
		
		System.out.println("A média do aluno" + aluno + " é:" + resultado);
		
	}

}
