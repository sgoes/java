package pacotes;

public class Aula_32_pt_4_arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		int[] x = new int[10];
		
		java.util.Arrays.fill(x,2,5,3); // Primeiro informa o vetor, depois indorma o primeiro membro onde começa a alterar, depois informa o intervalo que quer jogar o valor 3, ou seja, entre 2 e 5
		
		for(i = 0; i < x.length; ++i) {
			System.out.println(x[i]);
		}
	}

}
