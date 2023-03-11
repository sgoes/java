package pacotes;

import java.util.Scanner;

public class Aula_35_revisao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final int TOTAL_ALUNOS = 4;
		final int TOTAL_BIMESTRES = 4;
		final double NOTA_MINIMA = 70.0;
		
		Scanner input = new Scanner(System.in);
		String[] nomeAlunos = new String[TOTAL_ALUNOS];
		double[][] notaAlunos = new double[TOTAL_ALUNOS][TOTAL_BIMESTRES];
		double[] mediaAlunos = new double[TOTAL_ALUNOS]; 
		
		//obter nome dos alunos
		for(int i=0; i<TOTAL_ALUNOS; ++i) {
			System.out.println("Informe o nome do " + (i+1) + "º aluno" );
			nomeAlunos[i] = input.nextLine();
		}
		
	}

}
