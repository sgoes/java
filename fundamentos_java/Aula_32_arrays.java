package pacotes;

import java.util.Scanner;

public class Aula_32_arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int numAlunos = 5;
		double[] notaAlunos = new double[numAlunos];
		
		for(int i = 0; i < numAlunos; ++i) {
			System.out.println("Introduza a nota do aluno: " + (i+1) + "� aluno."); // se n�o acrescentar 1 , aparece 0
			notaAlunos[i] = input.nextDouble(); // o i diz que � para armazenar a nota na posi��o 0 do array
		}
		for(int i = 0; i < numAlunos; ++i) {
			System.out.println("->" + notaAlunos[i]);
		}

	}

}
